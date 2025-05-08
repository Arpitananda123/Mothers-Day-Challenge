// File: SwapNodes.java

import java.util.*;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class Solution3 {

    public ListNode swapNodes(ListNode head, int k) {
        int len = 0;
        ListNode curr = head;
        while (curr != null) {
            curr = curr.next;
            len++;
        }

        int k1 = 1;
        int k2 = 1;
        ListNode curr1 = head;
        while (k1 != k) {
            curr1 = curr1.next;
            k1++;
        }
        int val1 = curr1.val;

        ListNode curr2 = head;
        while (k2 != len - k + 1) {
            curr2 = curr2.next;
            k2++;
        }
        int val2 = curr2.val;

        // Swap values
        curr1.val = val2;
        curr2.val = val1;

        return head;
    }

    // Helper method to create linked list from array
    public static ListNode createList(int[] arr) {
        if (arr.length == 0) return null;
        ListNode head = new ListNode(arr[0]);
        ListNode curr = head;
        for (int i = 1; i < arr.length; i++) {
            curr.next = new ListNode(arr[i]);
            curr = curr.next;
        }
        return head;
    }

    // Helper method to print linked list
    public static void printList(ListNode head) {
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val);
            if (curr.next != null) System.out.print(" -> ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Solution3 solution = new Solution3();

        int[] input = {1, 2, 3, 4, 5};
        int k = 2;

        ListNode head = createList(input);
        System.out.print("Original list: ");
        printList(head);

        head = solution.swapNodes(head, k);
        System.out.print("After swapping: ");
        printList(head);
    }
}

