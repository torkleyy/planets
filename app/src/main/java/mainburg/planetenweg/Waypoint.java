package mainburg.planetenweg;

import android.content.Context;

import com.google.android.gms.maps.model.LatLng;

/**
 * Created by Markus on 17.10.2017.
 */
public enum Waypoint {

    // I messed with the formatting here a bit to make it look better
    SUN     (48.642868,  11.786887,     R.string.name_sun),
    MERCURY (48.64294,   11.787324,     R.string.name_mercury),
    VENUS   (48.64344,   11.787395,     R.string.name_venus),
    EARTH   (48.64383,   11.7876215,    R.string.name_earth),
    MARS    (48.644547,  11.788201,     R.string.name_mars),
//    /**
//     * Last waypoint of route part 1
//     */
//    ADDITIONAL_WAYPOINT_1(48.647490, 11.790089),
//    //******************************
//    ADDITIONAL_WAYPOINT_2(48.647585, 11.790228),
    JUPITER (48.64784,   11.793236,     R.string.name_jupiter),
//    ADDITIONAL_WAYPOINT_3(48.649917, 11.799673),
    SATURN  (48.651485,  11.799347,     R.string.name_saturn),
//    ADDITIONAL_WAYPOINT_4(48.652075, 11.790295),
//    ADDITIONAL_WAYPOINT_5(48.648208, 11.790514),
//    /**
//     * Last waypoint of route part 2
//     */
//    ADDITIONAL_WAYPOINT_6(48.647171, 11.789447),
//    //******************************
//    ADDITIONAL_WAYPOINT_7(48.646602, 11.788680),
    URANUS  (48.645584,  11.787629,     R.string.name_uranus),
//    ADDITIONAL_WAYPOINT_8(48.642361, 11.783874),
//    ADDITIONAL_WAYPOINT_9(48.639520, 11.783750),
//    ADDITIONAL_WAYPOINT_10(48.641019, 11.786462),
//    ADDITIONAL_WAYPOINT_11(48.640039, 11.787952),
    NEPTUNE (48.641678,  11.78992,      R.string.name_neptune);

    private final LatLng location;
    private final int nameId;

    Waypoint(double lat, double lon, int nameId) {
        this.location = new LatLng(lat, lon);
        this.nameId = nameId;
    }
    Waypoint(double lat, double lon) {
        this.location = new LatLng(lat, lon);
        this.nameId = -1;
    }

    public LatLng getLocation() {
        return location;
    }

    /**
     * Returns the name of this Waypoint.
     * @param context The Context which holds the Resources. This is needed
     *                because only Resource ids are storaged in this class and
     *                the actual name has to be retrieved from the resources.
     */
    public String getName(Context context) {
        if (nameId == -1) {
            return toString();
        }
        return context.getResources().getString(nameId);
    }

    /**
     * Returns the Waypoint with the given name if it exists.
     * @param context Needed to access the actual name of a Waypoint
     */
    public static Waypoint fromName(String name, Context context) {
        if (name == null) {
            return null;
        }
        for (Waypoint w: values()) {
            if (name.equals(w.getName(context))) {
                return w;
            }
        }
        return null;
    }

//    public static LatLng[] getRoutePart1() {
//        LatLng[] value = new LatLng[6];
//        Waypoint[] all = values();
//        for (int i = 0; i < value.length; i++) {
//            value[i] = all[i].getLocation();
//        }
//        return value;
//    }
//    public static LatLng[] getRoutePart2() {
//        LatLng[] value = new LatLng[7];
//        Waypoint[] all = values();
//        for (int i = 0; i < value.length; i++) {
//            value[i] = all[i+6].getLocation();
//        }
//        return value;
//    }
//    public static LatLng[] getRoutePart3() {
//        LatLng[] value = new LatLng[7];
//        Waypoint[] all = values();
//        for (int i = 0; i < value.length; i++) {
//            value[i] = all[i+(all.length-value.length)].getLocation();
//        }
//        return value;
//    }

}
