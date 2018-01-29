/*
 * Given a collection of integers that might contain duplicates, nums, return all possible subsets (the power set).

Note: The solution set must not contain duplicate subsets.

For example,
If nums = [1,2,2], a solution is:

[
  [2],
  [1],
  [1,2,2],
  [2,2],
  [1,2],
  []
]

 */
package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subset2 {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if(nums == null || nums.length == 0)
            return res;
        List<Integer> path = new ArrayList<>();
        Arrays.sort(nums);
        getPower(nums, 0, path, res);
        return res;
    }
    private static void getPower(int[] nums, int index, List<Integer> path, List<List<Integer>> res){
        List<Integer> sol = new ArrayList<>(path);
        res.add(sol);
        
        for(int i=index; i<nums.length; i++){
            if(i!=index && nums[i] == nums[i-1]) continue;
            path.add(nums[i]);
            getPower(nums, i+1, path, res);
            path.remove(path.size()-1);
        }
    }
}
