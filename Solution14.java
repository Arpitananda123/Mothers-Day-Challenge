import java.util.Stack;

public class Solution14 {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (String ch : tokens) {
            if (isOperator(ch)) {
                int b = stack.pop();
                int a = stack.pop();
                int res = performOperation(a, b, ch);
                stack.push(res);
            } else {
                stack.push(Integer.parseInt(ch));
            }
        }
        return stack.pop();
    }

    boolean isOperator(String ch) {
        return ch.equals("+") || ch.equals("-") || ch.equals("*") || ch.equals("/");
    }

    int performOperation(int a, int b, String operation) {
        switch (operation) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                return a / b;
            default:
                throw new IllegalArgumentException("Invalid operator: " + operation);
        }
    }

    // Main method to test the evalRPN function
    public static void main(String[] args) {
        Solution14 sol = new Solution14();

        // Example input: ["2", "1", "+", "3", "*"] => (2 + 1) * 3 = 9
        String[] tokens = {"2", "1", "+", "3", "*"};
        int result = sol.evalRPN(tokens);
        System.out.println("Result: " + result);  // Output should be 9
    }
    
}
