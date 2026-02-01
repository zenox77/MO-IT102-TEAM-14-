

import java.util.*;

public class QueueSamples {


    static void basic() {
        Queue<Integer> q = new ArrayDeque<>();
        q.offer(10); q.offer(20);      
        int front = q.peek();          
        int gone = q.poll();           
        System.out.println(front + " " + gone);
    }


    static Queue<Integer> sortQueue(Queue<Integer> q) {
        List<Integer> list = new ArrayList<>();
        while (!q.isEmpty()) list.add(q.poll());
        Collections.sort(list);
        for (int v : list) q.offer(v);
        return q;
    }

    static void addDelete(Queue<Integer> q) {
        q.offer(30);                  
        int removed = q.poll();       
        System.out.println(removed);
    }

 
    static void merge(Queue<Integer> q1, Queue<Integer> q2) {
        while (!q2.isEmpty()) q1.offer(q2.poll());
    }
}
