/*
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
 */
package leetcode_easy;

import java.util.Stack;

public class ValidParentheses {
    
    public static void main(String[] args){
        System.out.println(isValid("(){}[]"));
    }
    public static boolean isValid(String s) {

        Stack<Character> stk = new Stack<>();
        for(int i=0; i< s.length(); i++){
            char c = s.charAt(i);
            if(c == '(' || c == '{' || c == '[')
                stk.push(c);
            else{
                if (stk.isEmpty())
                    return false;
                Character p = stk.pop();
                System.out.println(p);
                System.out.println(c);
                if(!((p == '(' && c == ')') || (p == '{' && c == '}') || (p == '['&& c == ']'))){
                    return false;
                }
            }
        }
        if(stk.isEmpty())
            return true;
        else
            return false;
    }
}
