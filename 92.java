public class 92 {
    class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head == null || head.next == null || left == right) return head;
        ListNode curr = head;
        ListNode prev = null;
        int count = 1;

        while(curr != null && count != left){
            prev = curr;
            curr = curr.next;
            count++;
        }
        ListNode pointerToStart = prev;
        ListNode start = curr;
        prev = null;
        while(curr != null && count != right+1){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            count++;
        }
        start.next = curr;
        if(pointerToStart != null){
            pointerToStart.next = prev; 
        }
        else{
            return prev;
        }
        return head;
    }
}
}
