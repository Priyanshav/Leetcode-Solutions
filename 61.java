public class 61 {
    class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        ListNode curr = head;
        ListNode start = head;
        int count = 1;
        if(curr == null) return null;
        if(curr.next == null) return curr;
        while(curr.next != null){
            count++;
            curr = curr.next;
        }
        ListNode tail = curr;
        tail.next = start;
        int rotations = k % count;
        int times = count - rotations;
        while(times != 0){
            tail = head;
            head = head.next;
            times--;
        }
        tail.next = null;
        return head;
    }
}
}
