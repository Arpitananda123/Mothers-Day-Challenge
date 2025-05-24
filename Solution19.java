import java.util.ArrayDeque;
import java.util.Queue;

public class Solution19 {
    private Queue<Integer> q1;
    private Queue<Integer> q2;

    public Solution19() {
        q1 = new ArrayDeque<>();
        q2 = new ArrayDeque<>();
    }

    public void push(int x) {
        q2.add(x);
        while (!q1.isEmpty()) {
            q2.add(q1.poll());
        }

        // Swap q1 and q2
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
    }

    public int pop() {
        if (q1.isEmpty()) {
            return -1;
        }
        return q1.poll();
    }

    public int top() {
        if (q1.isEmpty()) {
            return -1;
        }
        return q1.peek();
    }

    public boolean empty() {
        return q1.isEmpty();
    }

    // Main method for testing
    public static void main(String[] args) {
        Solution19 stack = new Solution19();
        
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top element: " + stack.top());  // Output: 30
        System.out.println("Popped element: " + stack.pop()); // Output: 30
        System.out.println("Top element after pop: " + stack.top()); // Output: 20
        System.out.println("Is stack empty? " + stack.empty()); // Output: false

        stack.pop();
        stack.pop();
        System.out.println("Is stack empty after popping all? " + stack.empty()); // Output: true
    }
    
}
