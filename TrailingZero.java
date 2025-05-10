public class TrailingZero{
    static class Solution {
        public int trailingZeroes(int n) {
            int ans = 0;
            while (n > 0) {
                n /= 5;
                ans += n;
            }
            return ans;
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        // Example inputs
        int n1 = 5;
        int n2 = 10;
        int n3 = 100;

        System.out.println("Trailing zeroes in " + n1 + "! = " + sol.trailingZeroes(n1));
        System.out.println("Trailing zeroes in " + n2 + "! = " + sol.trailingZeroes(n2));
        System.out.println("Trailing zeroes in " + n3 + "! = " + sol.trailingZeroes(n3));
    }
}
