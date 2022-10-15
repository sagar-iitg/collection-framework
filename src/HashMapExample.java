import java.util.HashMap;
import java.util.Map;

public class HashMapExample {


    public static void main(String[] args) {


        HashMap<Integer,String> map=new HashMap<>();

        map.put(1,"sagar");
        map.put(2,"nitish");


        for(Map.Entry<Integer,String> m:map.entrySet())
        {
            System.out.println(m.getKey()+" "+m.getValue()+ " "+m.getClass());

        }


        map.forEach((x,y)-> System.out.println(x+" "+y));

    }
}
