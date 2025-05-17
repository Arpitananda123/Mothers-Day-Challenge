import java.util.HashSet;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (set.contains(nums[i])) {
                return true; // Early return if duplicate found
            }
            set.add(nums[i]);
        }
        return false;
    }

    // Main method to test the function
    public static void main(String[] args) {
        ContainsDuplicate sol = new ContainsDuplicate();

        int[] test1 = {1, 2, 3, 4};
        int[] test2 = {1, 2, 3, 1};

        System.out.println("Test 1 (no duplicates): " + sol.containsDuplicate(test1)); // false
        System.out.println("Test 2 (has duplicates): " + sol.containsDuplicate(test2)); // true
    }
    
}
