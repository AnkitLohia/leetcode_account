/*
 * Find the contiguous subarray within an array (containing at least one number) which has the largest sum.

For example, given the array [-2,1,-3,4,-1,2,1,-5,4],
the contiguous subarray [4,-1,2,1] has the largest sum = 6.
 */
package leetcode_easy;

public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        if(nums == null || nums.length == 0)
            return 0;
        int max = nums[0];
        int tmpMax = 0;
        for(int i=0; i<nums.length; i++){
            if(tmpMax+nums[i] < 0){
                tmpMax = 0;
                //in case of all (-)ve numbers
                max = Math.max(max, tmpMax+nums[i]);
                continue;
            }
            tmpMax = tmpMax+nums[i];
            max = Math.max(max, tmpMax);
        }
        return max;
    }
}
