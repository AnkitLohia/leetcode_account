/*
 * The set [1,2,3,…,n] contains a total of n! unique permutations.

By listing and labeling all of the permutations in order,
We get the following sequence (ie, for n = 3):

    "123"
    "132"
    "213"
    "231"
    "312"
    "321"

Given n and k, return the kth permutation sequence.

Note: Given n will be between 1 and 9 inclusive.
 */

package leetcode;

public class PermutationSequence {
    public static void main(String[] args){
        System.out.println(getPermutation(3,3));
        System.out.println(getPermutation(4,6));
        System.out.println(getPermutation(4,16));
        System.out.println(getPermutation(7,1));
    }
    public static String getPermutation(int n, int k) {
        int[] num = new int[n];
        for(int i=0; i<n; i++){
            num[i] = i+1;
        }
        while(k>1){
            increment(num);
            k--;
        }
        StringBuffer sb = new StringBuffer();
        for(int i=0; i<n; i++){
            sb.append(num[i]);
        }
        return sb.toString();
    }
    private static void increment(int[] num){
        if(num.length == 1)
            return;
        int end = num.length - 1;
        while(end > 0){
            if(num[end] > num[end-1]) break;
            end--;
        }
        if(num[end] > num[end-1]);
        int index = end -1;
        int tmp = num[index];
        end = num.length - 1;
        while(num[end] < tmp) end--;
        if(end == 0) return;
        num[index] = num[end];
        num[end] = tmp;
        //reverse index+1 tp num.length
        reverse(num, index+1, num.length-1);
    }
    private static void reverse(int[] num, int l, int r){
        while(l<r){
            int tmp = num[l];
            num[l] = num[r];
            num[r] = tmp;
            l++;
            r--;
        }
    }
}
