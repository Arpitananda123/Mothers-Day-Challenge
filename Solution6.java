public class Solution6 {
     public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    
    public static class Solution {
        public static int findGCD(int a, int b) {
            while (b != 0) {
                int temp = b;
                b = a % b;
                a = temp;
            }
            return a;
        }

        public ListNode insertGreatestCommonDivisors(ListNode head) {
            ListNode curr = head;
            while (curr != null && curr.next != null) {
                ListNode prev = curr;
                curr = curr.next;
                int ans = findGCD(prev.val, curr.val);
                ListNode gcdNode = new ListNode(ans);
                prev.next = gcdNode;
                gcdNode.next = curr;
                curr = gcdNode.next;
            }
            return head;
        }
    }

    
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

    
    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val);
            if (current.next != null) System.out.print(" -> ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] values = {18, 6, 9}; 
        ListNode head = createList(values);
        Solution sol = new Solution();
        ListNode result = sol.insertGreatestCommonDivisors(head);
        printList(result); 
    }
    
}
