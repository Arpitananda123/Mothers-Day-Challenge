import java.util.Arrays;

public class MajorityElement {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }

    // Main method to test the majorityElement function
    public static void main(String[] args) {
        MajorityElement sol = new MajorityElement();

        int[] test1 = {3, 2, 3};
        System.out.println("Majority Element of [3, 2, 3]: " + sol.majorityElement(test1));

        int[] test2 = {2, 2, 1, 1, 1, 2, 2};
        System.out.println("Majority Element of [2, 2, 1, 1, 1, 2, 2]: " + sol.majorityElement(test2));

        int[] test3 = {1};
        System.out.println("Majority Element of [1]: " + sol.majorityElement(test3));
    }
}
