/*
 * Given an array S of n integers, find three integers in S such that the sum is closest to a given number, target. Return the sum of the three integers. You may assume that each input would have exactly one solution.
 */
package leetcode;

import java.util.Arrays;

public class ThreeSumClosestRe {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int close = nums[0]+nums[1]+nums[2] - target;
        int sum = nums[0]+nums[1]+nums[2];
        if(close < 0) close *= -1;
        int len = nums.length;
        
        for(int i=0; i<len-2; i++){
            if(i != 0 && nums[i] == nums[i-1]) i++;
            int l= i+1;
            int r = len-1;
            while(l<r){
                int diff = target - nums[l] - nums[r] - nums[i];
                if(diff < 0) diff *= -1;
                if(diff < close){
                    close = diff;
                    sum = nums[l] + nums[r] + nums[i];
                }
                if(target - nums[i] < nums[l] + nums[r] ) r--;
                else l++;
            }
        }
        return sum;
    }
} 
