package conversion.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Example {

    public static void main(String[] args) {
        List<Integer> list=List.of(1,2,3,4,5);
        Integer[] listArray = list.toArray(new Integer[0]);

        System.out.println(Arrays.toString(listArray));
    }
}
