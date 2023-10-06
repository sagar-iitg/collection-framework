import java.util.LinkedHashMap;

public class LinkedHashMapExample {


    public static void main(String[] args)
    {
        LinkedHashMap<Integer,String> map=new LinkedHashMap<>();

        map.put(1,"one");
        map.put(2,"two");
        map.put(null,"null");
       // map.put(new Integer(55),"nullling");
        map.put(3,"three");
        map.put(4,"four");
        map.put(5,"five");
        map.put(6,"six");
        map.put(7,"seven");
        map.put(7,"eight");
        map.forEach((key,values)-> System.out.println(key+" "+values));
        System.out.println(map.values());
        System.out.println(map.keySet());
        System.out.println(map.entrySet());




    }
}
