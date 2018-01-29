package leetcode;
/*
 * Given an array S of n integers, are there elements a, b, c in S such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSumEqualsZero {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        
        for(int i=0; i<nums.length; i++){
            if(i!=0 && nums[i] == nums[i-1]) continue;
            int l=i+1;
            int r = nums.length-1;
            while(l<r){
                if(nums[l]+nums[r]+nums[i] == 0){
                    List<Integer> sol = new ArrayList<>();
                    sol.add(nums[l]); sol.add(nums[r]); sol.add(nums[i]);
                    res.add(sol);
                }
                if(nums[l]+nums[r]+nums[i] > 0) r--;
                else l++;
                while(l<=r && l>i+1 && nums[l] == nums[l-1]) l++;
                while(l<=r && r<nums.length-1 && nums[r] == nums[r+1]) r--;
            }
        }
        return res;
    }
}
