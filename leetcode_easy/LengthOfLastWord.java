/*
 * Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.

If the last word does not exist, return 0.

Note: A word is defined as a character sequence consists of non-space characters only.

Example:

Input: "Hello World"
Output: 5
 */
package leetcode_easy;

public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        if(s == null || s.length() == 0)
            return 0;
        int index = 0;
        int tmpMax = 0;
        while(index != s.length()){
            if(s.charAt(index) == ' '){
                index++;
                continue;
            }
            tmpMax = 0;
            while(index < s.length() && s.charAt(index) != ' '){
                tmpMax++;
                index++;
            }
        }
        return tmpMax;
    }
}
