public class Solution15 {
     public static void main(String[] args) {
        Solution solution = new Solution();

        // Example test cases
        String s1 = "()";
        String s2 = "(*)";
        String s3 = "(*))";
        String s4 = "(*()";
        String s5 = "((*)";

        System.out.println("Test 1: " + solution.checkValidString(s1)); // true
        System.out.println("Test 2: " + solution.checkValidString(s2)); // true
        System.out.println("Test 3: " + solution.checkValidString(s3)); // true
        System.out.println("Test 4: " + solution.checkValidString(s4)); // true
        System.out.println("Test 5: " + solution.checkValidString(s5)); // true
    }
}

class Solution {
    public boolean checkValidString(String s) {
        int min = 0;
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                min += 1;
                max += 1;
            } else if (s.charAt(i) == ')') {
                min -= 1;
                max -= 1;
            } else { // s.charAt(i) == '*'
                min -= 1;
                max += 1;
            }

            if (min < 0) {
                min = 0;
            }

            if (max < 0) {
                return false;
            }
        }

        return min == 0;
    }
    
}
