/*
Queue - Sample code/pseudocode (Java-style)
Use-case: processing employees in FIFO order (e.g., payroll run queue).
*/

import java.util.*;

public class QueueSamples {

    // Basic use
    static void basic() {
        Queue<Integer> q = new ArrayDeque<>();
        q.offer(10); q.offer(20);      // enqueue
        int front = q.peek();          // 10
        int gone = q.poll();           // dequeue 10
        System.out.println(front + " " + gone);
    }

    // Sort and Insert: sort by converting to list, then re-queue
    static Queue<Integer> sortQueue(Queue<Integer> q) {
        List<Integer> list = new ArrayList<>();
        while (!q.isEmpty()) list.add(q.poll());
        Collections.sort(list);
        for (int v : list) q.offer(v);
        return q;
    }

    // Add and Delete: enqueue / dequeue
    static void addDelete(Queue<Integer> q) {
        q.offer(30);                  // add
        int removed = q.poll();       // delete (front only)
        System.out.println(removed);
    }

    // Merge: append q2 into q1
    static void merge(Queue<Integer> q1, Queue<Integer> q2) {
        while (!q2.isEmpty()) q1.offer(q2.poll());
    }
}
