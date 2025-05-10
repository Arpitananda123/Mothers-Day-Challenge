public class Solution5 {
    static class ListNode {
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
    static class Solution {
        public ListNode removeNthFromEnd(ListNode head, int n) {
            if (head == null || head.next == null) {
                return null;
            }

            int len = 0;
            ListNode curr = head;
            while (curr != null) {
                curr = curr.next;
                len++;
            }

            int k = len - n;
            ListNode curr1 = head;
            ListNode prev = null;
            int m = 1;
            while (m <= k) {
                prev = curr1;
                curr1 = curr1.next;
                m++;
            }

            if (len == n) {
                return head.next;
            }

            prev.next = curr1.next;
            return head;
        }
    }

    // Utility method to print the linked list
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    // Main method to test
    public static void main(String[] args) {
        // Creating linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.println("Original List:");
        printList(head);

        int n = 2;  // Example: remove 2nd node from end

        Solution sol = new Solution();
        ListNode newHead = sol.removeNthFromEnd(head, n);

        System.out.println("After removing " + n + "th node from end:");
        printList(newHead);
    }

    
}
