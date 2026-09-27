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
    public int pairSum(ListNode head) {
        // if(head==null || head.next==null) return true;
       
       ListNode fast=head;
        ListNode slow=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode head2=reverseList(slow);
        ListNode i = head;
        ListNode j = head2;
        int max=Integer.MIN_VALUE;
        int sum=0;
        while (i!=null && j != null) {

            sum=i.val+j.val;
            max = Math.max(max, sum);
            i=i.next;
            j=j.next;
        }
        return max;
    }
}