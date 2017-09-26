package mainburg.planetenweg;

import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

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
        LatLng sydney = new LatLng(-34, 151);
        mMap.addMarker(new MarkerOptions().position(sydney).title("Marker in Sydney"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));

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

        String str = "Latitude: "+location.getLatitude()+"Longitude: "+location.getLongitude();

        Toast.makeText(getBaseContext(), str, Toast.LENGTH_LONG).show();

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
}
