

import java.util.Stack;

public class StackSamples {

   
    static void basic() {
        Stack<Integer> s = new Stack<>();
        s.push(10); s.push(20);
        int top = s.peek();          
        int x = s.pop();             
        System.out.println(top + " " + x);
    }


    static void sortedPush(Stack<Integer> s, int x) {
        Stack<Integer> tmp = new Stack<>();
        while (!s.isEmpty() && s.peek() > x) tmp.push(s.pop());
        s.push(x);
        while (!tmp.isEmpty()) s.push(tmp.pop());
    }

 
    static void addDelete(Stack<Integer> s) {
        s.push(30);                 
        int removed = s.pop();      
        System.out.println(removed);
    }

  
}
