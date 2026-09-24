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
    public ListNode swapNodes(ListNode head, int k) {

        //k from the first
       ListNode temp=head;
       for(int i=1;i<k;i++){
        temp=temp.next;
       }
       int p=temp.val;
       //k from the last 
       ListNode slow=head;
       ListNode fast=head;
       for(int i=0;i<k;i++){
           fast=fast.next;
           
       }
       while(fast!=null){
           
       slow=slow.next;
       fast=fast.next;
       }

       int q=slow.val;

       temp.val=q;
       slow.val=p;
       return head;

    }
}