package mainburg.planetenweg;

import android.content.pm.PackageManager;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

import org.json.JSONException;

import mainburg.planetenweg.directions.JsonData;

public class MapActivity extends FragmentActivity implements OnMapReadyCallback, GoogleMap.InfoWindowAdapter {
    private static final String TAG = MapActivity.class.getSimpleName();

    private LocationMarker locMarker;

    private static final String FIRST_TIME_LOAD_KEY = "mainburg.planetenweg.firstTimeLoad";
    private boolean firstTimeLoad = true;

    private View infoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        locMarker = new LocationMarker(this, savedInstanceState);

        if (savedInstanceState != null) {
            firstTimeLoad = savedInstanceState.getBoolean(FIRST_TIME_LOAD_KEY);
        }

        infoView = getLayoutInflater().inflate(R.layout.planets_info_window, null);
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(final GoogleMap googleMap) {
        if (firstTimeLoad) {
            LatLng mainburg = new LatLng(48.645, 11.792);
            googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(mainburg, 14.5f));
            firstTimeLoad = false;// I don't want the map to focus on Mainburg everytime the
            // activity reloads (e.g. when the user switches display rotation)
        }

        if (!locMarker.isEnabled()) {
            locMarker.enable(googleMap);
        }

        Waypoint[] all = Waypoint.values();
        final LatLng[] waypoints = new LatLng[all.length];
        for (int i = 0; i < waypoints.length; i++) {
            waypoints[i] = all[i].getLocation();

            Marker m = googleMap.addMarker(new MarkerOptions()
                    .title(all[i].getName(this))
                    .position(all[i].getLocation()));
            m.setIcon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory
                    .HUE_VIOLET));
        }

        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                try {
                    Drawing.drawPath(googleMap, JsonData.getRoutePart1(), JsonData.getRoutePart2(), JsonData.getRoutePart3());
                } catch (JSONException e) {
                    // Should not occur, but here you go:
                    Log.e(TAG, "Bug: stored JSON is invalid");
                }
            }
        });
        googleMap.setInfoWindowAdapter(this);
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putBoolean(FIRST_TIME_LOAD_KEY, firstTimeLoad);
        locMarker.onSaveInstanceState(outState);
    }

    @Override
    public void onRequestPermissionsResult(int requestCode,
                                           String permissions[],
                                           int[] grantResults) {
        if (permissions.length < 2) {
            return;
        }

        switch (requestCode) {
            case LocationMarker.GPS_PERMISSION_REQUEST_CODE:
                // If request is cancelled, the result arrays are empty.
                if (grantResults.length > 1
                        && grantResults[0] == PackageManager.PERMISSION_GRANTED
                        && grantResults[1] == PackageManager.PERMISSION_GRANTED) {
                    locMarker.refresh();
                }
                break;
        }
    }

    @Override
    public View getInfoWindow(Marker marker) {
        return null;
    }

    @Override
    public View getInfoContents(Marker marker) {
        Waypoint w = Waypoint.fromName(marker.getTitle(), this);
        if (w == null) {
            return null;
        }
        updateInfoView(w);
        return infoView;
    }
    private void updateInfoView(Waypoint w) {
        TextView title = (TextView) infoView.findViewById(R.id.planets_info_title);
        title.setText(w.getName(this));
        ImageView image = (ImageView) infoView.findViewById(R.id.planets_info_picture);
        TextView text = (TextView) infoView.findViewById(R.id.planets_info_text);

        switch (w) {

            case SUN:
                image.setImageResource(R.drawable.sun);
                text.setText(R.string.description_sun);
                break;
            case MERCURY:
                image.setImageResource(R.drawable.planet_mercury);
                text.setText(R.string.description_mercury);
                break;
            case VENUS:
                image.setImageResource(R.drawable.planet_venus);
                text.setText(R.string.description_venus);
                break;
            case EARTH:
                image.setImageResource(R.drawable.planet_earth);
                text.setText(R.string.description_earth);
                break;
            case MARS:
                image.setImageResource(R.drawable.planet_mars);
                text.setText(R.string.description_mars);
                break;
            case JUPITER:
                image.setImageResource(R.drawable.planet_jupiter);
                text.setText(R.string.description_jupiter);
                break;
            case SATURN:
                image.setImageResource(R.drawable.planet_saturn);
                text.setText(R.string.description_saturn);
                break;
            case URANUS:
                image.setImageResource(R.drawable.planet_uranus);
                text.setText(R.string.description_uranus);
                break;
            case NEPTUNE:
                image.setImageResource(R.drawable.planet_neptune);
                text.setText(R.string.description_neptune);
                break;
        }
    }
}
