

public class LinkedListSamples {

    static class Node {
        int data;
        Node next;
        Node(int d) { data = d; }
    }


    static Node basic() {
        Node head = new Node(10);
        head.next = new Node(20);
        return head;
    }


    static Node sortedInsert(Node head, int x) {
        Node n = new Node(x);
        if (head == null || x <= head.data) { n.next = head; return n; }
        Node cur = head;
        while (cur.next != null && cur.next.data < x) cur = cur.next;
        n.next = cur.next; cur.next = n;
        return head;
    }


    static Node deleteValue(Node head, int x) {
        if (head == null) return null;
        if (head.data == x) return head.next;
        Node cur = head;
        while (cur.next != null && cur.next.data != x) cur = cur.next;
        if (cur.next != null) cur.next = cur.next.next;
        return head;
    }


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
