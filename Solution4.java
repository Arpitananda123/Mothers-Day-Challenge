public class Solution4 {
    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    // Solution class with deleteMiddle method
    static class Solution {
        public ListNode deleteMiddle(ListNode head) {
            if (head == null || head.next == null) {
                return null;
            }

            ListNode hare = head;
            ListNode turtle = head;
            ListNode prev = null;

            while (hare != null && hare.next != null) {
                prev = turtle;
                turtle = turtle.next;
                hare = hare.next.next;
            }

            prev.next = turtle.next;
            return head;
        }
    }

    // Main method to run the code
    public static void main(String[] args) {
        // Create a linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        // Call deleteMiddle
        Solution sol = new Solution();
        ListNode newHead = sol.deleteMiddle(head);

        // Print the updated list
        printList(newHead);
    }

    // Helper method to print the linked list
    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

}
