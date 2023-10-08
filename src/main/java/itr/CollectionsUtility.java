package itr;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class CollectionsUtility {
    public static void main(String[] args) {

        List<Integer> list=List.of(1,2,3,4,5);
        System.out.println(Collections.max(list));
        System.out.println(Collections.min(list));
        list.forEach((Integer i)-> System.out.println(i));


    }
}
