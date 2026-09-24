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
    public ListNode deleteMiddle(ListNode head) {
        // int size=0;
        if(head ==null || head.next==null){
            return null;
        }
        // ListNode temp=head;
        // while(temp!=null){
        //     size++;
        //     temp=temp.next;
        // }
        // temp=head;
        // for(int i=0;i<size/2-1;i++){
        //     temp=temp.next;
        // }
        // temp.next=temp.next.next;
        // return head;


        ListNode slow=head;
        ListNode fast=head;
        ListNode prev=null;
        while(fast!= null && fast.next!=null){
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        prev.next=slow.next;
        return head;


    }
    
    
}