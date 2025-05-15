class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}
class Solution {
    public void deleteNode(ListNode node) {
        if (node == null || node.next == null) {
            return; // Can't delete the last node using this method
        }
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
public class Solution10 {
    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Create linked list: 1 -> 2 -> 3 -> 4
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        ListNode nodeToDelete = new ListNode(3);
        head.next.next = nodeToDelete;
        head.next.next.next = new ListNode(4);
        nodeToDelete.next = head.next.next.next;

        System.out.print("Original list: ");
        printList(head);

        // Delete node with value 3
        Solution sol = new Solution();
        sol.deleteNode(nodeToDelete);

        System.out.print("After deleting node with value 3: ");
        printList(head);
    }
    
}
