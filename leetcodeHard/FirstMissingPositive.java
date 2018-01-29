/*Given an unsorted integer array, find the first missing positive integer.

For example,
Given [1,2,0] return 3,
and [3,4,-1,1] return 2.

Your algorithm should run in O(n) time and uses constant space.
 */
package leetcodeHard;

public class FirstMissingPositive {
  
    public static void main(String[] args){
        int[] arr = {3,4,-1,1};
        int[] arr2 = {0,3};
        System.out.println(firstMissingPositive(arr2));
    }
    public static int firstMissingPositive(int[] nums) {
        if(nums == null || nums.length == 0)
            return 1;
        int index = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] <= 0){
                int tmp = nums[i];
                nums[i] = nums[index];
                nums[index++] = tmp;
            }
        }
        if(index == nums.length)
            return 1;
        for(int i=0; i<index; i++){
            nums[i] = 1;
        }
        for(int i=index; i<nums.length; i++){
            int number = Math.abs(nums[i])-1;
            if(number < nums.length && nums[number]>0){
                nums[number] = -1*nums[number];
            }
        }
        for(int i=0; i<nums.length; i++){
            if(nums[i] > 0)
                return i+1;
        }
        return nums.length+1;
    }
}
