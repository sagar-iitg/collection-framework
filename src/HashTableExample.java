import java.util.*;



public class HashTableExample {




    public static <HashTable> void main(String[] args) {


        Hashtable<Integer,String> map=new Hashtable<>();

        //create
        map.put(1,"sagar");
        map.put(2,"nitish");
        //map.put(null,"null");


        //read


        System.out.println(map.get(1000));


        map.getClass();


        for(Map.Entry<Integer,String> m:map.entrySet())
        {
            System.out.println(m.getKey()+" "+m.getValue()+ " "+m.getClass());

        }

        System.out.println(map.values());
        System.out.println(map.keySet());
        System.out.println(map.entrySet());

       // map.forEach((x,y)-> System.out.println(x+" "+y));

    }
}
