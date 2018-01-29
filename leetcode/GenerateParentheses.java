/*
 * Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.

For example, given n = 3, a solution set is:

[
  "((()))",
  "(()())",
  "(())()",
  "()(())",
  "()()()"
]
 */
package leetcode;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        if(n == 0)
            return res;
        StringBuffer sb = new StringBuffer();
        generatePara(n, 0, sb, res);
        return res;
    }
    
    private static void generatePara(int n, int left, StringBuffer sb, List<String> res){
        if(n == 0){
            for(int i=0;i<left;i++){
                sb.append(')');
            }
            res.add(sb.toString());
            sb.delete(sb.length()-left, sb.length());
            return;
        }
        sb.append('(');
        generatePara(n-1, left+1, sb, res);
        sb.delete(sb.length()-1 , sb.length());
        if(left > 0){
            sb.append(')');
            generatePara(n, left-1, sb, res);
            sb.delete(sb.length()-1 , sb.length());
        }
    }
}
