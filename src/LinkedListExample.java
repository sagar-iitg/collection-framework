import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class LinkedListExample {


    public static void main(String[] args) {


        LinkedList<Integer> arr = new LinkedList<>();

        //create
        arr.add(3);
        arr.add(2);
        arr.add(-5);
        arr.add(56);
       // arr.add(0, 1);
        arr.addLast(50);
        arr.add(25);
        arr.addFirst(23);
        //System.out.println(arr);
        arr.add(3,-213);

        System.out.println("Array is");
        System.out.println(arr);

        //Read
        System.out.println(arr.getLast());
        System.out.println(arr.getFirst());
        System.out.println(arr.get(4));
        System.out.println(arr.getClass());

        //Update
        System.out.println("Update");
        arr.set(4,-50);
        System.out.println(arr);


        //delete

        System.out.println("remove");
        //arr.remove(4);
        System.out.println(arr);
        arr.remove();

        System.out.println(arr);


        arr.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
       System.out.println("Decreasing Order");
       System.out.println(arr);
       Collections.sort(arr);
       System.out.println("Increasing Order");
       System.out.println(arr);

       int sz=arr.size();

        System.out.println(sz);

    }
}
