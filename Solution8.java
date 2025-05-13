public class Solution8 {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }
    static class Solution {
        public ListNode partition(ListNode head, int x) {
            ListNode sStart = new ListNode(0); // Dummy head for nodes < x
            ListNode gStart = new ListNode(0); // Dummy head for nodes >= x
            ListNode sEnd = sStart;
            ListNode gEnd = gStart;
            ListNode curr = head;

            while (curr != null) {
                if (curr.val >= x) {
                    gEnd.next = curr;
                    gEnd = gEnd.next;
                } else {
                    sEnd.next = curr;
                    sEnd = sEnd.next;
                }
                curr = curr.next;
            }

            // Combine the two lists
            sEnd.next = gStart.next;
            gEnd.next = null; // Avoid potential cycle

            return sStart.next;
        }
    }

    // Main method to test the code
    public static void main(String[] args) {
        // Creating the list: 1 -> 4 -> 3 -> 2 -> 5 -> 2
        ListNode head = new ListNode(1);
        head.next = new ListNode(4);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(2);

        int x = 3;

        Solution sol = new Solution();
        ListNode newHead = sol.partition(head, x);

        // Print the result
        System.out.print("Partitioned List: ");
        while (newHead != null) {
            System.out.print(newHead.val + " ");
            newHead = newHead.next;
        }
    }
}
