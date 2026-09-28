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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
           l1=reverse(l1);
           l2=reverse(l2);
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

          return reverse(dummy.next);

    }
}