/*
 * You are climbing a stair case. It takes n steps to reach to the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

Note: Given n will be a positive integer.


 */
package leetcode_easy;

public class ClimbingStairs {
    public int climbStairs(int n) {
        int zero = 1;
        int one = 1;
        int ans = 0;
        if(n < 2)
            return 1;
        for(int i=1; i<n; i++){
            ans = one + zero;
            zero = one;
            one = ans;
        }
        return ans;
    }
}
