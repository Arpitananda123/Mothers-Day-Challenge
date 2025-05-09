public class BulbSwitcher {
    static class Solution {
        public int bulbSwitch(int n) {
            return (int) Math.sqrt(n);
        }
    }

    // Main method to test the code
    public static void main(String[] args) {
        Solution sol = new Solution();

        // Test with a sample input
        int n = 10;
        int result = sol.bulbSwitch(n);

        System.out.println("Number of bulbs that remain on: " + result);
    }
}
