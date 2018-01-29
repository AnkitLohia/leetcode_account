/*
 * Given a collection of distinct numbers, return all possible permutations.

For example,
[1,2,3] have the following permutations:
[
  [1,2,3],
  [1,3,2],
  [2,1,3],
  [2,3,1],
  [3,1,2],
  [3,2,1]
]
 */
package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutations {
       public List<List<Integer>> permute(int[] nums) {
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
                }
            }
        }
}
