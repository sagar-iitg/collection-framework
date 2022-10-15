import java.util.HashMap;
import java.util.Map;

public class HashMapExample {


    public static void main(String[] args) {


        HashMap<Integer,String> map=new HashMap<>();

        //create
        map.put(1,"one");
        map.put(2,"two");
        map.put(null,"null");
        map.put(3,"three");
        map.put(4,"four");
        map.put(5,"five");
        map.put(6,"six");
        map.put(7,"seven");
        map.put(7,"eight");





        //read


       // System.out.println(map.get(1000));


        //map.getClass();


//        for(Map.Entry<Integer,String> m:map.entrySet())
//        {
//            System.out.println(m.getKey()+" "+m.getValue()+ " "+m.getClass());
//
//        }


        map.forEach((x,y)-> System.out.println(x+" "+y));

    }
}
