import java.util.Arrays;

class Solution1 {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] + 1 != 10) {
                digits[i] += 1;
                return digits;
            }
            digits[i] = 0;
        }

        int[] newDigits = new int[digits.length + 1];
        newDigits[0] = 1;
        return newDigits;
    }

    public static void main(String[] args) {
        Solution1 sol = new Solution1();

        // Test input
        int[] digits = {9, 9, 9};

        // Call the plusOne method
        int[] result = sol.plusOne(digits);

        // Print the result
        System.out.println("Result: " + Arrays.toString(result));
    }
}

