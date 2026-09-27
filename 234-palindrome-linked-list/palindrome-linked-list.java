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
    
     public ListNode reverseList(ListNode head) {
        
        if(head==null || head.next==null) return head;
        ListNode temp=head;
        ListNode a=temp.next;
        temp.next=null;
        ListNode b=reverseList(a);
        a.next=temp;
        return b;
    }
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null) return true;
       
       ListNode fast=head;
        ListNode slow=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode head2=reverseList(slow);
        ListNode i = head;
        ListNode j = head2;

        while (i!=null && j != null) {
            if (i.val != j.val)
                return false;

            i = i.next;
            j = j.next;
        }
        return true;

    }
}