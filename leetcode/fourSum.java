/*Given an array S of n integers, are there elements a, b, c, and d in S such that a + b + c + d = target? 
 Find all unique quadruplets in the array which gives the sum of target.
 Note:
 Elements in a quadruplet (a,b,c,d) must be in non-descending order. (ie, a <= b <= c <= d)
 The solution set must not contain duplicate quadruplets.
 For example, given array S = {1 0 -1 0 -2 2}, and target = 0.
 A solution set is:
 (-1,  0, 0, 1)
 (-2, -1, 1, 2)
 (-2,  0, 0, 2)
 */
package leetcode;

import java.util.ArrayList;
import java.util.Arrays;

public class fourSum {
    public ArrayList<ArrayList<Integer>> foursum(int[] arr, int target){
        ArrayList<ArrayList<Integer>> quad = new ArrayList<ArrayList<Integer>>();
        int a,b,c,d;
        int len = arr.length;
        if (len < 4)
            return null;
        Arrays.sort(arr);
        for(int i=0; i<len-2; i++){
            a = arr[i];
            if(i>0 && arr[i] == arr[i-1]) continue;
            for(int j=i+1; j< len-1 && arr[i] + arr[j] < target; j++){
                b = arr[j];
                if(j>i+1 && arr[j] == arr[j-1]) continue;
                int l = j+1;
                int r = len-1;
                while(l<r){
                    if(a + b + arr[l] + arr[r] < target)l++;
                    if(a + b + arr[l] + arr[r] > target)r--;
                    if(a + b + arr[l] + arr[r] == target){
                        ArrayList<Integer> tmp = new ArrayList<Integer>();
                        tmp.add(arr[i]); tmp.add(arr[j]);tmp.add(arr[l]);tmp.add(arr[r]);
                        quad.add(tmp);
                        l++;
                        r--;
                        while(l<r && arr[l] == arr[l-1]) l++;
                        while(l<r && arr[r] == arr[r+1]) r--;
                    }
                }
            }
        }
        
        return quad;
    }
}
