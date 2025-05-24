public class RotateArray {
    public static void reverse(int nums[], int i, int j) {
        int li = i;
        int ri = j;

        while (li < ri) {
            int temp = nums[li];
            nums[li] = nums[ri];
            nums[ri] = temp;

            li++;
            ri--;
        }
    }

    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        if (k < 0) {
            k += nums.length;
        }

        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    // Main method for testing
    public static void main(String[] args) {
        RotateArray sol = new RotateArray();

        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        System.out.println("Original array:");
        printArray(nums);

        sol.rotate(nums, k);

        System.out.println("Rotated array by " + k + " steps:");
        printArray(nums);
    }

    // Utility method to print array
    public static void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
