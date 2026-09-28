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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
          ListNode t1=l1;
          ListNode t2=l2;
          ListNode dummy=new ListNode(-1);
          ListNode t=dummy;
          int carry=0;
          
          while(t1!=null || t2!=null){
             int x = (t1 != null) ? t1.val : 0;
            int y = (t2 != null) ? t2.val : 0;
            int val=carry+x+y;
            carry=val/10;
            int digit=val%10;
            ListNode sum=new ListNode(digit);
            t.next=sum;
            t=t.next;
            if(t1!=null) t1=t1.next;
            if(t2!=null) t2=t2.next;
          }

          if(carry>0){
            ListNode dummy2=new ListNode(carry);
            t.next=dummy2;
          }

          return (dummy.next);
    }
}