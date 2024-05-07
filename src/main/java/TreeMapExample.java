import java.util.*;

public class TreeMapExample {


    public static void main(String[] args)
    {
        TreeMap<Integer,String> map=new TreeMap<>();

        map.put(5,"five");
        map.put(6,"six");
        map.put(2,"two");
        map.put(7,"seven");
        map.put(7,"eight");
        map.put(1,"one");

        // map.put(null,"null");   In TreeMap, inserting a null key is not allowed
        map.put(new Integer(55),"nullling");
        map.put(3,"three");
        map.put(4,"four");

        map.forEach((key,values)-> System.out.println(key+" "+values));
        System.out.println(map.values());
        System.out.println(map.keySet());
        System.out.println(map.entrySet());




    }
}
