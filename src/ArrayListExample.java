import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class ArrayListExample extends ArrayList{


    public static void main(String[] args) {


        //String ,Integer, ,Long,  FLoat, Double Short, Byte, Boolean, Character



        ArrayList<Long> arr=new ArrayList<>();

        //Create
        arr.add(25L);
        arr.add(33l);
        arr.add(27l);
        arr.add(3444444444445543444L);

        arr.forEach(x-> System.out.print(x+" "));



        System.out.println("\nread 0th element");
        //Read
        System.out.println(arr.get(0));



        System.out.println("update at index 0");
        //update
        Long l=arr.set(0,32l);
       // System.out.println(l);
        arr.
        forEach(x-> System.out.print(x+" "));

        System.out.println("\ndelete");
        //delete
        arr.remove(0);
        arr.forEach(x-> System.out.print(x+" "));


        System.out.println("\n Add another list");
        ArrayList<Number> a=new ArrayList<>();
        a.add(7);
        a.add(8);
        a.add(90);
        a.add(0);
        a.addAll(0,arr);
        System.out.println(a);
        System.out.println(arr);


        //serach Operation

        Boolean b=arr.contains(33l);
        System.out.println(b);

        Boolean x=a.containsAll(arr);
        System.out.println(x);

        System.out.println("\nclear the list");


        arr.clear();
        System.out.println(arr);





    }
}
