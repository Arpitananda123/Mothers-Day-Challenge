import java.util.Stack;

public class Solution13 {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            if (current == '(' || current == '{' || current == '[') {
                st.push(current);
            } else {
                if (st.isEmpty()) {
                    return false;
                } else {
                    char top = st.peek();
                    if ((current == ')' && top == '(') ||
                        (current == '}' && top == '{') ||
                        (current == ']' && top == '[')) {
                        st.pop();
                    } else {
                        return false;
                    }
                }
            }
        }
        return st.isEmpty();
    }

    public static void main(String[] args) {
        Solution13 sol = new Solution13();

        // Test cases
        String[] testCases = {"()", "()[]{}", "(]", "([)]", "{[]}"};
        
        for (String test : testCases) {
            System.out.println("Input: " + test + " -> Valid: " + sol.isValid(test));
        }
    }
}
