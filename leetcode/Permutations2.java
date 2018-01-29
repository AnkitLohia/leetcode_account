/*
 * Given a collection of numbers that might contain duplicates, return all possible unique permutations.

For example,
[1,1,2] have the following unique permutations:
[
  [1,1,2],
  [1,2,1],
  [2,1,1]
]
 */
package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutations2 {
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        List<List<Integer>> res = new ArrayList<>();
        if(nums == null || len == 0)
            return res;
        int[] use = new int[len];
        Arrays.fill(use,1);
        List<Integer> path = new ArrayList<>();
        getPermutations(nums, use, path, res, len);
        return res;
    }
    private static void getPermutations(int[] nums, int[] use, List<Integer> path, List<List<Integer>> res, int count){
        if(count == 0){
            List<Integer> sol = new ArrayList<>(path);
            res.add(sol);
        }
            
        for(int i=0; i<use.length; i++){
            if(use[i] == 1){
                use[i] = -1;
                path.add(nums[i]);
                getPermutations(nums, use, path, res, count-1);
                path.remove(path.size()-1);
                use[i] = 1;
                while(i!=use.length-1 && nums[i] == nums[i+1]) i++;
            }
        }
    }
}
