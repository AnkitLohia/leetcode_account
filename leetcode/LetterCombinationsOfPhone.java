/*
 * Given a digit string, return all possible letter combinations that the number could represent.

A mapping of digit to letters (just like on the telephone buttons) is given below.
Input:Digit string "23"
Output: ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
 */
package leetcode;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinationsOfPhone {
    public List<String> letterCombinations(String digits) {
        String[] mapping = {" ", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        int[] com = new int[digits.length()];
        for(int i=0; i<digits.length(); i++){
            com[i] = digits.charAt(i) - '0';
        }
        List<String> res = new ArrayList<>();
        if(digits.equals(""))
            return res;
        StringBuffer sb = new StringBuffer();
        getComb(com, 0, sb, res, mapping);
        return res;
    }
    private static void getComb(int[] com, int index, StringBuffer sb, List<String> res, String[] mapping){
        if(index == com.length){
            res.add(sb.toString());
            return;
        }
        for(int i=0; i<mapping[com[index]].length(); i++){
            sb.append(mapping[com[index]].charAt(i));
            getComb(com, index+1, sb, res, mapping);
            sb.delete(sb.length()-1,sb.length());
        }
    }
}
