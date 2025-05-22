import java.util.Arrays;

public class SearchInsert {
    public int searchInsert(int[] nums, int target) {
        int ans = 0;
        Arrays.sort(nums); // Sorting the array
        int i = 0;
        while (i < nums.length) {
            if (nums[i] == target || nums[i] > target) {
                ans += i;
                break;
            }
            i++;
        }
        if (ans == 0 && target <= 0) {
            return 0;
        } else if (ans == 0 && i != 0) {
            return nums.length;
        } else {
            return ans;
        }
    }

    public static void main(String[] args) {
        SearchInsert solution = new SearchInsert();

        int[] nums1 = {1, 3, 5, 6};
        int target1 = 5;
        int target2 = 2;
        int target3 = 7;

        System.out.println("Insert position of " + target1 + ": " + solution.searchInsert(nums1.clone(), target1));
        System.out.println("Insert position of " + target2 + ": " + solution.searchInsert(nums1.clone(), target2));
        System.out.println("Insert position of " + target3 + ": " + solution.searchInsert(nums1.clone(), target3));
    }
}
