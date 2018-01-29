/*
 * Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You may assume no duplicates in the array.
 */
package leetcode_easy;

public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        return find(nums, 0, nums.length-1, target);
    }
    private static int find(int[] nums, int l,int r,int target){
        if(l > r)
            return l;
        if(r<0)
            return 0;
        int mid = l + (r-l)/2;
        if(nums[mid] == target)
            return mid;
        if(nums[mid] < target)
            return find(nums, mid+1, r, target);
        else
            return find(nums, l, mid-1, target);
    }
} 
