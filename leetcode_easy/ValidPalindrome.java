/*
 * Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

For example,
"A man, a plan, a canal: Panama" is a palindrome.
"race a car" is not a palindrome.
 */
package leetcode_easy;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        if(s == null || s.length() == 0)
            return true;
        
        s = s.toLowerCase().replaceAll("\\W", "");
        
        int l = 0;
        int r = s.length()-1;
        while(l<r){
            if(s.charAt(l) != s.charAt(r)) 
                return false;
            l++; r--;
        }
        return true;
    }
}
