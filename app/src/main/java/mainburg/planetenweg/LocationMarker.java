package mainburg.planetenweg;

import android.*;
import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.widget.Toast;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.Timer;
import java.util.TimerTask;

/**
 * The LocationMarker places a marker on your current location and
 * updates it after a certain interval.
 * Created by Markus on 04.10.2017.
 */
public class LocationMarker implements LocationListener {

    private GoogleMap map;
    private final Activity activity;
    private final LocationManager gps;
    private Marker position;
    static final int GPS_PERMISSION_REQUEST_CODE = 1227;

    private boolean active;

    /**
     * This variable indicates whether or not a location has been founb.
     * It is needed to notify the user when his location could not have been determined.
     */
    private boolean locationFound;

    public LocationMarker(Activity activity) {
        this.map = map;
        this.activity = activity;
        active = false;
        gps = (LocationManager) activity.getSystemService(Context.LOCATION_SERVICE);
    }

    /**
     * Enables the Location Marker
     * @param map The GoogleMap on which to place the marker
     */
    public void enable(GoogleMap map) {
        this.map = map;
        active = true;
        if (ContextCompat.checkSelfPermission(activity, android.Manifest.permission.ACCESS_FINE_LOCATION)
                == PackageManager.PERMISSION_GRANTED) {
            refresh();
        } else {
            ActivityCompat.requestPermissions(activity, new String[] {
                    android.Manifest.permission.ACCESS_FINE_LOCATION
            },GPS_PERMISSION_REQUEST_CODE);
        }
    }
    /**
     * Disables the Location Marker
     */
    public void disable() {
        position.remove();
        active = false;
    }

    public boolean isEnabled() {
        return active;
    }

    /**
     * Sends a new request to determine the user's location.
     * Make sure you have the required GPS permissions before calling this method.
     */
    public void refresh() {
        gps.requestLocationUpdates(
                LocationManager.GPS_PROVIDER,
                5000, //the minimum time interval for notifications, in milliseconds. This field is only used as a hint
                //to conserve power, and actual time between location, updates may be greater or lesser than this value. (See https://androidexample.com/GPS_Basic__-__Android_Example/index.php?view=article_discription&aid=68&aaid=93)
                5,//the minimum distance interval for notifications
                this);//The listener to which to send the updates

        locationFound = false;
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                if (!locationFound) {
                    Toast.makeText(activity, "Position konnte nicht ermittelt werden.", Toast.LENGTH_LONG);
                }
            }
        }, 10000);

    }

    /************* Called after each 10 sec **********/
    @Override
    public void onLocationChanged(Location location) {
        if (!active) {
            return;
        }
        locationFound = true;
        if (position != null) {
            position.remove();
        }

        LatLng loc = new LatLng(location.getLatitude(), location.getLongitude());
        position = map.addMarker(new MarkerOptions()
                .position(loc)
                .title("Sie sind hier."));

        map.moveCamera(CameraUpdateFactory.newLatLngZoom(loc, map.getCameraPosition().zoom));
    }

    @Override
    public void onProviderDisabled(String provider) {

        /******** Called when User disables Gps *********/
        Toast.makeText(activity.getBaseContext(), "GPS deaktiviert", Toast.LENGTH_LONG).show();

        if (position != null) {
            position.remove();
        }
    }

    @Override
    public void onProviderEnabled(String provider) {

        /******** Called when User enables Gps  *********/

        Toast.makeText(activity.getBaseContext(), "GPS aktiviert", Toast.LENGTH_LONG).show();
    }

    @Override
    public void onStatusChanged(String provider, int status, Bundle extras) {
    }

}
