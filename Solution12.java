import java.util.Stack;

public class Solution12 {
    private Stack<Integer> input;
    private Stack<Integer> output;

    public Solution12() {
        input = new Stack<>();
        output = new Stack<>();
    }

    // Push element x to the back of queue.
    public void push(int x) {
        input.push(x);
    }

    // Removes the element from in front of queue and returns that element.
    public int pop() {
        shiftStacks();
        return output.pop();
    }

    // Get the front element.
    public int peek() {
        shiftStacks();
        return output.peek();
    }

    // Returns whether the queue is empty.
    public boolean empty() {
        return input.isEmpty() && output.isEmpty();
    }

    // Helper method to shift elements from input to output when needed
    private void shiftStacks() {
        if (output.isEmpty()) {
            while (!input.isEmpty()) {
                output.push(input.pop());
            }
        }
    }

    // Main method for basic testing
    public static void main(String[] args) {
        Solution12 queue = new Solution12();

        queue.push(1);
        queue.push(2);
        System.out.println("Peek: " + queue.peek()); // returns 1
        System.out.println("Pop: " + queue.pop());   // returns 1
        System.out.println("Empty: " + queue.empty()); // returns false
    }
}
