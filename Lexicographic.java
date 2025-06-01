public class Lexicographic {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test cases
        String input1 = "egcfe";
        String input2 = "abcd";
        String input3 = "seven";

        System.out.println("Input: " + input1 + " → Output: " + solution.makeSmallestPalindrome(input1));
        System.out.println("Input: " + input2 + " → Output: " + solution.makeSmallestPalindrome(input2));
        System.out.println("Input: " + input3 + " → Output: " + solution.makeSmallestPalindrome(input3));
    }
}

class Solution {
    public String makeSmallestPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        char[] arr = s.toCharArray();

        while (i <= j) {
            if (arr[i] == arr[j]) {
                i++;
                j--;
            } else if (arr[i] > arr[j]) {
                arr[i] = arr[j];
                i++;
                j--;
            } else {
                arr[j] = arr[i];
                i++;
                j--;
            }
        }

        return new String(arr);
    }
}
