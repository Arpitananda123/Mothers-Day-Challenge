import java.util.Arrays;

public class GCDArray {
     public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int min = nums[0];
        int max = nums[nums.length - 1];
        while (min > 0) {
            int temp = max;
            max = min;
            min = temp % min;
        }
        return max;
    }

    // Main method to test the findGCD function
    public static void main(String[] args) {
        GCDArray sol = new GCDArray();

        // Example input
        int[] nums = {2, 5, 6, 9, 10};  // GCD of 2 and 10 is 2
        int result = sol.findGCD(nums);
        System.out.println("GCD of min and max: " + result);  // Output should be 2
    }
}
