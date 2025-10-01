public class 19 {
    class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count = 0;
        ListNode curr = head;
        if (curr.next == null && n == 1)
            return null;
        while (curr != null) {
            curr = curr.next;
            count++;
        }
        int dest = count - n;
        ListNode curr2 = head;
        ListNode aage = null;
        ListNode pehle = null;
        int count2 = 0;
        if (dest == 0)
            return head.next;
        while (count2 != dest) {
            pehle = curr2;
            curr2 = curr2.next;
            count2++;
        }
        if (curr2.next != null) {
            aage = curr2.next;
        }
        pehle.next = aage;
        curr2.next = null;
        return head;
    }
}
}
