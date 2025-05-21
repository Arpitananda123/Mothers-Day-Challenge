import java.util.Stack;

public class Solution16 {
     public String minRemoveToMakeValid(String s) {
        Stack<Integer> st = new Stack<>();
        char ch = '!'; // Placeholder for invalid parentheses

        // First pass to mark unmatched closing brackets
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                st.push(i);
            } else if (s.charAt(i) == ')') {
                if (st.isEmpty()) {
                    s = s.substring(0, i) + ch + s.substring(i + 1);
                } else {
                    st.pop();
                }
            }
        }

        // Mark unmatched opening brackets
        while (!st.isEmpty()) {
            int index = st.pop();
            s = s.substring(0, index) + ch + s.substring(index + 1);
        }

        // Remove all placeholder characters
        return s.replace(String.valueOf(ch), "");
    }

    // Main method to test the solution
    public static void main(String[] args) {
        Solution16 sol = new Solution16();

        String input = "a)b(c)d";
        String result = sol.minRemoveToMakeValid(input);
        System.out.println("Input: " + input);
        System.out.println("Output: " + result);

        input = "))((";
        result = sol.minRemoveToMakeValid(input);
        System.out.println("Input: " + input);
        System.out.println("Output: " + result);

        input = "(a(b(c)d)";
        result = sol.minRemoveToMakeValid(input);
        System.out.println("Input: " + input);
        System.out.println("Output: " + result);
    }
}
