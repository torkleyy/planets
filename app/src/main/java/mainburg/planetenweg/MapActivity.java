package mainburg.planetenweg;

import android.*;
import android.Manifest;
import android.content.Context;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import android.support.v4.content.ContextCompat;
import android.widget.Toast;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapActivity extends FragmentActivity implements OnMapReadyCallback, LocationListener {

    private GoogleMap mMap;

    private LocationManager gps;
    private Marker position;
    private final int GPS_PERMISSION_REQUEST_CODE = 1227;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
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
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        //LatLng sydney = new LatLng(-34, 151);
        //mMap.addMarker(new MarkerOptions().position(sydney).title("Marker in Sydney"));
        //mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));

        //Fuck Sydney, we're in Germany!
        LatLng mainburg = new LatLng(48.64, 11.78);
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(mainburg, 14.5f));

        if (ContextCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION)
                == PackageManager.PERMISSION_GRANTED) {
            enableGPSFunctionality();
        } else {
            ActivityCompat.requestPermissions(this, new String[] {
                    Manifest.permission.ACCESS_FINE_LOCATION
            },GPS_PERMISSION_REQUEST_CODE);
        }

    }

    /**
     * Only call this when it is ensured you have the appropriate permission
     */
    private void enableGPSFunctionality() {
        gps = (LocationManager) getSystemService(Context.LOCATION_SERVICE);
        gps.requestLocationUpdates(
                LocationManager.GPS_PROVIDER,
                10000, //the minimum time interval for notifications, in milliseconds. This field is only used as a hint
                //to conserve power, and actual time between location, updates may be greater or lesser than this value. (See https://androidexample.com/GPS_Basic__-__Android_Example/index.php?view=article_discription&aid=68&aaid=93)
                10,//the minimum distance interval for notifications
                this);//The listener to which to send the updates
    }

    /************* Called after each 10 sec **********/
    @Override
    public void onLocationChanged(Location location) {
        if (position != null) {
            position.remove();
        }

        LatLng loc = new LatLng(location.getLatitude(), location.getLongitude());
        position = mMap.addMarker(new MarkerOptions()
                .position(loc)
                .title("Sie sind hier."));

        mMap.moveCamera(CameraUpdateFactory.newLatLng(loc));
    }

    @Override
    public void onProviderDisabled(String provider) {

        /******** Called when User disables Gps *********/
        Toast.makeText(getBaseContext(), "GPS deaktiviert", Toast.LENGTH_LONG).show();

        if (position != null) {
            position.remove();
        }
    }

    @Override
    public void onProviderEnabled(String provider) {

        /******** Called when User enables Gps  *********/

        Toast.makeText(getBaseContext(), "GPS aktiviert", Toast.LENGTH_LONG).show();
    }

    @Override
    public void onStatusChanged(String provider, int status, Bundle extras) {
    }

    @Override
    public void onRequestPermissionsResult(int requestCode,
                                           String permissions[], int[] grantResults) {
        switch (requestCode) {
            case GPS_PERMISSION_REQUEST_CODE:
                // If request is cancelled, the result arrays are empty.
                if (grantResults.length > 0
                        && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    enableGPSFunctionality();

                }
                return;
        }
    }
}
