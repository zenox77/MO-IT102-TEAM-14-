/*
Stack - Sample code/pseudocode (Java-style)
Use-case: undo-like operations or nested processing steps in payroll workflow.
*/

import java.util.Stack;

public class StackSamples {

    // Basic use
    static void basic() {
        Stack<Integer> s = new Stack<>();
        s.push(10); s.push(20);
        int top = s.peek();          // 20
        int x = s.pop();             // removes 20
        System.out.println(top + " " + x);
    }

    // Sort and Insert: push in sorted order using a temp stack
    static void sortedPush(Stack<Integer> s, int x) {
        Stack<Integer> tmp = new Stack<>();
        while (!s.isEmpty() && s.peek() > x) tmp.push(s.pop());
        s.push(x);
        while (!tmp.isEmpty()) s.push(tmp.pop());
    }

    // Add and Delete: push / pop
    static void addDelete(Stack<Integer> s) {
        s.push(30);                  // add
        int removed = s.pop();       // delete (top only)
        System.out.println(removed);
    }

    // Merge: not typical for stacks; combining may break LIFO intent.
}
