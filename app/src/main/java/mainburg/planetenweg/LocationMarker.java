package mainburg.planetenweg;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.util.Log;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.*;
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
    private static final String TAG = LocationMarker.class.getSimpleName();
    private static final int MIN_UPDATE_DELAY = 3000;
    private static final int MIN_DISTANCE_FOR_UPDATE = 5;
    private static final int UNSUCCESSFUL_TRACK_DELAY = 10000;

    static final int GPS_PERMISSION_REQUEST_CODE = 1227;

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

    private static final String TRACK_LOCATION_KEY = "trackLocation";
    private boolean trackLocation;

    private static final String GPS_DISABLED_KEY = "gpsDisabled";
    private boolean disabledGPSKnown;
    /**
     * This variable counts the amount of timers which delay the message that your location
     * could not have been determined which are simultaneously running.
     */
    private int timersUnderway;

    public LocationMarker(Activity activity, Bundle savedInstanceState) {
        this.map = map;
        this.activity = activity;
        enabled = false;
        gps = (LocationManager) activity.getSystemService(Context.LOCATION_SERVICE);
        timersUnderway = 0;

        if (savedInstanceState != null) {
            trackLocation = savedInstanceState.getBoolean(TRACK_LOCATION_KEY);
            disabledGPSKnown = savedInstanceState.getBoolean(GPS_DISABLED_KEY);
        } else {
            trackLocation = true;
            disabledGPSKnown = false;
        }
    }

    /**
     * Enables the Location Marker
     *
     * @param map The GoogleMap on which to place the marker
     */
    public void enable(GoogleMap map) {
        this.map = map;
        enabled = true;
        if (ContextCompat.checkSelfPermission(activity, android.Manifest.permission
                .ACCESS_FINE_LOCATION)
                == PackageManager.PERMISSION_GRANTED) {
            refresh();
        } else {
            ActivityCompat.requestPermissions(activity, new String[]{
                    android.Manifest.permission.ACCESS_FINE_LOCATION
            }, GPS_PERMISSION_REQUEST_CODE);
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

    @SuppressLint("MissingPermission")
    public void refresh() {
        if (checkPermissions()) {
            gps.requestLocationUpdates(
                    LocationManager.GPS_PROVIDER,
                    MIN_UPDATE_DELAY,
                    MIN_DISTANCE_FOR_UPDATE,
                    this);

            displayUnsuccessfulTracking();
        } else {
            Log.w(TAG, "Missing permissions to perform GPS action");
        }
    }

    private boolean checkPermissions() {
        return
                ActivityCompat.checkSelfPermission(
                        activity,
                        android.Manifest.permission.ACCESS_FINE_LOCATION
                ) == PackageManager.PERMISSION_GRANTED &&
                        ActivityCompat.checkSelfPermission(
                                activity,
                                android.Manifest.permission.ACCESS_COARSE_LOCATION
                        ) ==
                                PackageManager.PERMISSION_GRANTED;
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
                            Toast.makeText(activity, activity.getResources().getString(R.string
                                    .position_not_found), Toast.LENGTH_LONG).show();
                        }
                    });
                }
            }
        }, UNSUCCESSFUL_TRACK_DELAY);
    }

    @Override
    public void onLocationChanged(Location location) {
        Log.i(TAG, "Location changed");

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

        if (trackLocation) {
            trackLocation = false;// I decided to make it track you the first time your position was determined.
            map.moveCamera(CameraUpdateFactory.newLatLngZoom(loc, map.getCameraPosition().zoom));
        }
    }

    @Override
    public void onProviderDisabled(String provider) {
        /* ******* Called when User disables Gps ******** */

        if (!disabledGPSKnown) {
            Toast.makeText(activity.getBaseContext(), activity.getResources().getString(R.string
                    .gps_disabled), Toast.LENGTH_LONG).show();
        }
        disabledGPSKnown = true;

        if (position != null) {
            position.remove();
        }

        locationFound = true;// Nothing left to find in this case ;)
    }

    @Override
    public void onProviderEnabled(String provider) {
        /* ******* Called when User enables Gps  ******** */

        disabledGPSKnown = false;
        Toast.makeText(activity.getBaseContext(), activity.getResources().getString(R.string
                .gps_enabled), Toast.LENGTH_LONG).show();
        refresh();

    }

    @Override
    public void onStatusChanged(String provider, int status, Bundle extras) {
    }

    void onSaveInstanceState(Bundle outState) {
        outState.putBoolean(TRACK_LOCATION_KEY, trackLocation);
        outState.putBoolean(GPS_DISABLED_KEY, disabledGPSKnown);
    }
}
