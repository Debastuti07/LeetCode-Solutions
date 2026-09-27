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
    public ListNode reverse(ListNode head) {
        
       ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }
    public void reorderList(ListNode head) {
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode head2 = slow.next;
        slow.next = null;
        head2=reverse(head2);
          ListNode i = head;
        ListNode j = head2;

        while (i != null && j != null) {

            ListNode nextI = i.next;
            ListNode nextJ = j.next;

            i.next = j;
            j.next = nextI;

            i = nextI;
            j = nextJ;
        }
    }
}