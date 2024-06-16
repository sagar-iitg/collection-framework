package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTraverse {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);
        Collection<Integer> values = map.values();
        System.out.println(values);
        Set<String> keys = map.keySet();
        System.out.println(keys);
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        System.out.println(entries);

        map.forEach((key,value)->System.out.println(key+" "+value));
        System.out.println("---------");
        map.entrySet().forEach(entry->System.out.println(entry.getKey()+" "+entry.getValue()));
        for(Map.Entry<String ,Integer> entry:map.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}
