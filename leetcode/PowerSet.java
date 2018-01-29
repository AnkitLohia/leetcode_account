/*
 * Given a set of distinct integers, nums, return all possible subsets (the power set).
 */
package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PowerSet {
    public List<List<Integer>> subsets(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        
        List<Integer> path = new ArrayList<>();
        getPermutations(nums, 0, path, res);
        return res;
    }
    
    private static void getPermutations(int[] nums, int start, List<Integer> path, List<List<Integer>> res){
        List<Integer> permutation = new ArrayList<>(path);
        res.add(permutation);
        
        for(int i=start; i<nums.length; i++){
            path.add(nums[i]);
            getPermutations(nums, i+1, path, res);
            path.remove(path.size() - 1);
        }
    }
}
