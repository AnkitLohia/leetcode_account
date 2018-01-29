/*
 * Given two binary strings, return their sum (also a binary string).

For example,
a = "11"
b = "1"
Return "100".
 */
package leetcode_easy;

public class AddBinaryStrings {
    public String addBinary(String a, String b) {
        StringBuffer sb = new StringBuffer();
        int carry = 0;
        int al = a.length()-1;
        int bl = b.length()-1;
        
        while(al >=0 && bl >=0){
            int tmp = (a.charAt(al) - '0') + (b.charAt(bl) - '0') + carry;
            sb.insert(0, tmp%2);
            carry = tmp/2;
            al--; bl--;
        }
        while(al >=0){
            int tmp = (a.charAt(al) - '0') + carry;
            sb.insert(0, tmp%2);
            carry = tmp/2;
            al--;
        }
        while(bl >=0){
            int tmp = (b.charAt(bl) - '0') + carry;
            sb.insert(0, tmp%2);
            carry = tmp/2;
            bl--;
        }
        if(carry == 1)
            sb.insert(0, carry);
        return sb.toString();
    }
}
