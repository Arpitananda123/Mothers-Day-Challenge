import java.util.*;
public class Solution23 {
    public int findDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], 1);
            } else {
                map.put(nums[i], map.get(nums[i]) + 1);
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (map.get(nums[i]) >= 2) {
                return nums[i];
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Solution23 solution = new Solution23();

        int[] nums = {1, 3, 4, 2, 2};
        int duplicate = solution.findDuplicate(nums);

        System.out.println("Duplicate number: " + duplicate);
    }
}
