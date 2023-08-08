package set;

import java.util.HashSet;
import java.util.List;

public class HashSetExample {

    public static void main(String[] args) {

        //int[] temp={1,3};
        List<Integer> list= List.of(1,2);
        List<Integer> list1= List.of(1,2);

        HashSet<List<Integer>> h=new HashSet<List<Integer>>();
        h.add(list);
        h.add(list1);
        System.out.println(h);


    }
}
