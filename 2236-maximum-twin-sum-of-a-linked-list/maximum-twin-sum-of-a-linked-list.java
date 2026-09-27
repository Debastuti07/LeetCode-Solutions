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
        
        if(head==null) return null;
        ListNode temp=head;
        ArrayList<ListNode>arr=new ArrayList<>();
        while(temp!=null){
            arr.add(temp);
            temp=temp.next;
        }
        int n=arr.size();
        for(int i=n-1;i>=1;i--){
            ListNode t1=arr.get(i);
            ListNode t2=arr.get(i-1);
            t1.next=t2;
        }
        arr.get(0).next=null;
        return arr.get(n-1);
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