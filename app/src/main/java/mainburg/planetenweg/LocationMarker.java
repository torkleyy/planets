package mainburg.planetenweg;

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
import com.google.android.gms.maps.model.*;

import java.util.Timer;
import java.util.TimerTask;

/**
 * The LocationMarker places a marker on your current location and
 * updates it after a certain interval.
 * Created by Markus on 04.10.2017.
 */
public class LocationMarker implements LocationListener {

    static final int GPS_PERMISSION_REQUEST_CODE = 1227;

    private final int MIN_UPDATE_DELAY = 5000;
    private final int MIN_DISTANCE_FOR_UPDATE = 5;
    private final int UNSUCCESSFUL_TRACK_DELAY = 10000;

    private GoogleMap map;
    private final Activity activity;
    private final LocationManager gps;
    private Marker position;
    private boolean enabled;

    /**
     * This variable indicates whether or not a location has been found.
     * It is needed to notify the user when their location could not have been determined.
     */
    private boolean locationFound;
    /**
     * This variable counts the amount of timers which delay the message that your location
     * could not have been determined which are simultaneously running.
     */
    private int timersUnderway;

    public LocationMarker(Activity activity) {
        this.map = map;
        this.activity = activity;
        enabled = false;
        gps = (LocationManager) activity.getSystemService(Context.LOCATION_SERVICE);
        timersUnderway = 0;
    }

    /**
     * Enables the Location Marker
     * @param map The GoogleMap on which to place the marker
     */
    public void enable(GoogleMap map) {
        this.map = map;
        enabled = true;
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
        enabled = false;
    }

    public boolean isEnabled() {
        return enabled;
    }

    /**
     * Sends a new request to determine the user's location.
     * Make sure you have the required GPS permissions before calling this method.
     */
    public void refresh() {
        gps.requestLocationUpdates(
                LocationManager.GPS_PROVIDER,
                MIN_UPDATE_DELAY,
                MIN_DISTANCE_FOR_UPDATE,
                this);

        displayUnsuccessfulTracking();
    }

    private void displayUnsuccessfulTracking() {
        locationFound = false;
        timersUnderway++;
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                timersUnderway--;
                if (!locationFound && enabled && timersUnderway < 1) {
                    activity.runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            Toast.makeText(activity, activity.getResources().getString(R.string.position_not_found), Toast.LENGTH_LONG).show();
                        }
                    });
                }
            }
        }, UNSUCCESSFUL_TRACK_DELAY);
    }

    @Override
    public void onLocationChanged(Location location) {
        if (!enabled) {
            return;
        }
        locationFound = true;
        if (position != null) {
            position.remove();
        }

        LatLng loc = new LatLng(location.getLatitude(), location.getLongitude());
        position = map.addMarker(new MarkerOptions()
                .position(loc)
                .title(activity.getResources().getString(R.string.your_location)));
        position.setIcon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN));

        map.moveCamera(CameraUpdateFactory.newLatLngZoom(loc, map.getCameraPosition().zoom));
    }

    @Override
    public void onProviderDisabled(String provider) {

        /******** Called when User disables Gps *********/
        Toast.makeText(activity.getBaseContext(), activity.getResources().getString(R.string.gps_disabled), Toast.LENGTH_LONG).show();

        if (position != null) {
            position.remove();
        }
    }

    @Override
    public void onProviderEnabled(String provider) {

        /******** Called when User enables Gps  *********/

        Toast.makeText(activity.getBaseContext(), activity.getResources().getString(R.string.gps_enabled), Toast.LENGTH_LONG).show();
        refresh();
    }

    @Override
    public void onStatusChanged(String provider, int status, Bundle extras) {
    }

}
