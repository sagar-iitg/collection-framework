package list;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample1 {


    public static void main(String[] args) {


        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(3);
        arr.add(2);
        arr.add(-5);
        arr.add(56);
        arr.add(0,1);

        System.out.println(arr);
//        arr.sort(new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o2-o1;
//            }
//        });
//
//        System.out.println("Decreasing Order");
//        System.out.println(arr);
        arr.sort(Collections.reverseOrder());
       // System.out.println("Increasing Order");
        System.out.println(arr);

        arr.add(90);
        int sz=arr.size();
        System.out.println(sz);




    }
}
