/*
 * Given a set of candidate numbers (C) (without duplicates) and a target number (T), find all unique combinations in C where the candidate numbers sums to T.

The same repeated number may be chosen from C unlimited number of times.

Note:
All numbers (including target) will be positive integers.
The solution set must not contain duplicate combinations.
For example, given candidate set [2, 3, 6, 7] and target 7, 
A solution set is: 
[
  [7],
  [2, 2, 3]
]
 */
package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {
public List<List<Integer>> combinationSum(int[] candidates, int target) {
        
        List<List<Integer>> res = new ArrayList<>();
        if(candidates == null || candidates.length == 0)
            return res;
        
        Arrays.sort(candidates);
        List<Integer> path = new ArrayList<>();
        findCombinations(candidates, 0, path, target, res);
        return res;
    }
    
    private static void findCombinations(int[] candidates, int index, List<Integer> path, int target, List<List<Integer>> res){
        if(target == 0){
            List<Integer> sol = new ArrayList<>(path);
            res.add(sol);
            return;
        }
        if(index == candidates.length || target < 0)
            return;
        
        path.add(candidates[index]);
        findCombinations(candidates, index, path, target - candidates[index], res);
        path.remove(path.size()-1);
        findCombinations(candidates, index+1, path, target, res);
    }
}
