package map;

import java.util.HashMap;
import java.util.Map;

public class MapTraverse {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);

        map.forEach((key,value)->System.out.println(key+" "+value));
        System.out.println("---------");
        map.entrySet().forEach(entry->System.out.println(entry.getKey()+" "+entry.getValue()));
    }
}
