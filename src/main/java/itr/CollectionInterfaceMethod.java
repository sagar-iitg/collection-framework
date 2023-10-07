package itr;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CollectionInterfaceMethod {

    public static void main(String[] args) {

        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        // size
        System.out.println(list.size());

        //contains
        System.out.println(list.contains(7));
        list.add(7);
        System.out.println(list.contains(7));

        list.forEach(System.out::println);
        //remove using index
        System.out.println(list.remove(3));
        list.forEach(System.out::println);


        //remove using object , remove the first occurrence of the value
        list.remove(Integer.valueOf(3));
        System.out.println(list.contains(3));
       // System.out.println(list.remove(10));
        LinkedList<Integer> linkedList=new LinkedList<>();
        linkedList.add(21);
        linkedList.add(22);
        linkedList.add(27);
        list.addAll(linkedList);

        System.out.println(list.containsAll(linkedList));
        list.remove(Integer.valueOf(27));

        System.out.println(list.containsAll(linkedList));
        System.out.println(list);
        list.removeAll(linkedList);
        System.out.println(list);
        list.clear();
        System.out.println(list.isEmpty());







    }


}
