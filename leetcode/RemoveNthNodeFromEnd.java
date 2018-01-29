/*
 * Given a linked list, remove the nth node from the end of list and return its head.

For example,

   Given linked list: 1->2->3->4->5, and n = 2.

   After removing the second node from the end, the linked list becomes 1->2->3->5.
Note:
Given n will always be valid.
Try to do this in one pass.
 */
package leetcode;

public class RemoveNthNodeFromEnd {
    public class ListNode {
             int val;
             ListNode next;
             ListNode(int x) { val = x; }
         }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode tmp = head;
        while(n>0){
            tmp = tmp.next;
            n--;
        }
        if(tmp == null)
            return dummy.next.next;
        while(tmp.next!= null){
            head = head.next;
            tmp = tmp.next;
        }
        head.next = head.next.next;
        return dummy.next;
    }
}
