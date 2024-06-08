package conversion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Example2 {
    public static void main(String[] args) {
        List<Integer> al = new ArrayList<Integer>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        Object[] objects = al.toArray();
        Integer[] integers=  al.toArray(new Integer[0]);
        System.out.println(Arrays.toString(objects));
        System.out.println(Arrays.toString(integers));
        HashSet<Integer> set=new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(50);
        Integer[] setArray=set.toArray(new Integer[0]);
        System.out.println(Arrays.toString(setArray));

    }
}
