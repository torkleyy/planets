package mainburg.planetenweg;

import com.google.android.gms.maps.model.LatLng;

/**
 * Created by Markus on 17.10.2017.
 */
public enum Waypoint {

    // I messed with the formatting here a bit to make it look better
    SUN     (new LatLng(48.642868,  11.786887)),
    MERCURY (new LatLng(48.64294,   11.787324)),
    VENUS   (new LatLng(48.64344,   11.787395)),
    EARTH   (new LatLng(48.64383,   11.7876215)),
    MARS    (new LatLng(48.644547,  11.788201)),
    JUPITER (new LatLng(48.64784,   11.793236)),
    SATURN  (new LatLng(48.651485,  11.799347)),
    URANUS  (new LatLng(48.645584,  11.787629)),
    NEPTUNE (new LatLng(48.641678,  11.78992));

    private final LatLng location;

    private Waypoint(LatLng location) {
        this.location = location;
    }

    public LatLng getLocation() {
        return location;
    }
}
