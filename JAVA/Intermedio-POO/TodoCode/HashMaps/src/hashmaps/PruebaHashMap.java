package hashmaps;

import java.util.HashMap;
import java.util.Map;

public class PruebaHashMap {
    public static void main(String[] args) {

        Map<Integer, String> maps = new HashMap<>();

        maps.put(1320, "Hello");
        maps.put(9720, "Gabriel");
        maps.put(320, "Playing with map");
        maps.put(130, "IsTrue?");

        if (maps.containsValue("Hello")) {
            System.out.println("The value 'Hello' is in the map");
            System.out.println("_".repeat(60));
        }

        System.out.println(maps.keySet());
        System.out.println(maps.values());
        System.out.println(maps.get(132)); //null
        System.out.println("_".repeat(60));

        boolean flag = maps.containsValue("Airplane");

        if (!flag) {
            return;
        }
    }
}
