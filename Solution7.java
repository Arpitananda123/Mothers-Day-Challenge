class ListNode {
    int val;
    ListNode next;

    ListNode() {}

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(0, head);
        ListNode prev = dummy;
        ListNode curr = head;

        while (curr != null) {
            // Check for duplicates
            if (curr.next != null && curr.val == curr.next.val) {
                while (curr.next != null && curr.val == curr.next.val) {
                    curr = curr.next;
                }
                prev.next = curr.next; // skip all duplicates
            } else {
                prev = prev.next;
            }
            curr = curr.next;
        }

        return dummy.next;
    }
}
public class Solution7 {
    public static ListNode createLinkedList(int[] arr) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        for (int val : arr) {
            current.next = new ListNode(val);
            current = current.next;
        }
        return dummy.next;
    }

    // Helper method to print a linked list
    public static void printLinkedList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] input = {1, 2, 3, 3, 4, 4, 5}; // sample input
        ListNode head = createLinkedList(input);

        System.out.print("Original list: ");
        printLinkedList(head);

        ListNode result = solution.deleteDuplicates(head);

        System.out.print("List after removing duplicates: ");
        printLinkedList(result);
    }
}
