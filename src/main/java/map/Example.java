package map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Example {

    public static void main(String[] args) {

        HashMap<Integer,Integer> map=new HashMap<>();
        System.out.println(map);
        map.put(1,3);
        System.out.println(map.remove(1));
        System.out.println(map.remove(10));
        System.out.println(map.get(25));

    }


}
