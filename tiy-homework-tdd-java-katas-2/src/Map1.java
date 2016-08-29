import java.util.HashMap;
import java.util.Map;

/**
 * Created by davehochstrasser on 8/26/16.
 */
public class Map1 {
    public static Map<String, String> mapBully(Map<String, String> map) {
        if (map.containsKey("a")) {
            map.put("b", map.get("a"));
            map.put("a", "");
        }
        return map;
    }

    public static HashMap<String, String> mapShare(HashMap<String, String> map) {
        if (map.containsKey("a")) {

            map.put("b", (map.get("a")));
            map.remove("c");
        }
        return map;
    }

    public static HashMap<String, String> mapAB(HashMap<String, String> datas) {
        if ((datas.containsKey("a")) & (datas.containsKey("b"))) {

            datas.put("ab", (datas.get("a")) + (datas.get("b")));
        }
        return datas;
    }

    public static HashMap<String, String> topping1(HashMap<String, String> map2) {
        map2.put("bread", "butter");
        String x = "cherry";
        if (map2.containsKey("ice cream")) {
            map2.put("ice cream", x);
        }
        return map2;
    }

    public static HashMap<String, String> topping2(HashMap<String, String> map) {

        if (map.containsKey("ice cream")) {
            map.put("yogurt", map.get("ice cream"));
            if (map.containsKey("spinach")) {
                map.put("spinach", "nuts");
            }
        }
        return map;
    }

    public static HashMap<String, String> topping3(HashMap<String, String> map) {
        if (map.containsKey("potato")) {
            map.put("fries",map.get("potato"));
        }
        if(map.containsKey("salad")) {
            map.put("spinach",map.get("salad"));
        }
        return map;
    }

}
