// File: DeleteMiddleNode.java

public class Solution4 {
    public static void main(String[] args) {
        // Create a sample linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.print("Original List: ");
        printList(head);

        Solution solution = new Solution();
        head = solution.deleteMiddle(head);

        System.out.print("After Deleting Middle Node: ");
        printList(head);
    }

    // Helper method to print the list
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val);
            if (head.next != null) System.out.print(" -> ");
            head = head.next;
        }
        System.out.println();
    }
}

// Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
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

        // Remove the middle node
        prev.next = turtle.next;

        return head;
    }
}

