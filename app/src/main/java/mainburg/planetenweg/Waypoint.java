package mainburg.planetenweg;

import com.google.android.gms.maps.model.LatLng;

/**
 * Created by Markus on 17.10.2017.
 */
public enum Waypoint {
    // I messed with the formatting here a bit to make it look better
    SUN     (48.642868,  11.786887),
    MERCURY (48.64294,   11.787324),
    VENUS   (48.64344,   11.787395),
    EARTH   (48.64383,   11.7876215),
    MARS    (48.644547,  11.788201),
    JUPITER (48.64784,   11.793236),
    SATURN  (48.651485,  11.799347),
    ADDITIONAL_WAYPOINT_1(48.652075, 11.790295),
    ADDITIONAL_WAYPOINT_2(48.648208, 11.790514),
    ADDITIONAL_WAYPOINT_3(48.646834, 11.787418),
    URANUS  (48.645584,  11.787629),
    ADDITIONAL_WAYPOINT_4(48.642361, 11.783874),
    ADDITIONAL_WAYPOINT_5(48.641190, 11.783766),
    ADDITIONAL_WAYPOINT_6(48.641019, 11.786462),
    ADDITIONAL_WAYPOINT_7(48.640039, 11.787952),
    NEPTUNE (48.641678,  11.78992);

    private final LatLng location;

    Waypoint(double lat, double lon) {
        this.location = new LatLng(lat, lon);
    }

    public LatLng getLocation() {
        return location;
    }
}
