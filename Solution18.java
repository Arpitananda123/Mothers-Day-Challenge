import java.util.*;
public class Solution18 {
    public int calculate(String s) {
        int result = 0;
        int number = 0;
        int signValue = 1;
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (Character.isDigit(c)) {
                number = number * 10 + (c - '0');
            } else if (c == '+' || c == '-') {
                result += number * signValue;
                number = 0;
                signValue = (c == '-') ? -1 : 1;
            } else if (c == '(') {
                st.push(result);
                st.push(signValue);
                result = 0;
                signValue = 1;
            } else if (c == ')') {
                result += number * signValue;
                result *= st.pop(); // sign
                result += st.pop(); // result so far
                number = 0;
            }
        }

        return result + number * signValue;
    }

    public static void main(String[] args) {
        Solution18 sol = new Solution18();

        // Sample input expressions
        String expr1 = "1 + 1";
        String expr2 = "2 - (1 + 2)";
        String expr3 = "(1+(4+5+2)-3)+(6+8)";

        System.out.println("Result of '" + expr1 + "' = " + sol.calculate(expr1));
        System.out.println("Result of '" + expr2 + "' = " + sol.calculate(expr2));
        System.out.println("Result of '" + expr3 + "' = " + sol.calculate(expr3));
    }
}
