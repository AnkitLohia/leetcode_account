/*
 * Given a list, rotate the list to the right by k places, where k is non-negative.

    Example:
 
 Given 1->2->3->4->5->NULL and k = 2, 
 return 4->5->1->2->3->NULL.
 */
package leetcode;

public class RotateList {
    public class ListNode {
            int val;
             ListNode next;
             ListNode(int x) { val = x; }
    }
    
    public ListNode rotateRight(ListNode head, int k) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        if(head == null)
            return head;
        ListNode tmp = head;
        int len = 1;
        while(tmp.next != null){
            tmp = tmp.next;
            len++;
        }
        k = k%len;
        
        tmp = head;
        for(int i=1; i<len-k; i++)
            tmp = tmp.next;
        
        if(tmp.next == null)
            return dummy.next;
        head = tmp.next;
        tmp.next = null;
        tmp = head;
        while(tmp.next != null)
            tmp = tmp.next;
        tmp.next = dummy.next;
        return head;
    }
}
