import java.util.Stack;

class MinStack {
    Stack<Integer> st = new Stack<>();
    Stack<Integer> minstack = new Stack<>();

    public void push(int val) {
        st.push(val);
        if (minstack.isEmpty() || val <= minstack.peek()) {
            minstack.push(val);
        } else {
            minstack.push(minstack.peek());
        }
    }

    public void pop() {
        st.pop();
        minstack.pop();
    }

    public int top() {
        return st.peek();
    }

    public int getMin() {
        return minstack.peek();
    }
}
class Solution11{
    public static void main(String[] args) {
        MinStack minStack = new MinStack();

        minStack.push(5);
        minStack.push(3);
        minStack.push(7);
        minStack.push(2);

        System.out.println("Top element: " + minStack.top());       // Output: 2
        System.out.println("Minimum element: " + minStack.getMin()); // Output: 2

        minStack.pop();
        System.out.println("Top element after pop: " + minStack.top());       // Output: 7
        System.out.println("Minimum element after pop: " + minStack.getMin()); // Output: 3

        minStack.pop();
        System.out.println("Minimum element after another pop: " + minStack.getMin()); // Output: 3
    }
}
