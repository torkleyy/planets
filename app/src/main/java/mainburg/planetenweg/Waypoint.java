package mainburg.planetenweg;

import com.google.android.gms.maps.model.LatLng;

/**
 * Created by Markus on 17.10.2017.
 */
public enum Waypoint {
    // I messed with the formatting here a bit to make it look better
    SUN     (48.642868,  11.786887,     "Sonne"),
    MERCURY (48.64294,   11.787324,     "Merkur"),
    VENUS   (48.64344,   11.787395,     "Venus"),
    EARTH   (48.64383,   11.7876215,    "Erde"),
    MARS    (48.644547,  11.788201,     "Mars"),
    JUPITER (48.64784,   11.793236,     "Jupiter"),
//    ADDITIONAL_WAYPOINT_1(48.649917, 11.799673),
    SATURN  (48.651485,  11.799347,     "Saturn"),
//    ADDITIONAL_WAYPOINT_2(48.652075, 11.790295),
//    ADDITIONAL_WAYPOINT_3(48.648208, 11.790514),
//    /**
//     * This is the last waypoint of part 1 of the route
//     */
//    ADDITIONAL_WAYPOINT_4(48.647171, 11.789447),
//    /**
//     * This is the first waypoint of part 2 of the route
//     */
//    ADDITIONAL_WAYPOINT_5(48.646602, 11.788680),
    URANUS  (48.645584,  11.787629,     "Uranus"),
//    ADDITIONAL_WAYPOINT_6(48.642361, 11.783874),
//    ADDITIONAL_WAYPOINT_7(48.641190, 11.783766),
//    ADDITIONAL_WAYPOINT_8(48.639520, 11.783750),
//    ADDITIONAL_WAYPOINT_9(48.641019, 11.786462),
//    ADDITIONAL_WAYPOINT_10(48.640039, 11.787952),
    NEPTUNE (48.641678,  11.78992,      "Neptun");

    private final LatLng location;
    private final String name;

    Waypoint(double lat, double lon, String name) {
        this.location = new LatLng(lat, lon);
        this.name = name;
    }

    public LatLng getLocation() {
        return location;
    }
    public String getName() {
        return name;
    }

    public static Waypoint fromName(String name) {
        if (name == null) {
            return null;
        }
        for (Waypoint w: values()) {
            if (name.equals(w.getName())) {
                return w;
            }
        }
        return null;
    }

//    public static LatLng[] getRoutePart1() {
//        LatLng[] value = new LatLng[11];
//        Waypoint[] all = values();
//        for (int i = 0; i < value.length; i++) {
//            value[i] = all[i].getLocation();
//        }
//        return value;
//    }
//    public static LatLng[] getRoutePart2() {
//        LatLng[] value = new LatLng[8];
//        Waypoint[] all = values();
//        for (int i = 0; i < value.length; i++) {
//            value[i] = all[i+(all.length-value.length)].getLocation();
//        }
//        return value;
//    }

}
