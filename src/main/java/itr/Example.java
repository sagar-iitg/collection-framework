package itr;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Example {


    public static void main(String[] args) {
        List<Integer> arr=new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);

        System.out.println("Iterating thorough iterator");

        Iterator<Integer> it=arr.iterator();

        while (it.hasNext())
        {
            int val=it.next();
            System.out.print(val+" ");
            if(val==3) it.remove();

        }
        System.out.println("\nfor each loop");

        for (int i: arr)
            System.out.print(i+" ");

        System.out.println("\nStream Method 1");
        arr.forEach(System.out::println);
        System.out.println("\nStream Method 2");

        arr.forEach((Integer i)-> System.out.println(i));




    }
}
