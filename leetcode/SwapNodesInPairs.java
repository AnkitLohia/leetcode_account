/*
 * Given a linked list, swap every two adjacent nodes and return its head.

For example,
Given 1->2->3->4, you should return the list as 2->1->4->3.

Your algorithm should use only constant space. You may not modify the values in the list, only nodes itself can be changed.

 */
package leetcode;

public class SwapNodesInPairs {
    public class ListNode {
             int val;
             ListNode next;
             ListNode(int x) { val = x; }
        }
    public ListNode swapPairs(ListNode head1) {
        ListNode dummy = new ListNode(0);
        dummy.next = head1;
        ListNode head = dummy;
        
        while(head.next != null){
            ListNode tmp1 = head.next;
            if(tmp1 == null || tmp1.next == null)
                break;
            ListNode tmp2 = tmp1.next;
            ListNode tail = tmp2.next;

            tmp1.next = tail;
            tmp2.next = head.next;
            head.next = tmp2;
            head = tmp1;
        }
        return dummy.next;  
    }
}
