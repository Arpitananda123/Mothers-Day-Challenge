import java.util.*;
public class Solution17 {
     public int longestValidParentheses(String s) {
        Stack<Integer> st = new Stack<>();
        st.push(-1);
        int max = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                st.push(i);
            } else {
                if (!st.isEmpty()) {
                    st.pop();
                }
                if (st.isEmpty()) {
                    st.push(i);
                } else {
                    max = Math.max(max, i - st.peek());
                }
            }
        }

        return max;
    }

    // Main method to test the function
    public static void main(String[] args) {
        Solution17 solution = new Solution17();

        // Example test cases
        String input1 = "(()";
        String input2 = ")()())";
        String input3 = "";

        System.out.println("Input: \"" + input1 + "\" Output: " + solution.longestValidParentheses(input1));
        System.out.println("Input: \"" + input2 + "\" Output: " + solution.longestValidParentheses(input2));
        System.out.println("Input: \"" + input3 + "\" Output: " + solution.longestValidParentheses(input3));
    }
}
