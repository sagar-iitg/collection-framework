package queues;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class MaxPriorityQueueExample {


    public static void main(String[] args) {

        //max priority queue, used to solve problem of max heap
        Queue<Integer> minPQ=new PriorityQueue<>((a,b)->b-a);
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
