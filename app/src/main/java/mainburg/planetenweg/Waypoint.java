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
    ADDITIONAL_WAYPOINT_1(new LatLng(48.652075, 11.790295)),
    ADDITIONAL_WAYPOINT_2(new LatLng(48.648208, 11.790514)),
    ADDITIONAL_WAYPOINT_3(new LatLng(48.646834, 11.787418)),
    URANUS  (new LatLng(48.645584,  11.787629)),
    ADDITIONAL_WAYPOINT_4(new LatLng(48.642361, 11.783874)),
    ADDITIONAL_WAYPOINT_5(new LatLng(48.641190, 11.783766)),
    ADDITIONAL_WAYPOINT_6(new LatLng(48.641019, 11.786462)),
    ADDITIONAL_WAYPOINT_7(new LatLng(48.640039, 11.787952)),
    NEPTUNE (new LatLng(48.641678,  11.78992));

    private final LatLng location;

    private Waypoint(LatLng location) {
        this.location = location;
    }

    public LatLng getLocation() {
        return location;
    }
}
