public class 23 {
     import java.util.*;
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        int n = lists.length;
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0; i < n; i++){
            ListNode curr = lists[i];
            while(curr != null){
                arr.add(curr.val);
                curr = curr.next;
            }
        }
        if(arr.size() == 0) return null;
        Collections.sort(arr);
        ListNode head = new ListNode(arr.get(0));
        ListNode curr = head;
        for(int i = 1; i < arr.size(); i++){
            ListNode newNode = new ListNode(arr.get(i));
            curr.next = newNode;
            curr = curr.next;
        }
        return head;
    }
}
}
