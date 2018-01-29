/*
 * A robot is located at the top-left corner of a m x n grid (marked 'Start' in the diagram below).

The robot can only move either down or right at any point in time. The robot is trying to reach the bottom-right corner of the grid (marked 'Finish' in the diagram below).

How many possible unique paths are there?
 */
package leetcode;

import java.util.Arrays;

public class UniquePaths {
    public int uniquePaths(int m, int n) {
        if(n==1 || m == 1)
            return 1;
        
        int[] tmp = new int[n];
        Arrays.fill(tmp,1);
        for(int i=1; i<m; i++){
            for(int j=n-2; j>=0; j--)
                tmp[j] = tmp[j] + tmp[j+1];
        }
        return tmp[0];
    }
}
