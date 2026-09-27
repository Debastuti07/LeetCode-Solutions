class Solution {

    public ListNode reverseList(ListNode head) {
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

    public int pairSum(ListNode head) {

        // 1. Find middle
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // 2. Reverse second half
        ListNode secondHalf = reverseList(slow);

        // 3. Calculate maximum twin sum
        ListNode first = head;
        ListNode second = secondHalf;

        int max = Integer.MIN_VALUE;

        while (second != null) {
            int sum = first.val + second.val;
            max = Math.max(max, sum);

            first = first.next;
            second = second.next;
        }

        return max;
    }
}