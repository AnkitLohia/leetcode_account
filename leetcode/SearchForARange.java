/*
 * Given an array of integers sorted in ascending order, find the starting and ending position of a given target value.

Your algorithm's runtime complexity must be in the order of O(log n).

If the target is not found in the array, return [-1, -1].

For example,
Given [5, 7, 7, 8, 8, 10] and target value 8,
return [3, 4].
 */

package leetcode;

public class SearchForARange {
    
public int[] searchRange(int[] nums, int target) {
        
        int[] res = new int[2];
        res[0] = -1;
        res[1] = -1;
        if(nums == null || nums.length == 0)
            return res;
        
        int l = 0;
        int r = nums.length-1;
        
        findleft(nums, l, r, target, res);
        findRight(nums, l, r, target, res);
        //Arrays.sort(res);
        return res;
    }
    private static void findRight(int[] nums, int l, int r, int target, int[] res){
        if(l>r)
            return;
        int mid = l + (r - l)/2;
        if(nums[mid] == target){
            res[1] = mid;
            findRight(nums, mid+1, r, target, res);
        }
        if(nums[mid] < target)
            findRight(nums, mid+1, r, target, res);
        
        if(nums[mid] > target)
            findRight(nums, l, mid-1, target, res);
    }
    private static void findleft(int[] nums, int l, int r, int target, int[] res){
        if(l>r)
            return;
        int mid = l + (r - l)/2;
        if(nums[mid] == target){
            res[0] = mid;
            findleft(nums, l, mid-1, target, res);
        }
        if(nums[mid] < target)
            findleft(nums, mid+1, r, target, res);
        
        if(nums[mid] > target)
            findleft(nums, l, mid-1, target, res);
    }
}
