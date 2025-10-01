public class 206 {
    class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while(curr != null){
            ListNode next_node = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next_node;
        }
        return prev;
    }
}
}
