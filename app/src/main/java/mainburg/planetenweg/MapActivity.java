package mainburg.planetenweg;

import android.content.pm.PackageManager;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.util.Log;

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

public class MapActivity extends FragmentActivity implements OnMapReadyCallback {
    private static final String TAG = MapActivity.class.getSimpleName();

    private LocationMarker locMarker;
    private boolean firstTimeLoad = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        locMarker = new LocationMarker(this);
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
            LatLng mainburg = new LatLng(48.64, 11.78);
            googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(mainburg, 14.5f));
            firstTimeLoad = false;// I don't want the map to focus on Mainburg everytime the
            // activity reloads (e.g. when the user switches display rotation)

            if (!locMarker.isEnabled()) {
                locMarker.enable(googleMap);
            }

            Waypoint[] all = Waypoint.values();
            final LatLng[] waypoints = new LatLng[all.length];
            for (int i = 0; i < waypoints.length; i++) {
                waypoints[i] = all[i].getLocation();
                if (all[i].toString().startsWith("ADDITIONAL_WAYPOINT")) {
                    continue;
                }

                Marker m = googleMap.addMarker(new MarkerOptions()
                        .title(all[i].toString())
                        .position(all[i].getLocation()));
                m.setIcon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory
                        .HUE_VIOLET));
            }

            runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    try {
                        Drawing.drawPath(JsonData.getData(), googleMap);
                    } catch (JSONException e) {
                        // Should not occur, but here you go:
                        Log.e(TAG, "Bug: stored JSON is invalid");
                    }
                }
            });
        }
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
}
