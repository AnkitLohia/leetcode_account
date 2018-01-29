package leetcode_easy;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        if(numRows == 0)
            return res;
        List<Integer> sol = new ArrayList<>();
        sol.add(1);
        res.add(sol);
        for(int i=1; i<numRows; i++){
            sol = new ArrayList<>();
            sol.add(1);
            for(int j=0; j<res.get(i-1).size()-1; j++)
                sol.add(res.get(i-1).get(j)+res.get(i-1).get(j+1));
            sol.add(1);
            res.add(sol);
        }
        
        return res;
    }
}
