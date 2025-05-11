public class OddCount {
     public static class Solution {
        public int countOdds(int low, int high) {
            int lowO = low / 2;
            int highO = (high + 1) / 2;
            return highO - lowO;
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        int low = 3;
        int high = 7;
        int result = sol.countOdds(low, high);

        System.out.println("Number of odd numbers between " + low + " and " + high + " = " + result);
    }
}
