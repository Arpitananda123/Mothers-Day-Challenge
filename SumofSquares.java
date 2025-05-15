import java.util.Scanner;

class Solution {
    public boolean judgeSquareSum(int c) {
        for (long a = 0; a * a <= c; a++) {
            double b = Math.sqrt(c - a * a);
            if (b == (int) b) {
                return true;
            }
        }
        return false;
    }
}
public class SumofSquares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a non-negative integer: ");
        int c = scanner.nextInt();

        Solution solution = new Solution();
        boolean result = solution.judgeSquareSum(c);

        if (result) {
            System.out.println(c + " can be expressed as the sum of squares of two integers.");
        } else {
            System.out.println(c + " cannot be expressed as the sum of squares of two integers.");
        }

        scanner.close();
    }
    
}
