/*
LinkedList (Singly) - Sample code/pseudocode (Java-style)
Use-case: dynamic payroll/attendance records with frequent inserts/deletes.
*/

public class LinkedListSamples {

    static class Node {
        int data;
        Node next;
        Node(int d) { data = d; }
    }

    // Basic use: 10 -> 20
    static Node basic() {
        Node head = new Node(10);
        head.next = new Node(20);
        return head;
    }

    // Sort and Insert: insert into a sorted linked list
    static Node sortedInsert(Node head, int x) {
        Node n = new Node(x);
        if (head == null || x <= head.data) { n.next = head; return n; }
        Node cur = head;
        while (cur.next != null && cur.next.data < x) cur = cur.next;
        n.next = cur.next; cur.next = n;
        return head;
    }

    // Add and Delete: delete by value
    static Node deleteValue(Node head, int x) {
        if (head == null) return null;
        if (head.data == x) return head.next;
        Node cur = head;
        while (cur.next != null && cur.next.data != x) cur = cur.next;
        if (cur.next != null) cur.next = cur.next.next;
        return head;
    }

    // Merge: merge two sorted linked lists
    static Node merge(Node a, Node b) {
        Node dummy = new Node(0), tail = dummy;
        while (a != null && b != null) {
            if (a.data <= b.data) { tail.next = a; a = a.next; }
            else { tail.next = b; b = b.next; }
            tail = tail.next;
        }
        tail.next = (a != null) ? a : b;
        return dummy.next;
    }
}
