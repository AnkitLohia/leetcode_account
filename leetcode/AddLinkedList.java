/*
 You are given two linked lists representing two non-negative numbers. 
 The digits are stored in reverse order and each of their nodes contain a single digit. 
 Add the two numbers and return it as a linked list.

 Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 Output: 7 -> 0 -> 8
 */

package leetcode;

import java.util.LinkedList;

public class AddLinkedList {
    public LinkedList<Integer> add(LinkedList<Integer> a,LinkedList<Integer> b){
        LinkedList<Integer> ans = new LinkedList<Integer>();
        int sum = 0;
        int carry = 0;
        while(!a.isEmpty() && !b.isEmpty()){
            sum = carry/10 + a.remove() + b.remove();
            carry = sum - (sum/10)*10;
            sum = sum %10;
            ans.add(sum);
        }
        if(!a.isEmpty()){
            while(!a.isEmpty()){
                sum = carry + a.remove();
                carry = sum - (sum/10)*10;
                sum = sum %10;
                ans.add(sum);
            }
            if(carry != 0){
                ans.add(carry);
            }
        }
        if(!b.isEmpty()){
            while(!b.isEmpty()){
                sum = carry + b.remove();
                carry = sum - (sum/10)*10;
                sum = sum %10;
                ans.add(sum);
            }
            if(carry != 0){
                ans.add(carry);
            }
        }
        return ans;
    }
    public static void main(String[] args){
        AddLinkedList a = new AddLinkedList();
        LinkedList<Integer> a1 = new LinkedList<Integer>();
        LinkedList<Integer> a2 = new LinkedList<Integer>();
        a1.add(2); a1.add(4); a1.add(3);
        a2.add(5); a2.add(4); a2.add(6);
        LinkedList<Integer> ans = a.add(a1,  a2);
        while(!ans.isEmpty())
            System.out.println(ans.remove());
    }
}
