/*
 * Given two integers n and k, return all possible combinations of k numbers out of 1 ... n.

For example,
If n = 4 and k = 2, a solution is:

[
  [2,4],
  [3,4],
  [2,3],
  [1,2],
  [1,3],
  [1,4],
]
 */
package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Combinations {
    public List<List<Integer>> combine(int n, int k) {
        int[] nums = new int[n];
        for(int i=0; i<n; i++)
            nums[i] = i+1;
        List<List<Integer>> res = new ArrayList<>();
        if(n == 0 || k == 0)
            return res;
        
        List<Integer> path = new ArrayList<>();
        findComb(nums, 0, k, path, res);
        return res;
    }
    
    private static void findComb(int[] nums, int index, int limit, List<Integer> path, List<List<Integer>> res){
        if(path.size() == limit){
            List<Integer> sol = new ArrayList<>(path);
            res.add(sol);
            return;
        }
        if(index == nums.length)
            return;
        
        for(int i = index; i<nums.length && path.size() < limit; i++){
            path.add(nums[i]);
            findComb(nums, i+1, limit, path, res);
            path.remove(path.size()-1);
        }
    }
}
