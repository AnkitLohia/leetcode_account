/*
 * Given a non-negative integer represented as a non-empty array of digits, plus one to the integer.

You may assume the integer do not contain any leading zero, except the number 0 itself.

The digits are stored such that the most significant digit is at the head of the list.
 */
package leetcode_easy;

public class PlusOne {
    public int[] plusOne(int[] digits) {
        int carry = 1;
        for(int i = digits.length-1; i>=0; i--){
            int tmp = digits[i] + carry;
            carry = 0;
            
            if(tmp > 9){
                digits[i] = tmp%10;
                carry = tmp/10;
            }
            else{
                digits[i] = tmp;
            }
        }
        if(carry == 0)
            return digits;
        int[] ans = new int[digits.length+1];
        ans[0] = carry;
        for(int i=1; i<ans.length; i++)
            ans[i] = digits[i-1];
        return ans;
    }
}
