package mainburg.planetenweg.directions;

import android.util.Log;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.json.JSONObject;

import java.io.*;

/**
 * Class which returns a somewhat tiny string.
 */
public final class JsonData {
    private JsonData() {
    }

    public static String getRoutePart1() {
        return "{\n" +
                "   \"geocoded_waypoints\" : [\n" +
                "      {\n" +
                "         \"geocoder_status\" : \"OK\",\n" +
                "         \"place_id\" : \"ChIJsZHuQx9JnkcRpouBqoJ_x0c\",\n" +
                "         \"types\" : [ \"street_address\" ]\n" +
                "      },\n" +
                "      {\n" +
                "         \"geocoder_status\" : \"OK\",\n" +
                "         \"place_id\" : \"EjNBYmVuc2JlcmdlciBTdHIuIDEwLTEyLCA4NDA0OCBNYWluYnVyZywgRGV1dHNjaGxhbmQ\",\n" +
                "         \"types\" : [ \"street_address\" ]\n" +
                "      },\n" +
                "      {\n" +
                "         \"geocoder_status\" : \"OK\",\n" +
                "         \"place_id\" : \"ChIJGa1ySR9JnkcRomUDuznL_qY\",\n" +
                "         \"types\" : [ \"street_address\" ]\n" +
                "      },\n" +
                "      {\n" +
                "         \"geocoder_status\" : \"OK\",\n" +
                "         \"place_id\" : \"ChIJzw96Sh9JnkcRHwDggfDYXpE\",\n" +
                "         \"types\" : [ \"street_address\" ]\n" +
                "      },\n" +
                "      {\n" +
                "         \"geocoder_status\" : \"OK\",\n" +
                "         \"place_id\" : \"EjFLw7ZnbG3DvGxsZXJ3ZWcgOC0xMCwgODQwNDggTWFpbmJ1cmcsIERldXRzY2hsYW5k\",\n" +
                "         \"types\" : [ \"street_address\" ]\n" +
                "      },\n" +
                "      {\n" +
                "         \"geocoder_status\" : \"OK\",\n" +
                "         \"place_id\" : \"ChIJkcmL5BlJnkcRIPh6Gy8qDAo\",\n" +
                "         \"types\" : [ \"street_address\" ]\n" +
                "      },\n" +
                "      {\n" +
                "         \"geocoder_status\" : \"OK\",\n" +
                "         \"place_id\" : \"ChIJLUuEKhFJnkcRGstgQGz6ioI\",\n" +
                "         \"types\" : [ \"street_address\" ]\n" +
                "      },\n" +
                "      {\n" +
                "         \"geocoder_status\" : \"OK\",\n" +
                "         \"place_id\" : \"ChIJ4z7GnxdJnkcR18VwGdM7QMw\",\n" +
                "         \"types\" : [ \"route\" ]\n" +
                "      },\n" +
                "      {\n" +
                "         \"geocoder_status\" : \"OK\",\n" +
                "         \"place_id\" : \"ChIJ4z7GnxdJnkcR1sVwGdM7QMw\",\n" +
                "         \"types\" : [ \"route\" ]\n" +
                "      },\n" +
                "      {\n" +
                "         \"geocoder_status\" : \"OK\",\n" +
                "         \"place_id\" : \"ChIJ_Zc0PxhJnkcRpN1jbDzdhGY\",\n" +
                "         \"types\" : [ \"route\" ]\n" +
                "      }\n" +
                "   ],\n" +
                "   \"routes\" : [\n" +
                "      {\n" +
                "         \"bounds\" : {\n" +
                "            \"northeast\" : {\n" +
                "               \"lat\" : 48.6521724,\n" +
                "               \"lng\" : 11.7993728\n" +
                "            },\n" +
                "            \"southwest\" : {\n" +
                "               \"lat\" : 48.64271069999999,\n" +
                "               \"lng\" : 11.7868552\n" +
                "            }\n" +
                "         },\n" +
                "         \"copyrights\" : \"Kartendaten © 2017 GeoBasis-DE/BKG (©2009), Google\",\n" +
                "         \"legs\" : [\n" +
                "            {\n" +
                "               \"distance\" : {\n" +
                "                  \"text\" : \"59 m\",\n" +
                "                  \"value\" : 59\n" +
                "               },\n" +
                "               \"duration\" : {\n" +
                "                  \"text\" : \"1 Minute\",\n" +
                "                  \"value\" : 45\n" +
                "               },\n" +
                "               \"end_address\" : \"Abensberger Str. 10-12, 84048 Mainburg, Deutschland\",\n" +
                "               \"end_location\" : {\n" +
                "                  \"lat\" : 48.6429398,\n" +
                "                  \"lng\" : 11.7872956\n" +
                "               },\n" +
                "               \"start_address\" : \"Abensberger Str. 15, 84048 Mainburg, Deutschland\",\n" +
                "               \"start_location\" : {\n" +
                "                  \"lat\" : 48.64278909999999,\n" +
                "                  \"lng\" : 11.7868552\n" +
                "               },\n" +
                "               \"steps\" : [\n" +
                "                  {\n" +
                "                     \"distance\" : {\n" +
                "                        \"text\" : \"34 m\",\n" +
                "                        \"value\" : 34\n" +
                "                     },\n" +
                "                     \"duration\" : {\n" +
                "                        \"text\" : \"1 Minute\",\n" +
                "                        \"value\" : 27\n" +
                "                     },\n" +
                "                     \"end_location\" : {\n" +
                "                        \"lat\" : 48.64271069999999,\n" +
                "                        \"lng\" : 11.7873001\n" +
                "                     },\n" +
                "                     \"html_instructions\" : \"Nach \\u003cb\\u003eOsten\\u003c/b\\u003e Richtung \\u003cb\\u003eAbensberger Str.\\u003c/b\\u003e\\u003cdiv style=\\\"font-size:0.9em\\\"\\u003eFür den öffentlichen Durchgang gesperrte Straße\\u003c/div\\u003e\",\n" +
                "                     \"polyline\" : {\n" +
                "                        \"points\" : \"mp{gH{b}fANwA\"\n" +
                "                     },\n" +
                "                     \"start_location\" : {\n" +
                "                        \"lat\" : 48.64278909999999,\n" +
                "                        \"lng\" : 11.7868552\n" +
                "                     },\n" +
                "                     \"travel_mode\" : \"WALKING\"\n" +
                "                  },\n" +
                "                  {\n" +
                "                     \"distance\" : {\n" +
                "                        \"text\" : \"25 m\",\n" +
                "                        \"value\" : 25\n" +
                "                     },\n" +
                "                     \"duration\" : {\n" +
                "                        \"text\" : \"1 Minute\",\n" +
                "                        \"value\" : 18\n" +
                "                     },\n" +
                "                     \"end_location\" : {\n" +
                "                        \"lat\" : 48.6429398,\n" +
                "                        \"lng\" : 11.7872956\n" +
                "                     },\n" +
                "                     \"html_instructions\" : \"\\u003cb\\u003eLinks\\u003c/b\\u003e abbiegen auf \\u003cb\\u003eAbensberger Str.\\u003c/b\\u003e\\u003cdiv style=\\\"font-size:0.9em\\\"\\u003eDas Ziel befindet sich auf der rechten Seite.\\u003c/div\\u003e\",\n" +
                "                     \"maneuver\" : \"turn-left\",\n" +
                "                     \"polyline\" : {\n" +
                "                        \"points\" : \"}o{gHse}fAm@?\"\n" +
                "                     },\n" +
                "                     \"start_location\" : {\n" +
                "                        \"lat\" : 48.64271069999999,\n" +
                "                        \"lng\" : 11.7873001\n" +
                "                     },\n" +
                "                     \"travel_mode\" : \"WALKING\"\n" +
                "                  }\n" +
                "               ],\n" +
                "               \"traffic_speed_entry\" : [],\n" +
                "               \"via_waypoint\" : []\n" +
                "            },\n" +
                "            {\n" +
                "               \"distance\" : {\n" +
                "                  \"text\" : \"56 m\",\n" +
                "                  \"value\" : 56\n" +
                "               },\n" +
                "               \"duration\" : {\n" +
                "                  \"text\" : \"1 Minute\",\n" +
                "                  \"value\" : 37\n" +
                "               },\n" +
                "               \"end_address\" : \"Abensberger Str. 25C, 84048 Mainburg, Deutschland\",\n" +
                "               \"end_location\" : {\n" +
                "                  \"lat\" : 48.6434401,\n" +
                "                  \"lng\" : 11.7872857\n" +
                "               },\n" +
                "               \"start_address\" : \"Abensberger Str. 10-12, 84048 Mainburg, Deutschland\",\n" +
                "               \"start_location\" : {\n" +
                "                  \"lat\" : 48.6429398,\n" +
                "                  \"lng\" : 11.7872956\n" +
                "               },\n" +
                "               \"steps\" : [\n" +
                "                  {\n" +
                "                     \"distance\" : {\n" +
                "                        \"text\" : \"56 m\",\n" +
                "                        \"value\" : 56\n" +
                "                     },\n" +
                "                     \"duration\" : {\n" +
                "                        \"text\" : \"1 Minute\",\n" +
                "                        \"value\" : 37\n" +
                "                     },\n" +
                "                     \"end_location\" : {\n" +
                "                        \"lat\" : 48.6434401,\n" +
                "                        \"lng\" : 11.7872857\n" +
                "                     },\n" +
                "                     \"html_instructions\" : \"Auf \\u003cb\\u003eAbensberger Str.\\u003c/b\\u003e nach \\u003cb\\u003eNorden\\u003c/b\\u003e Richtung \\u003cb\\u003eKöglmüllerweg\\u003c/b\\u003e\",\n" +
                "                     \"polyline\" : {\n" +
                "                        \"points\" : \"kq{gHse}fAcB@\"\n" +
                "                     },\n" +
                "                     \"start_location\" : {\n" +
                "                        \"lat\" : 48.6429398,\n" +
                "                        \"lng\" : 11.7872956\n" +
                "                     },\n" +
                "                     \"travel_mode\" : \"WALKING\"\n" +
                "                  }\n" +
                "               ],\n" +
                "               \"traffic_speed_entry\" : [],\n" +
                "               \"via_waypoint\" : []\n" +
                "            },\n" +
                "            {\n" +
                "               \"distance\" : {\n" +
                "                  \"text\" : \"52 m\",\n" +
                "                  \"value\" : 52\n" +
                "               },\n" +
                "               \"duration\" : {\n" +
                "                  \"text\" : \"1 Minute\",\n" +
                "                  \"value\" : 42\n" +
                "               },\n" +
                "               \"end_address\" : \"Köglmüllerweg 1, 84048 Mainburg, Deutschland\",\n" +
                "               \"end_location\" : {\n" +
                "                  \"lat\" : 48.643812,\n" +
                "                  \"lng\" : 11.7876501\n" +
                "               },\n" +
                "               \"start_address\" : \"Abensberger Str. 25C, 84048 Mainburg, Deutschland\",\n" +
                "               \"start_location\" : {\n" +
                "                  \"lat\" : 48.6434401,\n" +
                "                  \"lng\" : 11.7872857\n" +
                "               },\n" +
                "               \"steps\" : [\n" +
                "                  {\n" +
                "                     \"distance\" : {\n" +
                "                        \"text\" : \"15 m\",\n" +
                "                        \"value\" : 15\n" +
                "                     },\n" +
                "                     \"duration\" : {\n" +
                "                        \"text\" : \"1 Minute\",\n" +
                "                        \"value\" : 10\n" +
                "                     },\n" +
                "                     \"end_location\" : {\n" +
                "                        \"lat\" : 48.6435775,\n" +
                "                        \"lng\" : 11.7872861\n" +
                "                     },\n" +
                "                     \"html_instructions\" : \"Auf \\u003cb\\u003eAbensberger Str.\\u003c/b\\u003e nach \\u003cb\\u003eNorden\\u003c/b\\u003e Richtung \\u003cb\\u003eKöglmüllerweg\\u003c/b\\u003e\",\n" +
                "                     \"polyline\" : {\n" +
                "                        \"points\" : \"ot{gHqe}fA[?\"\n" +
                "                     },\n" +
                "                     \"start_location\" : {\n" +
                "                        \"lat\" : 48.6434401,\n" +
                "                        \"lng\" : 11.7872857\n" +
                "                     },\n" +
                "                     \"travel_mode\" : \"WALKING\"\n" +
                "                  },\n" +
                "                  {\n" +
                "                     \"distance\" : {\n" +
                "                        \"text\" : \"37 m\",\n" +
                "                        \"value\" : 37\n" +
                "                     },\n" +
                "                     \"duration\" : {\n" +
                "                        \"text\" : \"1 Minute\",\n" +
                "                        \"value\" : 32\n" +
                "                     },\n" +
                "                     \"end_location\" : {\n" +
                "                        \"lat\" : 48.643812,\n" +
                "                        \"lng\" : 11.7876501\n" +
                "                     },\n" +
                "                     \"html_instructions\" : \"\\u003cb\\u003eRechts\\u003c/b\\u003e abbiegen auf \\u003cb\\u003eKöglmüllerweg\\u003c/b\\u003e\\u003cdiv style=\\\"font-size:0.9em\\\"\\u003eDas Ziel befindet sich auf der linken Seite.\\u003c/div\\u003e\",\n" +
                "                     \"maneuver\" : \"turn-right\",\n" +
                "                     \"polyline\" : {\n" +
                "                        \"points\" : \"ku{gHqe}fA[k@Q[\"\n" +
                "                     },\n" +
                "                     \"start_location\" : {\n" +
                "                        \"lat\" : 48.6435775,\n" +
                "                        \"lng\" : 11.7872861\n" +
                "                     },\n" +
                "                     \"travel_mode\" : \"WALKING\"\n" +
                "                  }\n" +
                "               ],\n" +
                "               \"traffic_speed_entry\" : [],\n" +
                "               \"via_waypoint\" : []\n" +
                "            },\n" +
                "            {\n" +
                "               \"distance\" : {\n" +
                "                  \"text\" : \"92 m\",\n" +
                "                  \"value\" : 92\n" +
                "               },\n" +
                "               \"duration\" : {\n" +
                "                  \"text\" : \"1 Minute\",\n" +
                "                  \"value\" : 66\n" +
                "               },\n" +
                "               \"end_address\" : \"Köglmüllerweg 8-10, 84048 Mainburg, Deutschland\",\n" +
                "               \"end_location\" : {\n" +
                "                  \"lat\" : 48.6445411,\n" +
                "                  \"lng\" : 11.7882216\n" +
                "               },\n" +
                "               \"start_address\" : \"Köglmüllerweg 1, 84048 Mainburg, Deutschland\",\n" +
                "               \"start_location\" : {\n" +
                "                  \"lat\" : 48.643812,\n" +
                "                  \"lng\" : 11.7876501\n" +
                "               },\n" +
                "               \"steps\" : [\n" +
                "                  {\n" +
                "                     \"distance\" : {\n" +
                "                        \"text\" : \"92 m\",\n" +
                "                        \"value\" : 92\n" +
                "                     },\n" +
                "                     \"duration\" : {\n" +
                "                        \"text\" : \"1 Minute\",\n" +
                "                        \"value\" : 66\n" +
                "                     },\n" +
                "                     \"end_location\" : {\n" +
                "                        \"lat\" : 48.6445411,\n" +
                "                        \"lng\" : 11.7882216\n" +
                "                     },\n" +
                "                     \"html_instructions\" : \"Auf \\u003cb\\u003eKöglmüllerweg\\u003c/b\\u003e nach \\u003cb\\u003eNordosten\\u003c/b\\u003e\",\n" +
                "                     \"polyline\" : {\n" +
                "                        \"points\" : \"yv{gHyg}fAGKQQSWa@WUKSIMGIE\"\n" +
                "                     },\n" +
                "                     \"start_location\" : {\n" +
                "                        \"lat\" : 48.643812,\n" +
                "                        \"lng\" : 11.7876501\n" +
                "                     },\n" +
                "                     \"travel_mode\" : \"WALKING\"\n" +
                "                  }\n" +
                "               ],\n" +
                "               \"traffic_speed_entry\" : [],\n" +
                "               \"via_waypoint\" : []\n" +
                "            },\n" +
                "            {\n" +
                "               \"distance\" : {\n" +
                "                  \"text\" : \"0,7 km\",\n" +
                "                  \"value\" : 653\n" +
                "               },\n" +
                "               \"duration\" : {\n" +
                "                  \"text\" : \"8 Minuten\",\n" +
                "                  \"value\" : 502\n" +
                "               },\n" +
                "               \"end_address\" : \"Theresienstraße 8, 84048 Mainburg, Deutschland\",\n" +
                "               \"end_location\" : {\n" +
                "                  \"lat\" : 48.6478336,\n" +
                "                  \"lng\" : 11.7932404\n" +
                "               },\n" +
                "               \"start_address\" : \"Köglmüllerweg 8-10, 84048 Mainburg, Deutschland\",\n" +
                "               \"start_location\" : {\n" +
                "                  \"lat\" : 48.6445411,\n" +
                "                  \"lng\" : 11.7882216\n" +
                "               },\n" +
                "               \"steps\" : [\n" +
                "                  {\n" +
                "                     \"distance\" : {\n" +
                "                        \"text\" : \"54 m\",\n" +
                "                        \"value\" : 54\n" +
                "                     },\n" +
                "                     \"duration\" : {\n" +
                "                        \"text\" : \"1 Minute\",\n" +
                "                        \"value\" : 38\n" +
                "                     },\n" +
                "                     \"end_location\" : {\n" +
                "                        \"lat\" : 48.6449321,\n" +
                "                        \"lng\" : 11.7886417\n" +
                "                     },\n" +
                "                     \"html_instructions\" : \"Auf \\u003cb\\u003eKöglmüllerweg\\u003c/b\\u003e nach \\u003cb\\u003eNordosten\\u003c/b\\u003e\",\n" +
                "                     \"polyline\" : {\n" +
                "                        \"points\" : \"k{{gHkk}fAYQMIEGIKUc@\"\n" +
                "                     },\n" +
                "                     \"start_location\" : {\n" +
                "                        \"lat\" : 48.6445411,\n" +
                "                        \"lng\" : 11.7882216\n" +
                "                     },\n" +
                "                     \"travel_mode\" : \"WALKING\"\n" +
                "                  },\n" +
                "                  {\n" +
                "                     \"distance\" : {\n" +
                "                        \"text\" : \"0,4 km\",\n" +
                "                        \"value\" : 351\n" +
                "                     },\n" +
                "                     \"duration\" : {\n" +
                "                        \"text\" : \"4 Minuten\",\n" +
                "                        \"value\" : 248\n" +
                "                     },\n" +
                "                     \"end_location\" : {\n" +
                "                        \"lat\" : 48.6475949,\n" +
                "                        \"lng\" : 11.7901021\n" +
                "                     },\n" +
                "                     \"html_instructions\" : \"\\u003cb\\u003eLinks\\u003c/b\\u003e Richtung \\u003cb\\u003eRingstraße\\u003c/b\\u003e abbiegen\",\n" +
                "                     \"maneuver\" : \"turn-left\",\n" +
                "                     \"polyline\" : {\n" +
                "                        \"points\" : \"y}{gH_n}fACNGRCHCB?@A?A?A?A?AAACq@_AuBmBgDgC[MKGEEYOMEA?A?A@A@CBA@GRA@C@A@CAICQGE?C?E?\"\n" +
                "                     },\n" +
                "                     \"start_location\" : {\n" +
                "                        \"lat\" : 48.6449321,\n" +
                "                        \"lng\" : 11.7886417\n" +
                "                     },\n" +
                "                     \"travel_mode\" : \"WALKING\"\n" +
                "                  },\n" +
                "                  {\n" +
                "                     \"distance\" : {\n" +
                "                        \"text\" : \"0,2 km\",\n" +
                "                        \"value\" : 165\n" +
                "                     },\n" +
                "                     \"duration\" : {\n" +
                "                        \"text\" : \"2 Minuten\",\n" +
                "                        \"value\" : 138\n" +
                "                     },\n" +
                "                     \"end_location\" : {\n" +
                "                        \"lat\" : 48.6474321,\n" +
                "                        \"lng\" : 11.7923318\n" +
                "                     },\n" +
                "                     \"html_instructions\" : \"\\u003cb\\u003eRechts\\u003c/b\\u003e abbiegen auf \\u003cb\\u003eRingstraße\\u003c/b\\u003e\",\n" +
                "                     \"maneuver\" : \"turn-right\",\n" +
                "                     \"polyline\" : {\n" +
                "                        \"points\" : \"mn|gHcw}fA@{@D{@@_@@]FkBJ{C\"\n" +
                "                     },\n" +
                "                     \"start_location\" : {\n" +
                "                        \"lat\" : 48.6475949,\n" +
                "                        \"lng\" : 11.7901021\n" +
                "                     },\n" +
                "                     \"travel_mode\" : \"WALKING\"\n" +
                "                  },\n" +
                "                  {\n" +
                "                     \"distance\" : {\n" +
                "                        \"text\" : \"23 m\",\n" +
                "                        \"value\" : 23\n" +
                "                     },\n" +
                "                     \"duration\" : {\n" +
                "                        \"text\" : \"1 Minute\",\n" +
                "                        \"value\" : 21\n" +
                "                     },\n" +
                "                     \"end_location\" : {\n" +
                "                        \"lat\" : 48.64760949999999,\n" +
                "                        \"lng\" : 11.7924964\n" +
                "                     },\n" +
                "                     \"html_instructions\" : \"\\u003cb\\u003eLinks\\u003c/b\\u003e abbiegen auf \\u003cb\\u003eEdersiedlung\\u003c/b\\u003e\",\n" +
                "                     \"maneuver\" : \"turn-left\",\n" +
                "                     \"polyline\" : {\n" +
                "                        \"points\" : \"mm|gHae~fAc@a@\"\n" +
                "                     },\n" +
                "                     \"start_location\" : {\n" +
                "                        \"lat\" : 48.6474321,\n" +
                "                        \"lng\" : 11.7923318\n" +
                "                     },\n" +
                "                     \"travel_mode\" : \"WALKING\"\n" +
                "                  },\n" +
                "                  {\n" +
                "                     \"distance\" : {\n" +
                "                        \"text\" : \"60 m\",\n" +
                "                        \"value\" : 60\n" +
                "                     },\n" +
                "                     \"duration\" : {\n" +
                "                        \"text\" : \"1 Minute\",\n" +
                "                        \"value\" : 57\n" +
                "                     },\n" +
                "                     \"end_location\" : {\n" +
                "                        \"lat\" : 48.6478336,\n" +
                "                        \"lng\" : 11.7932404\n" +
                "                     },\n" +
                "                     \"html_instructions\" : \"Leicht \\u003cb\\u003erechts\\u003c/b\\u003e abbiegen auf \\u003cb\\u003eTheresienstraße\\u003c/b\\u003e\",\n" +
                "                     \"maneuver\" : \"turn-slight-right\",\n" +
                "                     \"polyline\" : {\n" +
                "                        \"points\" : \"qn|gHcf~fAk@sC\"\n" +
                "                     },\n" +
                "                     \"start_location\" : {\n" +
                "                        \"lat\" : 48.64760949999999,\n" +
                "                        \"lng\" : 11.7924964\n" +
                "                     },\n" +
                "                     \"travel_mode\" : \"WALKING\"\n" +
                "                  }\n" +
                "               ],\n" +
                "               \"traffic_speed_entry\" : [],\n" +
                "               \"via_waypoint\" : []\n" +
                "            },\n" +
                "            {\n" +
                "               \"distance\" : {\n" +
                "                  \"text\" : \"0,7 km\",\n" +
                "                  \"value\" : 653\n" +
                "               },\n" +
                "               \"duration\" : {\n" +
                "                  \"text\" : \"10 Minuten\",\n" +
                "                  \"value\" : 615\n" +
                "               },\n" +
                "               \"end_address\" : \"Brandholzstraße 31, 84048 Mainburg, Deutschland\",\n" +
                "               \"end_location\" : {\n" +
                "                  \"lat\" : 48.6514832,\n" +
                "                  \"lng\" : 11.7993728\n" +
                "               },\n" +
                "               \"start_address\" : \"Theresienstraße 8, 84048 Mainburg, Deutschland\",\n" +
                "               \"start_location\" : {\n" +
                "                  \"lat\" : 48.6478336,\n" +
                "                  \"lng\" : 11.7932404\n" +
                "               },\n" +
                "               \"steps\" : [\n" +
                "                  {\n" +
                "                     \"distance\" : {\n" +
                "                        \"text\" : \"0,4 km\",\n" +
                "                        \"value\" : 358\n" +
                "                     },\n" +
                "                     \"duration\" : {\n" +
                "                        \"text\" : \"6 Minuten\",\n" +
                "                        \"value\" : 377\n" +
                "                     },\n" +
                "                     \"end_location\" : {\n" +
                "                        \"lat\" : 48.6492218,\n" +
                "                        \"lng\" : 11.7975273\n" +
                "                     },\n" +
                "                     \"html_instructions\" : \"Auf \\u003cb\\u003eTheresienstraße\\u003c/b\\u003e nach \\u003cb\\u003eNordosten\\u003c/b\\u003e Richtung \\u003cb\\u003eHeckenweg\\u003c/b\\u003e\",\n" +
                "                     \"polyline\" : {\n" +
                "                        \"points\" : \"}o|gHwj~fAS}@SiAIi@CSCQASC[E}@Bo@c@cAOk@Qg@g@oBkAeDYu@\"\n" +
                "                     },\n" +
                "                     \"start_location\" : {\n" +
                "                        \"lat\" : 48.6478336,\n" +
                "                        \"lng\" : 11.7932404\n" +
                "                     },\n" +
                "                     \"travel_mode\" : \"WALKING\"\n" +
                "                  },\n" +
                "                  {\n" +
                "                     \"distance\" : {\n" +
                "                        \"text\" : \"0,3 km\",\n" +
                "                        \"value\" : 295\n" +
                "                     },\n" +
                "                     \"duration\" : {\n" +
                "                        \"text\" : \"4 Minuten\",\n" +
                "                        \"value\" : 238\n" +
                "                     },\n" +
                "                     \"end_location\" : {\n" +
                "                        \"lat\" : 48.6514832,\n" +
                "                        \"lng\" : 11.7993728\n" +
                "                     },\n" +
                "                     \"html_instructions\" : \"Leicht \\u003cb\\u003elinks\\u003c/b\\u003e abbiegen\",\n" +
                "                     \"maneuver\" : \"turn-slight-left\",\n" +
                "                     \"polyline\" : {\n" +
                "                        \"points\" : \"sx|gHqe_gAOCm@O}A[[IKGEAUSUUq@q@iCwCQw@\"\n" +
                "                     },\n" +
                "                     \"start_location\" : {\n" +
                "                        \"lat\" : 48.6492218,\n" +
                "                        \"lng\" : 11.7975273\n" +
                "                     },\n" +
                "                     \"travel_mode\" : \"WALKING\"\n" +
                "                  }\n" +
                "               ],\n" +
                "               \"traffic_speed_entry\" : [],\n" +
                "               \"via_waypoint\" : []\n" +
                "            },\n" +
                "            {\n" +
                "               \"distance\" : {\n" +
                "                  \"text\" : \"0,8 km\",\n" +
                "                  \"value\" : 809\n" +
                "               },\n" +
                "               \"duration\" : {\n" +
                "                  \"text\" : \"10 Minuten\",\n" +
                "                  \"value\" : 627\n" +
                "               },\n" +
                "               \"end_address\" : \"Rudolf-Obermayer-Weg, 84048 Mainburg, Deutschland\",\n" +
                "               \"end_location\" : {\n" +
                "                  \"lat\" : 48.65207480000001,\n" +
                "                  \"lng\" : 11.7902953\n" +
                "               },\n" +
                "               \"start_address\" : \"Brandholzstraße 31, 84048 Mainburg, Deutschland\",\n" +
                "               \"start_location\" : {\n" +
                "                  \"lat\" : 48.6514832,\n" +
                "                  \"lng\" : 11.7993728\n" +
                "               },\n" +
                "               \"steps\" : [\n" +
                "                  {\n" +
                "                     \"distance\" : {\n" +
                "                        \"text\" : \"23 m\",\n" +
                "                        \"value\" : 23\n" +
                "                     },\n" +
                "                     \"duration\" : {\n" +
                "                        \"text\" : \"1 Minute\",\n" +
                "                        \"value\" : 22\n" +
                "                     },\n" +
                "                     \"end_location\" : {\n" +
                "                        \"lat\" : 48.6513948,\n" +
                "                        \"lng\" : 11.7990913\n" +
                "                     },\n" +
                "                     \"html_instructions\" : \"Nach \\u003cb\\u003eSüdwesten\\u003c/b\\u003e\",\n" +
                "                     \"polyline\" : {\n" +
                "                        \"points\" : \"wf}gHaq_gAPv@\"\n" +
                "                     },\n" +
                "                     \"start_location\" : {\n" +
                "                        \"lat\" : 48.6514832,\n" +
                "                        \"lng\" : 11.7993728\n" +
                "                     },\n" +
                "                     \"travel_mode\" : \"WALKING\"\n" +
                "                  },\n" +
                "                  {\n" +
                "                     \"distance\" : {\n" +
                "                        \"text\" : \"63 m\",\n" +
                "                        \"value\" : 63\n" +
                "                     },\n" +
                "                     \"duration\" : {\n" +
                "                        \"text\" : \"1 Minute\",\n" +
                "                        \"value\" : 46\n" +
                "                     },\n" +
                "                     \"end_location\" : {\n" +
                "                        \"lat\" : 48.6519551,\n" +
                "                        \"lng\" : 11.7989635\n" +
                "                     },\n" +
                "                     \"html_instructions\" : \"\\u003cb\\u003eRechts\\u003c/b\\u003e abbiegen\",\n" +
                "                     \"maneuver\" : \"turn-right\",\n" +
                "                     \"polyline\" : {\n" +
                "                        \"points\" : \"ef}gHio_gAs@B[Fa@L\"\n" +
                "                     },\n" +
                "                     \"start_location\" : {\n" +
                "                        \"lat\" : 48.6513948,\n" +
                "                        \"lng\" : 11.7990913\n" +
                "                     },\n" +
                "                     \"travel_mode\" : \"WALKING\"\n" +
                "                  },\n" +
                "                  {\n" +
                "                     \"distance\" : {\n" +
                "                        \"text\" : \"0,5 km\",\n" +
                "                        \"value\" : 452\n" +
                "                     },\n" +
                "                     \"duration\" : {\n" +
                "                        \"text\" : \"6 Minuten\",\n" +
                "                        \"value\" : 355\n" +
                "                     },\n" +
                "                     \"end_location\" : {\n" +
                "                        \"lat\" : 48.65146800000001,\n" +
                "                        \"lng\" : 11.7929383\n" +
                "                     },\n" +
                "                     \"html_instructions\" : \"\\u003cb\\u003eLinks\\u003c/b\\u003e Richtung \\u003cb\\u003eErlenstraße\\u003c/b\\u003e abbiegen\",\n" +
                "                     \"maneuver\" : \"turn-left\",\n" +
                "                     \"polyline\" : {\n" +
                "                        \"points\" : \"wi}gHon_gAArA?v@CjAAl@@\\\\P|ANpBBj@?n@Cn@GtA?r@Dn@F~@VnBLzAXlB\"\n" +
                "                     },\n" +
                "                     \"start_location\" : {\n" +
                "                        \"lat\" : 48.6519551,\n" +
                "                        \"lng\" : 11.7989635\n" +
                "                     },\n" +
                "                     \"travel_mode\" : \"WALKING\"\n" +
                "                  },\n" +
                "                  {\n" +
                "                     \"distance\" : {\n" +
                "                        \"text\" : \"80 m\",\n" +
                "                        \"value\" : 80\n" +
                "                     },\n" +
                "                     \"duration\" : {\n" +
                "                        \"text\" : \"1 Minute\",\n" +
                "                        \"value\" : 67\n" +
                "                     },\n" +
                "                     \"end_location\" : {\n" +
                "                        \"lat\" : 48.65137439999999,\n" +
                "                        \"lng\" : 11.7918564\n" +
                "                     },\n" +
                "                     \"html_instructions\" : \"Weiter auf \\u003cb\\u003eErlenstraße\\u003c/b\\u003e\",\n" +
                "                     \"polyline\" : {\n" +
                "                        \"points\" : \"uf}gH{h~fARvE\"\n" +
                "                     },\n" +
                "                     \"start_location\" : {\n" +
                "                        \"lat\" : 48.65146800000001,\n" +
                "                        \"lng\" : 11.7929383\n" +
                "                     },\n" +
                "                     \"travel_mode\" : \"WALKING\"\n" +
                "                  },\n" +
                "                  {\n" +
                "                     \"distance\" : {\n" +
                "                        \"text\" : \"44 m\",\n" +
                "                        \"value\" : 44\n" +
                "                     },\n" +
                "                     \"duration\" : {\n" +
                "                        \"text\" : \"1 Minute\",\n" +
                "                        \"value\" : 34\n" +
                "                     },\n" +
                "                     \"end_location\" : {\n" +
                "                        \"lat\" : 48.6517591,\n" +
                "                        \"lng\" : 11.7917811\n" +
                "                     },\n" +
                "                     \"html_instructions\" : \"\\u003cb\\u003eRechts\\u003c/b\\u003e abbiegen\",\n" +
                "                     \"maneuver\" : \"turn-right\",\n" +
                "                     \"polyline\" : {\n" +
                "                        \"points\" : \"af}gHcb~fAIFC@C@C@I?O@IAQ@A?\"\n" +
                "                     },\n" +
                "                     \"start_location\" : {\n" +
                "                        \"lat\" : 48.65137439999999,\n" +
                "                        \"lng\" : 11.7918564\n" +
                "                     },\n" +
                "                     \"travel_mode\" : \"WALKING\"\n" +
                "                  },\n" +
                "                  {\n" +
                "                     \"distance\" : {\n" +
                "                        \"text\" : \"30 m\",\n" +
                "                        \"value\" : 30\n" +
                "                     },\n" +
                "                     \"duration\" : {\n" +
                "                        \"text\" : \"1 Minute\",\n" +
                "                        \"value\" : 22\n" +
                "                     },\n" +
                "                     \"end_location\" : {\n" +
                "                        \"lat\" : 48.6518405,\n" +
                "                        \"lng\" : 11.7914083\n" +
                "                     },\n" +
                "                     \"html_instructions\" : \"\\u003cb\\u003eLinks\\u003c/b\\u003e abbiegen\",\n" +
                "                     \"maneuver\" : \"turn-left\",\n" +
                "                     \"polyline\" : {\n" +
                "                        \"points\" : \"oh}gHsa~fAA\\\\?H?FA@ABIR\"\n" +
                "                     },\n" +
                "                     \"start_location\" : {\n" +
                "                        \"lat\" : 48.6517591,\n" +
                "                        \"lng\" : 11.7917811\n" +
                "                     },\n" +
                "                     \"travel_mode\" : \"WALKING\"\n" +
                "                  },\n" +
                "                  {\n" +
                "                     \"distance\" : {\n" +
                "                        \"text\" : \"22 m\",\n" +
                "                        \"value\" : 22\n" +
                "                     },\n" +
                "                     \"duration\" : {\n" +
                "                        \"text\" : \"1 Minute\",\n" +
                "                        \"value\" : 17\n" +
                "                     },\n" +
                "                     \"end_location\" : {\n" +
                "                        \"lat\" : 48.6520221,\n" +
                "                        \"lng\" : 11.7915125\n" +
                "                     },\n" +
                "                     \"html_instructions\" : \"Bei \\u003cb\\u003eRudolf-Obermayer-Weg\\u003c/b\\u003e \\u003cb\\u003erechts\\u003c/b\\u003e abbiegen\",\n" +
                "                     \"maneuver\" : \"turn-right\",\n" +
                "                     \"polyline\" : {\n" +
                "                        \"points\" : \"_i}gHi_~fAc@S\"\n" +
                "                     },\n" +
                "                     \"start_location\" : {\n" +
                "                        \"lat\" : 48.6518405,\n" +
                "                        \"lng\" : 11.7914083\n" +
                "                     },\n" +
                "                     \"travel_mode\" : \"WALKING\"\n" +
                "                  },\n" +
                "                  {\n" +
                "                     \"distance\" : {\n" +
                "                        \"text\" : \"0,1 km\",\n" +
                "                        \"value\" : 95\n" +
                "                     },\n" +
                "                     \"duration\" : {\n" +
                "                        \"text\" : \"1 Minute\",\n" +
                "                        \"value\" : 64\n" +
                "                     },\n" +
                "                     \"end_location\" : {\n" +
                "                        \"lat\" : 48.65207480000001,\n" +
                "                        \"lng\" : 11.7902953\n" +
                "                     },\n" +
                "                     \"html_instructions\" : \"\\u003cb\\u003eLinks\\u003c/b\\u003e abbiegen\",\n" +
                "                     \"maneuver\" : \"turn-left\",\n" +
                "                     \"polyline\" : {\n" +
                "                        \"points\" : \"cj}gH}_~fAKbAMvACZ?D?HBHBJ@DDJB@\"\n" +
                "                     },\n" +
                "                     \"start_location\" : {\n" +
                "                        \"lat\" : 48.6520221,\n" +
                "                        \"lng\" : 11.7915125\n" +
                "                     },\n" +
                "                     \"travel_mode\" : \"WALKING\"\n" +
                "                  }\n" +
                "               ],\n" +
                "               \"traffic_speed_entry\" : [],\n" +
                "               \"via_waypoint\" : []\n" +
                "            },\n" +
                "            {\n" +
                "               \"distance\" : {\n" +
                "                  \"text\" : \"0,5 km\",\n" +
                "                  \"value\" : 468\n" +
                "               },\n" +
                "               \"duration\" : {\n" +
                "                  \"text\" : \"6 Minuten\",\n" +
                "                  \"value\" : 344\n" +
                "               },\n" +
                "               \"end_address\" : \"Rudolf-Obermayer-Weg, 84048 Mainburg, Deutschland\",\n" +
                "               \"end_location\" : {\n" +
                "                  \"lat\" : 48.6482086,\n" +
                "                  \"lng\" : 11.7905207\n" +
                "               },\n" +
                "               \"start_address\" : \"Rudolf-Obermayer-Weg, 84048 Mainburg, Deutschland\",\n" +
                "               \"start_location\" : {\n" +
                "                  \"lat\" : 48.65207480000001,\n" +
                "                  \"lng\" : 11.7902953\n" +
                "               },\n" +
                "               \"steps\" : [\n" +
                "                  {\n" +
                "                     \"distance\" : {\n" +
                "                        \"text\" : \"0,5 km\",\n" +
                "                        \"value\" : 468\n" +
                "                     },\n" +
                "                     \"duration\" : {\n" +
                "                        \"text\" : \"6 Minuten\",\n" +
                "                        \"value\" : 344\n" +
                "                     },\n" +
                "                     \"end_location\" : {\n" +
                "                        \"lat\" : 48.6482086,\n" +
                "                        \"lng\" : 11.7905207\n" +
                "                     },\n" +
                "                     \"html_instructions\" : \"Nach \\u003cb\\u003eSüdwesten\\u003c/b\\u003e\",\n" +
                "                     \"polyline\" : {\n" +
                "                        \"points\" : \"mj}gHkx}fADNn@T^FLD\\\\Fn@Nn@NRFNBLDH@F?DAH?FCLGZOx@c@DCDA@?B?N@jEh@H@F?B@D?H?DADADCBEFG@G`@{A@C@ABCB?\"\n" +
                "                     },\n" +
                "                     \"start_location\" : {\n" +
                "                        \"lat\" : 48.65207480000001,\n" +
                "                        \"lng\" : 11.7902953\n" +
                "                     },\n" +
                "                     \"travel_mode\" : \"WALKING\"\n" +
                "                  }\n" +
                "               ],\n" +
                "               \"traffic_speed_entry\" : [],\n" +
                "               \"via_waypoint\" : []\n" +
                "            },\n" +
                "            {\n" +
                "               \"distance\" : {\n" +
                "                  \"text\" : \"0,2 km\",\n" +
                "                  \"value\" : 157\n" +
                "               },\n" +
                "               \"duration\" : {\n" +
                "                  \"text\" : \"2 Minuten\",\n" +
                "                  \"value\" : 119\n" +
                "               },\n" +
                "               \"end_address\" : \"KEH31, 84048 Mainburg, Deutschland\",\n" +
                "               \"end_location\" : {\n" +
                "                  \"lat\" : 48.6471715,\n" +
                "                  \"lng\" : 11.7894458\n" +
                "               },\n" +
                "               \"start_address\" : \"Rudolf-Obermayer-Weg, 84048 Mainburg, Deutschland\",\n" +
                "               \"start_location\" : {\n" +
                "                  \"lat\" : 48.6482086,\n" +
                "                  \"lng\" : 11.7905207\n" +
                "               },\n" +
                "               \"steps\" : [\n" +
                "                  {\n" +
                "                     \"distance\" : {\n" +
                "                        \"text\" : \"63 m\",\n" +
                "                        \"value\" : 63\n" +
                "                     },\n" +
                "                     \"duration\" : {\n" +
                "                        \"text\" : \"1 Minute\",\n" +
                "                        \"value\" : 46\n" +
                "                     },\n" +
                "                     \"end_location\" : {\n" +
                "                        \"lat\" : 48.6477776,\n" +
                "                        \"lng\" : 11.7901475\n" +
                "                     },\n" +
                "                     \"html_instructions\" : \"Nach \\u003cb\\u003eSüden\\u003c/b\\u003e\",\n" +
                "                     \"polyline\" : {\n" +
                "                        \"points\" : \"ir|gHwy}fAD?D@l@PJBDDBD@@@D@B?B@B?BAL\"\n" +
                "                     },\n" +
                "                     \"start_location\" : {\n" +
                "                        \"lat\" : 48.6482086,\n" +
                "                        \"lng\" : 11.7905207\n" +
                "                     },\n" +
                "                     \"travel_mode\" : \"WALKING\"\n" +
                "                  },\n" +
                "                  {\n" +
                "                     \"distance\" : {\n" +
                "                        \"text\" : \"21 m\",\n" +
                "                        \"value\" : 21\n" +
                "                     },\n" +
                "                     \"duration\" : {\n" +
                "                        \"text\" : \"1 Minute\",\n" +
                "                        \"value\" : 15\n" +
                "                     },\n" +
                "                     \"end_location\" : {\n" +
                "                        \"lat\" : 48.6475949,\n" +
                "                        \"lng\" : 11.7901021\n" +
                "                     },\n" +
                "                     \"html_instructions\" : \"\\u003cb\\u003eLinks\\u003c/b\\u003e abbiegen\",\n" +
                "                     \"maneuver\" : \"turn-left\",\n" +
                "                     \"polyline\" : {\n" +
                "                        \"points\" : \"so|gHmw}fAd@H\"\n" +
                "                     },\n" +
                "                     \"start_location\" : {\n" +
                "                        \"lat\" : 48.6477776,\n" +
                "                        \"lng\" : 11.7901475\n" +
                "                     },\n" +
                "                     \"travel_mode\" : \"WALKING\"\n" +
                "                  },\n" +
                "                  {\n" +
                "                     \"distance\" : {\n" +
                "                        \"text\" : \"17 m\",\n" +
                "                        \"value\" : 17\n" +
                "                     },\n" +
                "                     \"duration\" : {\n" +
                "                        \"text\" : \"1 Minute\",\n" +
                "                        \"value\" : 13\n" +
                "                     },\n" +
                "                     \"end_location\" : {\n" +
                "                        \"lat\" : 48.6475891,\n" +
                "                        \"lng\" : 11.7898682\n" +
                "                     },\n" +
                "                     \"html_instructions\" : \"\\u003cb\\u003eRechts\\u003c/b\\u003e abbiegen\",\n" +
                "                     \"maneuver\" : \"turn-right\",\n" +
                "                     \"polyline\" : {\n" +
                "                        \"points\" : \"mn|gHcw}fA?l@\"\n" +
                "                     },\n" +
                "                     \"start_location\" : {\n" +
                "                        \"lat\" : 48.6475949,\n" +
                "                        \"lng\" : 11.7901021\n" +
                "                     },\n" +
                "                     \"travel_mode\" : \"WALKING\"\n" +
                "                  },\n" +
                "                  {\n" +
                "                     \"distance\" : {\n" +
                "                        \"text\" : \"56 m\",\n" +
                "                        \"value\" : 56\n" +
                "                     },\n" +
                "                     \"duration\" : {\n" +
                "                        \"text\" : \"1 Minute\",\n" +
                "                        \"value\" : 45\n" +
                "                     },\n" +
                "                     \"end_location\" : {\n" +
                "                        \"lat\" : 48.6471715,\n" +
                "                        \"lng\" : 11.7894458\n" +
                "                     },\n" +
                "                     \"html_instructions\" : \"\\u003cb\\u003eLinks\\u003c/b\\u003e abbiegen\",\n" +
                "                     \"maneuver\" : \"turn-left\",\n" +
                "                     \"polyline\" : {\n" +
                "                        \"points\" : \"mn|gHuu}fArArA\"\n" +
                "                     },\n" +
                "                     \"start_location\" : {\n" +
                "                        \"lat\" : 48.6475891,\n" +
                "                        \"lng\" : 11.7898682\n" +
                "                     },\n" +
                "                     \"travel_mode\" : \"WALKING\"\n" +
                "                  }\n" +
                "               ],\n" +
                "               \"traffic_speed_entry\" : [],\n" +
                "               \"via_waypoint\" : []\n" +
                "            }\n" +
                "         ],\n" +
                "         \"overview_polyline\" : {\n" +
                "            \"points\" : \"mp{gH{b}fANwAm@?cB@[?[k@Yg@e@i@w@c@eAi@SQ_@o@Kb@GLE@w@eAuBmBgDgCg@Uo@[IFITEBE?[KI?E?@{@F{AHiCJ{Cc@a@_AqEe@yCEo@E}@Bo@c@cAOk@y@wCeB{E}@SyBe@QIk@i@{DiEQw@Pv@s@B[Fa@LArACbC?jA`@nEBzAKdCDbB^nDLzAXlBRvEIFGBM@m@@Cp@KVc@SKbAQrB?NNf@HPnA\\\\jCl@z@RLAPChB_AFAR@`Fl@ZCHIHOb@_BDEN@x@THJDN@FALd@H?l@rArA\"\n" +
                "         },\n" +
                "         \"summary\" : \"Abensberger Str.\",\n" +
                "         \"warnings\" : [\n" +
                "            \"Der Routenplaner für Fußgänger ist noch im Beta-Stadium. Sei vorsichtig! – Auf dieser Route gibt es eventuell keine Bürgersteige oder Fußwege.\"\n" +
                "         ],\n" +
                "         \"waypoint_order\" : [ 0, 1, 2, 3, 4, 5, 6, 7 ]\n" +
                "      }\n" +
                "   ],\n" +
                "   \"status\" : \"OK\"\n" +
                "}";
    }

    public static String getRoutePart2() {
        return "{\n" +
                "   \"geocoded_waypoints\" : [\n" +
                "      {\n" +
                "         \"geocoder_status\" : \"OK\",\n" +
                "         \"place_id\" : \"ChIJw5OBVxhJnkcRyGMPiAqr-68\",\n" +
                "         \"types\" : [ \"street_address\" ]\n" +
                "      },\n" +
                "      {\n" +
                "         \"geocoder_status\" : \"OK\",\n" +
                "         \"place_id\" : \"ChIJZbJWkRhJnkcRhDZvY1F6T2Q\",\n" +
                "         \"types\" : [ \"street_address\" ]\n" +
                "      },\n" +
                "      {\n" +
                "         \"geocoder_status\" : \"OK\",\n" +
                "         \"place_id\" : \"ChIJnzBPxyFJnkcRf19pVl0U7Jc\",\n" +
                "         \"types\" : [ \"street_address\" ]\n" +
                "      },\n" +
                "      {\n" +
                "         \"geocoder_status\" : \"OK\",\n" +
                "         \"place_id\" : \"ChIJdwkeNiBJnkcRQDDInm-X6AA\",\n" +
                "         \"types\" : [ \"street_address\" ]\n" +
                "      },\n" +
                "      {\n" +
                "         \"geocoder_status\" : \"OK\",\n" +
                "         \"place_id\" : \"ChIJrRylmR9JnkcRVKDusCT4VNw\",\n" +
                "         \"types\" : [ \"street_address\" ]\n" +
                "      },\n" +
                "      {\n" +
                "         \"geocoder_status\" : \"OK\",\n" +
                "         \"place_id\" : \"ChIJOQoWNB5JnkcRrOS7B35MAr4\",\n" +
                "         \"types\" : [ \"street_address\" ]\n" +
                "      },\n" +
                "      {\n" +
                "         \"geocoder_status\" : \"OK\",\n" +
                "         \"place_id\" : \"EixLZWxsZXJzdHJhw59lIDcsIDg0MDQ4IE1haW5idXJnLCBEZXV0c2NobGFuZA\",\n" +
                "         \"types\" : [ \"street_address\" ]\n" +
                "      }\n" +
                "   ],\n" +
                "   \"routes\" : [\n" +
                "      {\n" +
                "         \"bounds\" : {\n" +
                "            \"northeast\" : {\n" +
                "               \"lat\" : 48.6466009,\n" +
                "               \"lng\" : 11.790207\n" +
                "            },\n" +
                "            \"southwest\" : {\n" +
                "               \"lat\" : 48.63974469999999,\n" +
                "               \"lng\" : 11.7837155\n" +
                "            }\n" +
                "         },\n" +
                "         \"copyrights\" : \"Kartendaten © 2017 GeoBasis-DE/BKG (©2009), Google\",\n" +
                "         \"legs\" : [\n" +
                "            {\n" +
                "               \"distance\" : {\n" +
                "                  \"text\" : \"0,2 km\",\n" +
                "                  \"value\" : 152\n" +
                "               },\n" +
                "               \"duration\" : {\n" +
                "                  \"text\" : \"2 Minuten\",\n" +
                "                  \"value\" : 116\n" +
                "               },\n" +
                "               \"end_address\" : \"Abenstalstraße 8, 84048 Mainburg, Deutschland\",\n" +
                "               \"end_location\" : {\n" +
                "                  \"lat\" : 48.6455674,\n" +
                "                  \"lng\" : 11.7876281\n" +
                "               },\n" +
                "               \"start_address\" : \"Abenstalstraße 56, 84048 Mainburg, Deutschland\",\n" +
                "               \"start_location\" : {\n" +
                "                  \"lat\" : 48.6466009,\n" +
                "                  \"lng\" : 11.7886821\n" +
                "               },\n" +
                "               \"steps\" : [\n" +
                "                  {\n" +
                "                     \"distance\" : {\n" +
                "                        \"text\" : \"0,1 km\",\n" +
                "                        \"value\" : 129\n" +
                "                     },\n" +
                "                     \"duration\" : {\n" +
                "                        \"text\" : \"2 Minuten\",\n" +
                "                        \"value\" : 98\n" +
                "                     },\n" +
                "                     \"end_location\" : {\n" +
                "                        \"lat\" : 48.6455601,\n" +
                "                        \"lng\" : 11.7879391\n" +
                "                     },\n" +
                "                     \"html_instructions\" : \"Auf \\u003cb\\u003eAbenstalstraße\\u003c/b\\u003e nach \\u003cb\\u003eSüdwesten\\u003c/b\\u003e\",\n" +
                "                     \"polyline\" : {\n" +
                "                        \"points\" : \"gh|gHgn}fA^b@FHDDHFRJd@PTJZN\\\\TLF\"\n" +
                "                     },\n" +
                "                     \"start_location\" : {\n" +
                "                        \"lat\" : 48.6466009,\n" +
                "                        \"lng\" : 11.7886821\n" +
                "                     },\n" +
                "                     \"travel_mode\" : \"WALKING\"\n" +
                "                  },\n" +
                "                  {\n" +
                "                     \"distance\" : {\n" +
                "                        \"text\" : \"23 m\",\n" +
                "                        \"value\" : 23\n" +
                "                     },\n" +
                "                     \"duration\" : {\n" +
                "                        \"text\" : \"1 Minute\",\n" +
                "                        \"value\" : 18\n" +
                "                     },\n" +
                "                     \"end_location\" : {\n" +
                "                        \"lat\" : 48.6455674,\n" +
                "                        \"lng\" : 11.7876281\n" +
                "                     },\n" +
                "                     \"html_instructions\" : \"Nach \\u003cb\\u003erechts\\u003c/b\\u003e abbiegen, um auf \\u003cb\\u003eAbenstalstraße\\u003c/b\\u003e zu bleiben\",\n" +
                "                     \"maneuver\" : \"turn-right\",\n" +
                "                     \"polyline\" : {\n" +
                "                        \"points\" : \"wa|gHsi}fAA|@\"\n" +
                "                     },\n" +
                "                     \"start_location\" : {\n" +
                "                        \"lat\" : 48.6455601,\n" +
                "                        \"lng\" : 11.7879391\n" +
                "                     },\n" +
                "                     \"travel_mode\" : \"WALKING\"\n" +
                "                  }\n" +
                "               ],\n" +
                "               \"traffic_speed_entry\" : [],\n" +
                "               \"via_waypoint\" : []\n" +
                "            },\n" +
                "            {\n" +
                "               \"distance\" : {\n" +
                "                  \"text\" : \"0,6 km\",\n" +
                "                  \"value\" : 613\n" +
                "               },\n" +
                "               \"duration\" : {\n" +
                "                  \"text\" : \"8 Minuten\",\n" +
                "                  \"value\" : 455\n" +
                "               },\n" +
                "               \"end_address\" : \"Promenadenweg 1, 84048 Mainburg, Deutschland\",\n" +
                "               \"end_location\" : {\n" +
                "                  \"lat\" : 48.6423608,\n" +
                "                  \"lng\" : 11.7838781\n" +
                "               },\n" +
                "               \"start_address\" : \"Abenstalstraße 8, 84048 Mainburg, Deutschland\",\n" +
                "               \"start_location\" : {\n" +
                "                  \"lat\" : 48.6455674,\n" +
                "                  \"lng\" : 11.7876281\n" +
                "               },\n" +
                "               \"steps\" : [\n" +
                "                  {\n" +
                "                     \"distance\" : {\n" +
                "                        \"text\" : \"0,1 km\",\n" +
                "                        \"value\" : 133\n" +
                "                     },\n" +
                "                     \"duration\" : {\n" +
                "                        \"text\" : \"2 Minuten\",\n" +
                "                        \"value\" : 100\n" +
                "                     },\n" +
                "                     \"end_location\" : {\n" +
                "                        \"lat\" : 48.6452956,\n" +
                "                        \"lng\" : 11.7859852\n" +
                "                     },\n" +
                "                     \"html_instructions\" : \"Auf \\u003cb\\u003eAbenstalstraße\\u003c/b\\u003e nach \\u003cb\\u003eWesten\\u003c/b\\u003e Richtung \\u003cb\\u003eAbensberger Str.\\u003c/b\\u003e\",\n" +
                "                     \"polyline\" : {\n" +
                "                        \"points\" : \"ya|gHug}fA?P?HCZCZAVATAP@N?H@F@JBH@DDHp@jB\"\n" +
                "                     },\n" +
                "                     \"start_location\" : {\n" +
                "                        \"lat\" : 48.6455674,\n" +
                "                        \"lng\" : 11.7876281\n" +
                "                     },\n" +
                "                     \"travel_mode\" : \"WALKING\"\n" +
                "                  },\n" +
                "                  {\n" +
                "                     \"distance\" : {\n" +
                "                        \"text\" : \"0,2 km\",\n" +
                "                        \"value\" : 154\n" +
                "                     },\n" +
                "                     \"duration\" : {\n" +
                "                        \"text\" : \"2 Minuten\",\n" +
                "                        \"value\" : 111\n" +
                "                     },\n" +
                "                     \"end_location\" : {\n" +
                "                        \"lat\" : 48.6441151,\n" +
                "                        \"lng\" : 11.7870823\n" +
                "                     },\n" +
                "                     \"html_instructions\" : \"\\u003cb\\u003eLinks\\u003c/b\\u003e abbiegen auf \\u003cb\\u003eAbensberger Str.\\u003c/b\\u003e\",\n" +
                "                     \"maneuver\" : \"turn-left\",\n" +
                "                     \"polyline\" : {\n" +
                "                        \"points\" : \"c`|gHm}|fARO`@]RSt@w@NQRQRQRO^Y\"\n" +
                "                     },\n" +
                "                     \"start_location\" : {\n" +
                "                        \"lat\" : 48.6452956,\n" +
                "                        \"lng\" : 11.7859852\n" +
                "                     },\n" +
                "                     \"travel_mode\" : \"WALKING\"\n" +
                "                  },\n" +
                "                  {\n" +
                "                     \"distance\" : {\n" +
                "                        \"text\" : \"0,3 km\",\n" +
                "                        \"value\" : 326\n" +
                "                     },\n" +
                "                     \"duration\" : {\n" +
                "                        \"text\" : \"4 Minuten\",\n" +
                "                        \"value\" : 244\n" +
                "                     },\n" +
                "                     \"end_location\" : {\n" +
                "                        \"lat\" : 48.6423608,\n" +
                "                        \"lng\" : 11.7838781\n" +
                "                     },\n" +
                "                     \"html_instructions\" : \"\\u003cb\\u003eRechts\\u003c/b\\u003e abbiegen auf \\u003cb\\u003ePromenadenweg\\u003c/b\\u003e\",\n" +
                "                     \"maneuver\" : \"turn-right\",\n" +
                "                     \"polyline\" : {\n" +
                "                        \"points\" : \"wx{gHgd}fAb@|BR`AJb@Nh@`@xAX`ANh@J\\\\Zr@Tb@FHLNJFFDLBPBv@D\"\n" +
                "                     },\n" +
                "                     \"start_location\" : {\n" +
                "                        \"lat\" : 48.6441151,\n" +
                "                        \"lng\" : 11.7870823\n" +
                "                     },\n" +
                "                     \"travel_mode\" : \"WALKING\"\n" +
                "                  }\n" +
                "               ],\n" +
                "               \"traffic_speed_entry\" : [],\n" +
                "               \"via_waypoint\" : []\n" +
                "            },\n" +
                "            {\n" +
                "               \"distance\" : {\n" +
                "                  \"text\" : \"0,2 km\",\n" +
                "                  \"value\" : 164\n" +
                "               },\n" +
                "               \"duration\" : {\n" +
                "                  \"text\" : \"2 Minuten\",\n" +
                "                  \"value\" : 122\n" +
                "               },\n" +
                "               \"end_address\" : \"Bahnhofstraße 13, 84048 Mainburg, Deutschland\",\n" +
                "               \"end_location\" : {\n" +
                "                  \"lat\" : 48.6411883,\n" +
                "                  \"lng\" : 11.7837654\n" +
                "               },\n" +
                "               \"start_address\" : \"Promenadenweg 1, 84048 Mainburg, Deutschland\",\n" +
                "               \"start_location\" : {\n" +
                "                  \"lat\" : 48.6423608,\n" +
                "                  \"lng\" : 11.7838781\n" +
                "               },\n" +
                "               \"steps\" : [\n" +
                "                  {\n" +
                "                     \"distance\" : {\n" +
                "                        \"text\" : \"20 m\",\n" +
                "                        \"value\" : 20\n" +
                "                     },\n" +
                "                     \"duration\" : {\n" +
                "                        \"text\" : \"1 Minute\",\n" +
                "                        \"value\" : 15\n" +
                "                     },\n" +
                "                     \"end_location\" : {\n" +
                "                        \"lat\" : 48.6421792,\n" +
                "                        \"lng\" : 11.7838582\n" +
                "                     },\n" +
                "                     \"html_instructions\" : \"Auf \\u003cb\\u003ePromenadenweg\\u003c/b\\u003e nach \\u003cb\\u003eSüden\\u003c/b\\u003e Richtung \\u003cb\\u003eBahnhofstraße\\u003c/b\\u003e\",\n" +
                "                     \"polyline\" : {\n" +
                "                        \"points\" : \"wm{gHgp|fAb@B\"\n" +
                "                     },\n" +
                "                     \"start_location\" : {\n" +
                "                        \"lat\" : 48.6423608,\n" +
                "                        \"lng\" : 11.7838781\n" +
                "                     },\n" +
                "                     \"travel_mode\" : \"WALKING\"\n" +
                "                  },\n" +
                "                  {\n" +
                "                     \"distance\" : {\n" +
                "                        \"text\" : \"27 m\",\n" +
                "                        \"value\" : 27\n" +
                "                     },\n" +
                "                     \"duration\" : {\n" +
                "                        \"text\" : \"1 Minute\",\n" +
                "                        \"value\" : 18\n" +
                "                     },\n" +
                "                     \"end_location\" : {\n" +
                "                        \"lat\" : 48.64213729999999,\n" +
                "                        \"lng\" : 11.7842218\n" +
                "                     },\n" +
                "                     \"html_instructions\" : \"\\u003cb\\u003eLinks\\u003c/b\\u003e abbiegen auf \\u003cb\\u003eBahnhofstraße\\u003c/b\\u003e\",\n" +
                "                     \"maneuver\" : \"turn-left\",\n" +
                "                     \"polyline\" : {\n" +
                "                        \"points\" : \"sl{gHcp|fABg@B_@\"\n" +
                "                     },\n" +
                "                     \"start_location\" : {\n" +
                "                        \"lat\" : 48.6421792,\n" +
                "                        \"lng\" : 11.7838582\n" +
                "                     },\n" +
                "                     \"travel_mode\" : \"WALKING\"\n" +
                "                  },\n" +
                "                  {\n" +
                "                     \"distance\" : {\n" +
                "                        \"text\" : \"0,1 km\",\n" +
                "                        \"value\" : 113\n" +
                "                     },\n" +
                "                     \"duration\" : {\n" +
                "                        \"text\" : \"1 Minute\",\n" +
                "                        \"value\" : 86\n" +
                "                     },\n" +
                "                     \"end_location\" : {\n" +
                "                        \"lat\" : 48.6411962,\n" +
                "                        \"lng\" : 11.7837155\n" +
                "                     },\n" +
                "                     \"html_instructions\" : \"\\u003cb\\u003eRechts\\u003c/b\\u003e abbiegen\",\n" +
                "                     \"maneuver\" : \"turn-right\",\n" +
                "                     \"polyline\" : {\n" +
                "                        \"points\" : \"kl{gHkr|fA\\\\?F@L@PDH@VNh@b@h@b@\"\n" +
                "                     },\n" +
                "                     \"start_location\" : {\n" +
                "                        \"lat\" : 48.64213729999999,\n" +
                "                        \"lng\" : 11.7842218\n" +
                "                     },\n" +
                "                     \"travel_mode\" : \"WALKING\"\n" +
                "                  },\n" +
                "                  {\n" +
                "                     \"distance\" : {\n" +
                "                        \"text\" : \"4 m\",\n" +
                "                        \"value\" : 4\n" +
                "                     },\n" +
                "                     \"duration\" : {\n" +
                "                        \"text\" : \"1 Minute\",\n" +
                "                        \"value\" : 3\n" +
                "                     },\n" +
                "                     \"end_location\" : {\n" +
                "                        \"lat\" : 48.6411883,\n" +
                "                        \"lng\" : 11.7837654\n" +
                "                     },\n" +
                "                     \"html_instructions\" : \"\\u003cb\\u003eLinks\\u003c/b\\u003e abbiegen\",\n" +
                "                     \"maneuver\" : \"turn-left\",\n" +
                "                     \"polyline\" : {\n" +
                "                        \"points\" : \"of{gHgo|fA@I\"\n" +
                "                     },\n" +
                "                     \"start_location\" : {\n" +
                "                        \"lat\" : 48.6411962,\n" +
                "                        \"lng\" : 11.7837155\n" +
                "                     },\n" +
                "                     \"travel_mode\" : \"WALKING\"\n" +
                "                  }\n" +
                "               ],\n" +
                "               \"traffic_speed_entry\" : [],\n" +
                "               \"via_waypoint\" : []\n" +
                "            },\n" +
                "            {\n" +
                "               \"distance\" : {\n" +
                "                  \"text\" : \"0,3 km\",\n" +
                "                  \"value\" : 274\n" +
                "               },\n" +
                "               \"duration\" : {\n" +
                "                  \"text\" : \"4 Minuten\",\n" +
                "                  \"value\" : 219\n" +
                "               },\n" +
                "               \"end_address\" : \"Marktpl. 8, 84048 Mainburg, Deutschland\",\n" +
                "               \"end_location\" : {\n" +
                "                  \"lat\" : 48.6410177,\n" +
                "                  \"lng\" : 11.7864612\n" +
                "               },\n" +
                "               \"start_address\" : \"Bahnhofstraße 13, 84048 Mainburg, Deutschland\",\n" +
                "               \"start_location\" : {\n" +
                "                  \"lat\" : 48.6411883,\n" +
                "                  \"lng\" : 11.7837654\n" +
                "               },\n" +
                "               \"steps\" : [\n" +
                "                  {\n" +
                "                     \"distance\" : {\n" +
                "                        \"text\" : \"68 m\",\n" +
                "                        \"value\" : 68\n" +
                "                     },\n" +
                "                     \"duration\" : {\n" +
                "                        \"text\" : \"1 Minute\",\n" +
                "                        \"value\" : 51\n" +
                "                     },\n" +
                "                     \"end_location\" : {\n" +
                "                        \"lat\" : 48.6410446,\n" +
                "                        \"lng\" : 11.7846677\n" +
                "                     },\n" +
                "                     \"html_instructions\" : \"Nach \\u003cb\\u003eOsten\\u003c/b\\u003e Richtung \\u003cb\\u003ePaul-Nappenbach-Straße\\u003c/b\\u003e\",\n" +
                "                     \"polyline\" : {\n" +
                "                        \"points\" : \"mf{gHqo|fA\\\\sD\"\n" +
                "                     },\n" +
                "                     \"start_location\" : {\n" +
                "                        \"lat\" : 48.6411883,\n" +
                "                        \"lng\" : 11.7837654\n" +
                "                     },\n" +
                "                     \"travel_mode\" : \"WALKING\"\n" +
                "                  },\n" +
                "                  {\n" +
                "                     \"distance\" : {\n" +
                "                        \"text\" : \"11 m\",\n" +
                "                        \"value\" : 11\n" +
                "                     },\n" +
                "                     \"duration\" : {\n" +
                "                        \"text\" : \"1 Minute\",\n" +
                "                        \"value\" : 7\n" +
                "                     },\n" +
                "                     \"end_location\" : {\n" +
                "                        \"lat\" : 48.6409485,\n" +
                "                        \"lng\" : 11.7846564\n" +
                "                     },\n" +
                "                     \"html_instructions\" : \"\\u003cb\\u003eRechts\\u003c/b\\u003e abbiegen auf \\u003cb\\u003ePaul-Nappenbach-Straße\\u003c/b\\u003e\",\n" +
                "                     \"maneuver\" : \"turn-right\",\n" +
                "                     \"polyline\" : {\n" +
                "                        \"points\" : \"oe{gHeu|fAP@\"\n" +
                "                     },\n" +
                "                     \"start_location\" : {\n" +
                "                        \"lat\" : 48.6410446,\n" +
                "                        \"lng\" : 11.7846677\n" +
                "                     },\n" +
                "                     \"travel_mode\" : \"WALKING\"\n" +
                "                  },\n" +
                "                  {\n" +
                "                     \"distance\" : {\n" +
                "                        \"text\" : \"28 m\",\n" +
                "                        \"value\" : 28\n" +
                "                     },\n" +
                "                     \"duration\" : {\n" +
                "                        \"text\" : \"1 Minute\",\n" +
                "                        \"value\" : 27\n" +
                "                     },\n" +
                "                     \"end_location\" : {\n" +
                "                        \"lat\" : 48.6409244,\n" +
                "                        \"lng\" : 11.7850356\n" +
                "                     },\n" +
                "                     \"html_instructions\" : \"\\u003cb\\u003eLinks\\u003c/b\\u003e Richtung \\u003cb\\u003eAm Graben\\u003c/b\\u003e abbiegen\",\n" +
                "                     \"maneuver\" : \"turn-left\",\n" +
                "                     \"polyline\" : {\n" +
                "                        \"points\" : \"}d{gHcu|fADkA\"\n" +
                "                     },\n" +
                "                     \"start_location\" : {\n" +
                "                        \"lat\" : 48.6409485,\n" +
                "                        \"lng\" : 11.7846564\n" +
                "                     },\n" +
                "                     \"travel_mode\" : \"WALKING\"\n" +
                "                  },\n" +
                "                  {\n" +
                "                     \"distance\" : {\n" +
                "                        \"text\" : \"20 m\",\n" +
                "                        \"value\" : 20\n" +
                "                     },\n" +
                "                     \"duration\" : {\n" +
                "                        \"text\" : \"1 Minute\",\n" +
                "                        \"value\" : 15\n" +
                "                     },\n" +
                "                     \"end_location\" : {\n" +
                "                        \"lat\" : 48.6407468,\n" +
                "                        \"lng\" : 11.7850119\n" +
                "                     },\n" +
                "                     \"html_instructions\" : \"\\u003cb\\u003eRechts\\u003c/b\\u003e abbiegen auf \\u003cb\\u003eAm Graben\\u003c/b\\u003e\",\n" +
                "                     \"maneuver\" : \"turn-right\",\n" +
                "                     \"polyline\" : {\n" +
                "                        \"points\" : \"wd{gHow|fA`@D\"\n" +
                "                     },\n" +
                "                     \"start_location\" : {\n" +
                "                        \"lat\" : 48.6409244,\n" +
                "                        \"lng\" : 11.7850356\n" +
                "                     },\n" +
                "                     \"travel_mode\" : \"WALKING\"\n" +
                "                  },\n" +
                "                  {\n" +
                "                     \"distance\" : {\n" +
                "                        \"text\" : \"87 m\",\n" +
                "                        \"value\" : 87\n" +
                "                     },\n" +
                "                     \"duration\" : {\n" +
                "                        \"text\" : \"1 Minute\",\n" +
                "                        \"value\" : 66\n" +
                "                     },\n" +
                "                     \"end_location\" : {\n" +
                "                        \"lat\" : 48.6412028,\n" +
                "                        \"lng\" : 11.7856968\n" +
                "                     },\n" +
                "                     \"html_instructions\" : \"\\u003cb\\u003eLinks\\u003c/b\\u003e abbiegen auf \\u003cb\\u003eBrandstatt\\u003c/b\\u003e\",\n" +
                "                     \"maneuver\" : \"turn-left\",\n" +
                "                     \"polyline\" : {\n" +
                "                        \"points\" : \"uc{gHiw|fA@a@?CAEACAAGEEA?AAA?AAA?E?M?O?C?CAAAAAAQEk@O\"\n" +
                "                     },\n" +
                "                     \"start_location\" : {\n" +
                "                        \"lat\" : 48.6407468,\n" +
                "                        \"lng\" : 11.7850119\n" +
                "                     },\n" +
                "                     \"travel_mode\" : \"WALKING\"\n" +
                "                  },\n" +
                "                  {\n" +
                "                     \"distance\" : {\n" +
                "                        \"text\" : \"37 m\",\n" +
                "                        \"value\" : 37\n" +
                "                     },\n" +
                "                     \"duration\" : {\n" +
                "                        \"text\" : \"1 Minute\",\n" +
                "                        \"value\" : 30\n" +
                "                     },\n" +
                "                     \"end_location\" : {\n" +
                "                        \"lat\" : 48.6411015,\n" +
                "                        \"lng\" : 11.78617\n" +
                "                     },\n" +
                "                     \"html_instructions\" : \"\\u003cb\\u003eRechts\\u003c/b\\u003e abbiegen auf \\u003cb\\u003eLiebfrauenstraße\\u003c/b\\u003e\",\n" +
                "                     \"maneuver\" : \"turn-right\",\n" +
                "                     \"polyline\" : {\n" +
                "                        \"points\" : \"of{gHs{|fAR}A\"\n" +
                "                     },\n" +
                "                     \"start_location\" : {\n" +
                "                        \"lat\" : 48.6412028,\n" +
                "                        \"lng\" : 11.7856968\n" +
                "                     },\n" +
                "                     \"travel_mode\" : \"WALKING\"\n" +
                "                  },\n" +
                "                  {\n" +
                "                     \"distance\" : {\n" +
                "                        \"text\" : \"23 m\",\n" +
                "                        \"value\" : 23\n" +
                "                     },\n" +
                "                     \"duration\" : {\n" +
                "                        \"text\" : \"1 Minute\",\n" +
                "                        \"value\" : 23\n" +
                "                     },\n" +
                "                     \"end_location\" : {\n" +
                "                        \"lat\" : 48.6410177,\n" +
                "                        \"lng\" : 11.7864612\n" +
                "                     },\n" +
                "                     \"html_instructions\" : \"Weiter auf \\u003cb\\u003eMarktpl.\\u003c/b\\u003e\",\n" +
                "                     \"polyline\" : {\n" +
                "                        \"points\" : \"{e{gHq~|fAF[F]\"\n" +
                "                     },\n" +
                "                     \"start_location\" : {\n" +
                "                        \"lat\" : 48.6411015,\n" +
                "                        \"lng\" : 11.78617\n" +
                "                     },\n" +
                "                     \"travel_mode\" : \"WALKING\"\n" +
                "                  }\n" +
                "               ],\n" +
                "               \"traffic_speed_entry\" : [],\n" +
                "               \"via_waypoint\" : []\n" +
                "            },\n" +
                "            {\n" +
                "               \"distance\" : {\n" +
                "                  \"text\" : \"0,2 km\",\n" +
                "                  \"value\" : 166\n" +
                "               },\n" +
                "               \"duration\" : {\n" +
                "                  \"text\" : \"4 Minuten\",\n" +
                "                  \"value\" : 215\n" +
                "               },\n" +
                "               \"end_address\" : \"Salvatorberg 2, 84048 Mainburg, Deutschland\",\n" +
                "               \"end_location\" : {\n" +
                "                  \"lat\" : 48.64004389999999,\n" +
                "                  \"lng\" : 11.7879434\n" +
                "               },\n" +
                "               \"start_address\" : \"Marktpl. 8, 84048 Mainburg, Deutschland\",\n" +
                "               \"start_location\" : {\n" +
                "                  \"lat\" : 48.6410177,\n" +
                "                  \"lng\" : 11.7864612\n" +
                "               },\n" +
                "               \"steps\" : [\n" +
                "                  {\n" +
                "                     \"distance\" : {\n" +
                "                        \"text\" : \"71 m\",\n" +
                "                        \"value\" : 71\n" +
                "                     },\n" +
                "                     \"duration\" : {\n" +
                "                        \"text\" : \"2 Minuten\",\n" +
                "                        \"value\" : 91\n" +
                "                     },\n" +
                "                     \"end_location\" : {\n" +
                "                        \"lat\" : 48.6406615,\n" +
                "                        \"lng\" : 11.7872507\n" +
                "                     },\n" +
                "                     \"html_instructions\" : \"Auf \\u003cb\\u003eMarktpl.\\u003c/b\\u003e nach \\u003cb\\u003eSüdosten\\u003c/b\\u003e Richtung \\u003cb\\u003eGabelsbergerstraße\\u003c/b\\u003e\",\n" +
                "                     \"polyline\" : {\n" +
                "                        \"points\" : \"ke{gHk`}fABI\\\\mA`@}@BG\"\n" +
                "                     },\n" +
                "                     \"start_location\" : {\n" +
                "                        \"lat\" : 48.6410177,\n" +
                "                        \"lng\" : 11.7864612\n" +
                "                     },\n" +
                "                     \"travel_mode\" : \"WALKING\"\n" +
                "                  },\n" +
                "                  {\n" +
                "                     \"distance\" : {\n" +
                "                        \"text\" : \"0,1 km\",\n" +
                "                        \"value\" : 95\n" +
                "                     },\n" +
                "                     \"duration\" : {\n" +
                "                        \"text\" : \"2 Minuten\",\n" +
                "                        \"value\" : 124\n" +
                "                     },\n" +
                "                     \"end_location\" : {\n" +
                "                        \"lat\" : 48.64004389999999,\n" +
                "                        \"lng\" : 11.7879434\n" +
                "                     },\n" +
                "                     \"html_instructions\" : \"Weiter auf \\u003cb\\u003eKarmeliterweg\\u003c/b\\u003e\\u003cdiv style=\\\"font-size:0.9em\\\"\\u003eTreppe nehmen\\u003c/div\\u003e\",\n" +
                "                     \"polyline\" : {\n" +
                "                        \"points\" : \"cc{gHie}fAHWDOP[Tk@TWRODA@?PN\"\n" +
                "                     },\n" +
                "                     \"start_location\" : {\n" +
                "                        \"lat\" : 48.6406615,\n" +
                "                        \"lng\" : 11.7872507\n" +
                "                     },\n" +
                "                     \"travel_mode\" : \"WALKING\"\n" +
                "                  }\n" +
                "               ],\n" +
                "               \"traffic_speed_entry\" : [],\n" +
                "               \"via_waypoint\" : []\n" +
                "            },\n" +
                "            {\n" +
                "               \"distance\" : {\n" +
                "                  \"text\" : \"0,4 km\",\n" +
                "                  \"value\" : 350\n" +
                "               },\n" +
                "               \"duration\" : {\n" +
                "                  \"text\" : \"4 Minuten\",\n" +
                "                  \"value\" : 251\n" +
                "               },\n" +
                "               \"end_address\" : \"Kellerstraße 7, 84048 Mainburg, Deutschland\",\n" +
                "               \"end_location\" : {\n" +
                "                  \"lat\" : 48.641611,\n" +
                "                  \"lng\" : 11.7899266\n" +
                "               },\n" +
                "               \"start_address\" : \"Salvatorberg 2, 84048 Mainburg, Deutschland\",\n" +
                "               \"start_location\" : {\n" +
                "                  \"lat\" : 48.64004389999999,\n" +
                "                  \"lng\" : 11.7879434\n" +
                "               },\n" +
                "               \"steps\" : [\n" +
                "                  {\n" +
                "                     \"distance\" : {\n" +
                "                        \"text\" : \"0,2 km\",\n" +
                "                        \"value\" : 161\n" +
                "                     },\n" +
                "                     \"duration\" : {\n" +
                "                        \"text\" : \"2 Minuten\",\n" +
                "                        \"value\" : 119\n" +
                "                     },\n" +
                "                     \"end_location\" : {\n" +
                "                        \"lat\" : 48.6401328,\n" +
                "                        \"lng\" : 11.789633\n" +
                "                     },\n" +
                "                     \"html_instructions\" : \"Auf \\u003cb\\u003eSalvatorberg\\u003c/b\\u003e nach \\u003cb\\u003eSüdosten\\u003c/b\\u003e\",\n" +
                "                     \"polyline\" : {\n" +
                "                        \"points\" : \"g_{gHsi}fA\\\\_AJe@H{@Dy@@e@EYIU[WSME?GD\"\n" +
                "                     },\n" +
                "                     \"start_location\" : {\n" +
                "                        \"lat\" : 48.64004389999999,\n" +
                "                        \"lng\" : 11.7879434\n" +
                "                     },\n" +
                "                     \"travel_mode\" : \"WALKING\"\n" +
                "                  },\n" +
                "                  {\n" +
                "                     \"distance\" : {\n" +
                "                        \"text\" : \"33 m\",\n" +
                "                        \"value\" : 33\n" +
                "                     },\n" +
                "                     \"duration\" : {\n" +
                "                        \"text\" : \"1 Minute\",\n" +
                "                        \"value\" : 23\n" +
                "                     },\n" +
                "                     \"end_location\" : {\n" +
                "                        \"lat\" : 48.6404024,\n" +
                "                        \"lng\" : 11.789786\n" +
                "                     },\n" +
                "                     \"html_instructions\" : \"Leicht \\u003cb\\u003erechts\\u003c/b\\u003e abbiegen, um auf \\u003cb\\u003eSalvatorberg\\u003c/b\\u003e zu bleiben\",\n" +
                "                     \"maneuver\" : \"turn-slight-right\",\n" +
                "                     \"polyline\" : {\n" +
                "                        \"points\" : \"y_{gHet}fAQUc@I\"\n" +
                "                     },\n" +
                "                     \"start_location\" : {\n" +
                "                        \"lat\" : 48.6401328,\n" +
                "                        \"lng\" : 11.789633\n" +
                "                     },\n" +
                "                     \"travel_mode\" : \"WALKING\"\n" +
                "                  },\n" +
                "                  {\n" +
                "                     \"distance\" : {\n" +
                "                        \"text\" : \"0,1 km\",\n" +
                "                        \"value\" : 141\n" +
                "                     },\n" +
                "                     \"duration\" : {\n" +
                "                        \"text\" : \"2 Minuten\",\n" +
                "                        \"value\" : 98\n" +
                "                     },\n" +
                "                     \"end_location\" : {\n" +
                "                        \"lat\" : 48.64162,\n" +
                "                        \"lng\" : 11.7901355\n" +
                "                     },\n" +
                "                     \"html_instructions\" : \"Weiter auf \\u003cb\\u003eKellerstraße\\u003c/b\\u003e\",\n" +
                "                     \"polyline\" : {\n" +
                "                        \"points\" : \"oa{gHeu}fA{@e@SK]Oa@ISCWCQ?K@KDMD\"\n" +
                "                     },\n" +
                "                     \"start_location\" : {\n" +
                "                        \"lat\" : 48.6404024,\n" +
                "                        \"lng\" : 11.789786\n" +
                "                     },\n" +
                "                     \"travel_mode\" : \"WALKING\"\n" +
                "                  },\n" +
                "                  {\n" +
                "                     \"distance\" : {\n" +
                "                        \"text\" : \"15 m\",\n" +
                "                        \"value\" : 15\n" +
                "                     },\n" +
                "                     \"duration\" : {\n" +
                "                        \"text\" : \"1 Minute\",\n" +
                "                        \"value\" : 11\n" +
                "                     },\n" +
                "                     \"end_location\" : {\n" +
                "                        \"lat\" : 48.641611,\n" +
                "                        \"lng\" : 11.7899266\n" +
                "                     },\n" +
                "                     \"html_instructions\" : \"\\u003cb\\u003eLinks\\u003c/b\\u003e abbiegen\\u003cdiv style=\\\"font-size:0.9em\\\"\\u003eDas Ziel befindet sich auf der rechten Seite.\\u003c/div\\u003e\",\n" +
                "                     \"maneuver\" : \"turn-left\",\n" +
                "                     \"polyline\" : {\n" +
                "                        \"points\" : \"ci{gHkw}fA@h@\"\n" +
                "                     },\n" +
                "                     \"start_location\" : {\n" +
                "                        \"lat\" : 48.64162,\n" +
                "                        \"lng\" : 11.7901355\n" +
                "                     },\n" +
                "                     \"travel_mode\" : \"WALKING\"\n" +
                "                  }\n" +
                "               ],\n" +
                "               \"traffic_speed_entry\" : [],\n" +
                "               \"via_waypoint\" : []\n" +
                "            }\n" +
                "         ],\n" +
                "         \"overview_polyline\" : {\n" +
                "            \"points\" : \"gh|gHgn}fAv@z@x@\\\\p@Zj@\\\\AnAIxAA`AHb@v@tBt@m@lBoBf@a@^Yb@|B^dBp@bCh@jBf@pA\\\\l@XVTHhAHb@BBg@B_@\\\\?TBZFVNh@b@h@b@@I\\\\sDP@DkA`@D@e@CIOKCK?e@CCSGk@OR}ANy@`@wAd@eANg@f@gAh@g@FAPN\\\\_AJe@H{@F_BOo@o@e@MDQUc@IoAq@]Oa@Ik@G]@YJ@h@\"\n" +
                "         },\n" +
                "         \"summary\" : \"Abenstalstraße\",\n" +
                "         \"warnings\" : [\n" +
                "            \"Der Routenplaner für Fußgänger ist noch im Beta-Stadium. Sei vorsichtig! – Auf dieser Route gibt es eventuell keine Bürgersteige oder Fußwege.\"\n" +
                "         ],\n" +
                "         \"waypoint_order\" : [ 0, 1, 2, 3, 4 ]\n" +
                "      }\n" +
                "   ],\n" +
                "   \"status\" : \"OK\"\n" +
                "}";
    }
}
