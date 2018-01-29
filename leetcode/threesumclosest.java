/* Given an array S of n integers, find three integers in S such that the sum is closest to 
 a given number, target. Return the sum of the three integers. 
 You may assume that each input would have exactly one solution.
 For example, given array S = {-1 2 1 -4}, and target = 1.
 The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
*/

package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class threesumclosest {
    public List<Integer> threeCSum(int[] arr, int target){
        List<Integer> triplet = new ArrayList<Integer>();
        int len = arr.length;
        if(len < 3){
            return null;
        }
        triplet.add(arr[0]); triplet.add(arr[1]); triplet.add(arr[2]);
        int a,b,c, sum, diff;
        sum = arr[0] + arr[1] + arr[2];
        diff = sum;
        Arrays.sort(arr);
        for(int i=0; i<len-1 && arr[i] < target; i++){
            int l = i+1;
            int r = len-1;
            a = arr[i];
            while(l<r){
                b = arr[l];
                c = arr[r];
                sum = a+b+c;
                if(Math.abs(sum) - Math.abs(a+b+c) < diff){
                    sum = a+b+c;
                    diff = Math.abs(sum) - Math.abs(a+b+c);
                    triplet.set(a, 0);
                    triplet.set(b, 1);
                    triplet.set(c, 2);
                }
                if(a+b+c < target) l++;
                if(a+b+c > target) r--;
                if(a+b+c == target){
                    triplet.set(a, 0);
                    triplet.set(b, 1);
                    triplet.set(c, 2);
                    return triplet;
                }
            }
        }
        return triplet;
    }
}
