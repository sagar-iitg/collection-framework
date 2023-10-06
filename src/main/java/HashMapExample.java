import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import java.util.Set;

public class HashMapExample {


    public static void main(String[] args) {


        HashMap<Integer,String> map=new HashMap<>();

        //create
        map.put(1,"one");
        map.put(2,"two");
        map.put(null,null);

        map.put(3,null);
        map.put(4,null);
        map.put(5,"five");
        map.put(6,"six");

        map.put(7,"eight");







        //update

        map.put(7,"seven");
        //delete
        map.remove(null);
        map.remove(null);
        map.remove(120);
        map.remove(1,"one");


        String k = map.getOrDefault(2,"eight");
        System.out.println("ans"+ " "+ k);


        System.out.println("containsKey"+" "+ map.containsKey(2));
        System.out.println("containsKey"+" "+ map.containsKey(100));
        System.out.println("containsValue"+" "+map.containsValue(null));
        System.out.println("containsValue"+" "+map.containsValue("kmgfmkmk"));

        System.out.println(map.values());
        System.out.println(map.keySet());
        System.out.println(map.entrySet());
        System.out.println("isEmpty"+" "+map.isEmpty());

       // map.computeIfPresent(3,(k,v)->v+1);









        //map.getClass();


//        for(Map.Entry<Integer,String> m:map.entrySet())
//        {
//            System.out.println(m.getKey()+" "+m.getValue()+ " "+m.getClass());
//
//        }


        System.out.println("Iterate");
        map.forEach((x,y)-> System.out.println(x+" "+y));


        System.out.println("Entry Set------------");

        Set<Map.Entry<Integer, String>> entrySet = map.entrySet();

        System.out.println(entrySet);


        Set<Integer> keySet = map.keySet();
        System.out.println("map keys = " + keySet);


        Collection<String> values = map.values();
        System.out.println("map values = " + values);


        map.clear();
        System.out.println("map is Empty="+ map.isEmpty());


    }
}
