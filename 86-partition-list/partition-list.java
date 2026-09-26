/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode partition(ListNode head, int x) {

        if(head == null || head.next == null)
            return head;

        ListNode d1 = new ListNode(-1);
        ListNode d2 = new ListNode(-1);

        ListNode t1 = d1;
        ListNode t2 = d2;

        ListNode t = head;

        while(t != null) {

            if(t.val < x) {
                t1.next = t;
                t1 = t1.next;
            }
            else {
                t2.next = t;
                t2 = t2.next;
            }

            t = t.next;
        }

        // End the second list
        t2.next = null;

        // Connect both lists
        t1.next = d2.next;

        // Return actual head
        return d1.next;
    }
}
