import java.util.PriorityQueue;

public class Solution22 {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> ans = new PriorityQueue<>();

        // Add first k elements to the min-heap
        for (int i = 0; i < k; i++) {
            ans.add(nums[i]);
        }

        // For the remaining elements, maintain the k largest elements in the heap
        for (int i = k; i < nums.length; i++) {
            if (ans.peek() < nums[i]) {
                ans.remove();
                ans.add(nums[i]);
            }
        }

        // The root of the heap is the kth largest
        return ans.peek();
    }

    // Main method for testing
    public static void main(String[] args) {
        Solution22 solution = new Solution22();
        int[] nums = {3, 2, 1, 5, 6, 4};
        int k = 2;

        int result = solution.findKthLargest(nums, k);
        System.out.println("The " + k + "th largest element is: " + result);
    }
}
