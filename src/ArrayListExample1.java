import java.lang.reflect.Array;
import java.util.ArrayList;

public class ArrayListExample1 {


    public static void main(String[] args) {


        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(10);
        arr.add(20);
        arr.add(30);

        ArrayList<Integer> arr1=new ArrayList<>();
        arr1.add(10);
        arr1.add(20);
        arr1.add(30);


        Boolean b=arr.equals(arr1);
        System.out.println(b);
        System.out.println(arr.hashCode());
        System.out.println(arr1.hashCode());



    }
}
