public class Solution21 {
    public int subarrayLCM(int[] nums, int k) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int l = nums[i];
            if (l == k) count++;
            for (int j = i + 1; j < nums.length; j++) {
                l = lcm(l, nums[j]);
                if (l == k) count++;
                if (l > k || k % l != 0) break;  // Optimization: stop if LCM cannot be k
            }
        }
        return count;
    }

    int lcm(int a, int b) {
        return a / gcd(a, b) * b;  // Safe from integer overflow
    }

    int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    // Main method for testing
    public static void main(String[] args) {
        Solution21 sol = new Solution21();
        int[] nums = {3, 6, 2, 7, 1};
        int k = 6;
        int result = sol.subarrayLCM(nums, k);
        System.out.println("Number of subarrays with LCM " + k + ": " + result);
    }
}
