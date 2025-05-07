public class Solution2 {

    // Definition for singly-linked list.
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public ListNode oddEvenList(ListNode head) {
        ListNode curr = head;
        int len = 0;
        while (curr != null) {
            curr = curr.next;
            len++;
        }

        ListNode curr1 = head;
        ListNode eStart = new ListNode(0); // Dummy even start
        ListNode oStart = new ListNode(0); // Dummy odd start

        ListNode eEnd = eStart;
        ListNode oEnd = oStart;

        int k = 1;

        while (k != len + 1) {
            if (k % 2 == 0) {
                eEnd.next = curr1;
                eEnd = eEnd.next;
            } else {
                oEnd.next = curr1;
                oEnd = oEnd.next;
            }
            k++;
            curr1 = curr1.next;
        }

        oEnd.next = eStart.next;
        eEnd.next = null;
        return oStart.next;
    }

    // Helper method to create a linked list from an array
    public static ListNode createList(int[] arr) {
        if (arr.length == 0) return null;
        ListNode head = new ListNode(arr[0]);
        ListNode current = head;
        for (int i = 1; i < arr.length; i++) {
            current.next = new ListNode(arr[i]);
            current = current.next;
        }
        return head;
    }

    // Helper method to print the linked list
    public static void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + (temp.next != null ? " -> " : ""));
            temp = temp.next;
        }
        System.out.println();
    }

    // Main method to test the code
    public static void main(String[] args) {
        Solution2 sol = new Solution2();
        int[] inputArray = {1, 2, 3, 4, 5};  // Sample input
        ListNode head = createList(inputArray);

        System.out.print("Original List: ");
        printList(head);

        ListNode result = sol.oddEvenList(head);

        System.out.print("Odd-Even Reordered List: ");
        printList(result);
    }
}

