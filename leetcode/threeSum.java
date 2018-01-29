/* Given an array S of n integers, are there elements a, b, c in S such that a + b + c = 0? 
 Find all unique triplets in the array which gives the sum of zero.
 Note:
 Elements in a triplet (a,b,c) must be in non-descending order. (ie, a <= b <= c)
 The solution set must not contain duplicate triplets.
 For example, given array S = {-1 0 1 2 -1 -4},
 A solution set is:
 (-1, 0, 1)
 (-1, -1, 2)
*/
package leetcode;

import java.util.Arrays;
import java.util.LinkedList;

public class threeSum {
    public LinkedList<int[]> threesum(int[] arr){
        LinkedList<int[]> triplets = new LinkedList<int[]>();
        Arrays.sort(arr);
        int len = arr.length;
        int a,b,c;
        for(int i=0; i<len-1 && arr[i] < 0; i++){
            a = arr[i];
            if(i> 0 && arr[i] == arr[i-1])
                continue;
            int x = i+1;
            int y = len-1;
            while(x < y){
                b = arr[x];
                c = arr[y];
                if(a+b+c < 0){
                    x++;
                    continue;
                }
                else if(a+b+c > 0){
                    y--;
                    continue;
                }
                else{
                    int[] tmp = {a,b,c};
                    triplets.add(tmp);
                    x++; y--;
                    while(x<y && arr[x] == arr[x-1]) x++;
                    while(x<y && arr[y] == arr[y+1]) y--;
                }
            }
        }
        return triplets;
    }
    
    public static void main(String[] args){
        threeSum s = new threeSum();
        int[] tmp = {-1,0,1,2,-2};
        System.out.println(s.threesum(tmp));
    }
}
