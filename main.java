class ListNode {
    int val;
    ListNode next;

    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode ans = new ListNode(0, head);
        ListNode dummy = ans;

        while (dummy != null) {
            while (dummy.next != null && dummy.next.val == val) {
                dummy.next = dummy.next.next;
            }
            dummy = dummy.next;
        }

        return ans.next;
    }
}

public class main {
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Sample linked list: 1 -> 2 -> 6 -> 3 -> 4 -> 5 -> 6
        ListNode head = new ListNode(1, 
                        new ListNode(2, 
                        new ListNode(6, 
                        new ListNode(3, 
                        new ListNode(4, 
                        new ListNode(5, 
                        new ListNode(6)))))));

        System.out.print("Original list: ");
        printList(head);

        Solution sol = new Solution();
        ListNode updated = sol.removeElements(head, 6);

        System.out.print("Updated list after removing 6: ");
        printList(updated);
    }
}
