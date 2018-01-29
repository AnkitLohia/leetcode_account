package leetcode_easy;

public class RemoveDuplicatesList {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        while(head != null && head.next != null){
            if(head.next.val == head.val){
                head.next = head.next.next;
                continue;
            }
            head = head.next;
        }
        return dummy.next;
    }
}
