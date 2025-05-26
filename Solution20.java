public class Solution20 {
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int currSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            currSum = Math.max(nums[i], currSum + nums[i]);
            maxSum = Math.max(maxSum, currSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        Solution20 solution = new Solution20();

        // Sample input array
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        // Call the method and print result
        int result = solution.maxSubArray(nums);
        System.out.println("Maximum Subarray Sum is: " + result);
    }
}
