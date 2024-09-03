package conversion.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Example5 {

    public static void main(String[] args) {

        // Example Map
        Map<String, Integer> map = new HashMap<>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);


        System.out.println(new ArrayList<>(map.keySet()));
        System.out.println(new ArrayList<>(map.values()));
        System.out.println(new ArrayList<>(map.entrySet()));
    }
}
