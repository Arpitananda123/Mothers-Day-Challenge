class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
public class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null) return head;

        ListNode temp = head;
        int length = 0;
        while (temp != null) {
            length++;
            temp = temp.next;
        }

        int rotation = k % length;
        for (int i = 0; i < rotation; i++) {
            ListNode last = head;
            ListNode prev = null;
            while (last.next != null) {
                prev = last;
                last = last.next;
            }
            last.next = head;
            prev.next = null;
            head = last;
        }

        return head;
    }

    // Helper method to print a linked list
    public void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    // Helper method to create a list from an array
    public ListNode createList(int[] nums) {
        if (nums.length == 0) return null;
        ListNode head = new ListNode(nums[0]);
        ListNode current = head;
        for (int i = 1; i < nums.length; i++) {
            current.next = new ListNode(nums[i]);
            current = current.next;
        }
        return head;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] values = {1, 2, 3, 4, 5};
        ListNode head = sol.createList(values);
        System.out.print("Original list: ");
        sol.printList(head);

        int k = 2;
        ListNode rotated = sol.rotateRight(head, k);
        System.out.print("Rotated list: ");
        sol.printList(rotated);
    }
}
    

