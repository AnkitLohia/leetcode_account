/*Given a string, find the length of the longest substring without repeating characters.

Examples:

Given "abcabcbb", the answer is "abc", which the length is 3.

Given "bbbbb", the answer is "b", with the length of 1.

Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
 * 
 */
package leetcode;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args){
        System.out.println(lengthOfLongestSubstring("tmmzuxt"));   
    }
    
    private static int lengthOfLongestSubstring(String s) {
        char[] cArr = s.toCharArray();
        
        Map<Character, Integer> map = new HashMap<>();
        int maxCount = 0;
        int leftIndex = 0;
        for(int i=0; i< cArr.length; i++){
            if(map.containsKey(cArr[i]) && map.get(cArr[i]) >= leftIndex){
                maxCount = Math.max(maxCount, i - leftIndex);
                leftIndex = map.get(cArr[i]) + 1;
                map.put(cArr[i], i);
            }
            else{
                map.put(cArr[i], i);
            }
        }
        maxCount = Math.max(maxCount, cArr.length - leftIndex);
        return maxCount;
    }
}