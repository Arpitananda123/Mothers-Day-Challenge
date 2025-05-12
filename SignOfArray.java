class Solution {
    public int arraySign(int[] nums) {
        int sign = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                return 0;
            } else if (nums[i] < 0) {
                sign = -sign;
            }
        }
        return sign;
    }
}
public class SignOfArray {
     public static void main(String[] args) {
        Solution solution = new Solution();

        // Sample test case
        int[] nums = {-1, -2, -3, -4, 3, 2, 1};

        int result = solution.arraySign(nums);

        System.out.println("Sign of the product of the array: " + result);
    }
}
    

