package Queue;

import java.util.Collections;
import java.util.PriorityQueue;

public class PrioQueue {
    public static void main(String [] args){
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        pq.add(56);
        pq.add(87);
        pq.add(98);
        pq.add(13);
        System.out.println(pq);
        System.out.println(pq.peek());
        System.out.println(pq.remove());
        System.out.println(pq.remove());
        System.out.println(pq.remove());
        System.out.println(pq.remove());

    }
}
