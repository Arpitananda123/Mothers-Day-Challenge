import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean isHappy(int n) {
        Set<Integer> visit = new HashSet<>();

        while (!visit.contains(n)) {
            visit.add(n);
            n = getNextNumber(n);
            if (n == 1) {
                return true;
            }
        }

        return false;
    }

    private int getNextNumber(int n) {
        int output = 0;

        while (n > 0) {
            int digit = n % 10;
            output += digit * digit;
            n = n / 10;
        }

        return output;
    }
}
public class HappyNumber {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int number = 19;  // You can change this to test other numbers
        boolean result = solution.isHappy(number);

        if (result) {
            System.out.println(number + " is a Happy Number!");
        } else {
            System.out.println(number + " is NOT a Happy Number.");
        }
    }
    
}
