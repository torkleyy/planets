//package mainburg.planetenweg.directions;
//
//import android.app.Activity;
//import android.graphics.Color;
//import android.util.Log;
//
//import com.google.android.gms.maps.GoogleMap;
//import com.google.android.gms.maps.model.LatLng;
//import com.google.android.gms.maps.model.Polyline;
//import com.google.android.gms.maps.model.PolylineOptions;
//import org.json.JSONArray;
//import org.json.JSONException;
//import org.json.JSONObject;
//
//import java.io.UnsupportedEncodingException;
//import java.net.URLEncoder;
//import java.util.ArrayList;
//import java.util.List;
//
///**
// * Created by Markus on 24.10.2017.
// */
//public class PathRequest extends Thread {
//    private static final String TAG = PathRequest.class.getSimpleName();
//
//    private final Activity activity;
//    private final LatLng[] waypoints;
//    private final GoogleMap map;
//
//    public PathRequest(LatLng[] waypoints, GoogleMap map, final Activity activity) {
//        this.activity = activity;
//        this.waypoints = waypoints;
//        this.map = map;
//    }
//
//    @Override
//    public void run() {
//        JsonData parser = new JsonData();
//        String url = makeURL(waypoints);
//        Log.d(TAG, "Request URL: " + url);
//        final String json = parser.getData(url);
//        activity.runOnUiThread(new Runnable() {
//            @Override
//            public void run() {
//                try {
//                    drawPath(json);
//                } catch (JSONException e) {
//                    e.printStackTrace();
//                }
//            }
//        });
//    }
//
//    private String makeURL(LatLng[] waypoints) {
//        try {
//            StringBuilder urlString = new StringBuilder();
//            urlString.append("https://maps.googleapis.com/maps/api/directions/json");
//            urlString.append("?origin=");// from
//            urlString.append(Double.toString(waypoints[0].latitude));
//            urlString.append(",");
//            urlString.append(Double.toString(waypoints[0].longitude));
//
//            for (int i = 1; i < waypoints.length - 1; i++) {
//                if (i == 1) {
//                    urlString.append("&waypoints=");
//                } else {
//                    urlString.append(URLEncoder.encode("|", "UTF-8"));
//                }
//                urlString.append(Double.toString(waypoints[i].latitude));
//                urlString.append(",");
//                urlString.append(Double.toString(waypoints[i].longitude));
//            }
//
//            urlString.append("&destination=");// to
//            urlString
//                    .append(Double.toString(waypoints[waypoints.length - 1].latitude));
//            urlString.append(",");
//            urlString.append(Double.toString(waypoints[waypoints.length - 1].longitude));
//            urlString.append("&sensor=false&mode=walking");
//            urlString.append("&key=AIzaSyCmPIFTlPKolQVgLNnQh8TseBzW9FAD8ig");
//            return urlString.toString();
//
//        } catch (UnsupportedEncodingException e) {
//            e.printStackTrace();
//            return null;
//        }
//    }
//
//    public void drawPath(String result) throws JSONException {
//        for (String line: result.split("\n")) {
//            Log.v(TAG, result);
//        }
//
//
//        //Tranform the string into a json object
//        final JSONObject json = new JSONObject(result);
//        JSONArray routeArray = json.getJSONArray("routes");
//        JSONObject routes = routeArray.getJSONObject(0);
//        JSONObject overviewPolylines = routes.getJSONObject("overview_polyline");
//        String encodedString = overviewPolylines.getString("points");
//        List<LatLng> list = decodePoly(encodedString);
//        Polyline line = map.addPolyline(new PolylineOptions()
//                .addAll(list)
//                .width(12)
//                .color(Color.parseColor("#05b1fb"))//Google maps blue color
//                .geodesic(true)
//        );
//               /*
//               for(int z = 0; z<list.size()-1;z++){
//                    LatLng src= list.get(z);
//                    LatLng dest= list.get(z+1);
//                    Polyline line = mMap.addPolyline(new PolylineOptions()
//                    .add(new LatLng(src.latitude, src.longitude), new LatLng(dest.latitude,   dest.longitude))
//                    .width(2)
//                    .color(Color.BLUE).geodesic(true));
//                }
//               */
//    }
//
//    private List<LatLng> decodePoly(String encoded) {
//
//        List<LatLng> poly = new ArrayList<LatLng>();
//        int index = 0, len = encoded.length();
//        int lat = 0, lng = 0;
//
//        while (index < len) {
//            int b, shift = 0, result = 0;
//            do {
//                b = encoded.charAt(index++) - 63;
//                result |= (b & 0x1f) << shift;
//                shift += 5;
//            } while (b >= 0x20);
//            int dlat = ((result & 1) != 0 ? ~(result >> 1) : (result >> 1));
//            lat += dlat;
//
//            shift = 0;
//            result = 0;
//            do {
//                b = encoded.charAt(index++) - 63;
//                result |= (b & 0x1f) << shift;
//                shift += 5;
//            } while (b >= 0x20);
//            int dlng = ((result & 1) != 0 ? ~(result >> 1) : (result >> 1));
//            lng += dlng;
//
//            LatLng p = new LatLng((((double) lat / 1E5)),
//                    (((double) lng / 1E5)));
//            poly.add(p);
//        }
//
//        return poly;
//    }
//
//}
