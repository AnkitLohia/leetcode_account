package leetcode;

import java.util.Stack;

public class LongestValidParanthesis {
    public int longestValidParentheses(String s) {
        
        if(s == null || s.length() == 0)
            return 0;
        
        int n = s.length();
        Stack<Integer> stk = new Stack<>();
        stk.push(-1);
        int max = 0;
        for(int i=0; i<n; i++){
            if(s.charAt(i) == '('){
                stk.push(i);
            }
            else{
                if(stk.size() == 1){
                    stk.pop();
                    stk.push(i);
                }
                else{
                    max = Math.max(max, i - stk.pop()+1);
                    if(!stk.empty())
                        max = Math.max(max, i - stk.peek());
                }
            }
        }
        
        return max;
    }
}
