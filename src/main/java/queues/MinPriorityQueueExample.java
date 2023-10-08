package queues;

import java.util.Collection;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class MinPriorityQueueExample {


    public static void main(String[] args) {

        Queue<Integer> minPQ=new PriorityQueue<>();
        minPQ.add(1);
        minPQ.add(1011);
        minPQ.add(15);
        minPQ.add(11);

        minPQ.forEach(System.out::println);

        Iterator<Integer> it=minPQ.iterator();

        while (it.hasNext()){
            int val=it.next();
            System.out.println(val);
        }
        System.out.println("-----");
        //remove top elements from PQ
        while (!minPQ.isEmpty())
        {
            int min=minPQ.poll();

            System.out.println(min);
        }
        System.out.println("-----");
        minPQ.forEach(System.out::println);


    }
}
