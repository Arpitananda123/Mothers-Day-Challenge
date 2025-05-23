import java.util.Arrays;

public class MoveZeroes {
     public void moveZeroes(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == 0 && nums[j] != 0) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        MoveZeroes sol = new MoveZeroes();

        int[] nums = {0, 1, 0, 3, 12};

        System.out.println("Before moving zeroes: " + Arrays.toString(nums));
        sol.moveZeroes(nums);
        System.out.println("After moving zeroes:  " + Arrays.toString(nums));
    }
}
