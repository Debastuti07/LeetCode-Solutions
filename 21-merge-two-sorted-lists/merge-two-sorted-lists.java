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
    public int length(ListNode list){
        int len=0;
        ListNode temp=list;
        while(temp!=null){
            temp=temp.next;
            len++;
        }
        return len;
    }
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode i=list1;
        ListNode j=list2;
        ListNode dummy =new ListNode(-1);
        ListNode k=dummy;
        int size1=length(list1);
        int size2=length(list2);
        if(size1>size2){
           k.next=list2;
        }
        else{
            k.next=list1;
        }

        while(i!=null && j!=null){
            if(i.val>j.val){
                k.next=j;
                j=j.next;
                k=k.next;
            }
            else{
                k.next=i;
                i=i.next;
                k=k.next;
            }
        }
        if(i==null) k.next=j;
        else{
            k.next=i;
        }
        return dummy.next;
    }
}