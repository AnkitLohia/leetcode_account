/*
 * Follow up for "Unique Paths":

Now consider if some obstacles are added to the grids. How many unique paths would there be?

An obstacle and empty space is marked as 1 and 0 respectively in the grid.
 */
package leetcode;

public class UniquePath2 {
    public int uniquePathsWithObstacles(int[][] og) {
        int m = og.length;
        if(m == 0 || og[0].length == 0)
            return 0;
        int n = og[0].length;

          
        for(int i=m-1; i>=0; i--){
            for(int j=n-1; j>=0; j--){
                if(og[i][j] == 1)
                    og[i][j] = -1;
            }
        }
        
        if(og[m-1][n-1] != -1)
            og[m-1][n-1] = 1;
      
        for(int i=m-2; i>=0; i--){
            if(og[i+1][n-1] == -1 || og[i][n-1] == -1)
                og[i][n-1] = -1;
            else
                og[i][n-1] = 1;
        }
            
        for(int j=n-2; j>=0; j--){
            if(og[m-1][j+1] == -1 || og[m-1][j] == -1)
                og[m-1][j] = -1;
            else
                og[m-1][j] = 1;
        }
        
        for(int i=m-2; i>=0; i--){
            for(int j=n-2; j>=0; j--){
                int l=0,r=0;
                if(og[i+1][j] != -1)
                    l = og[i+1][j];
                if(og[i][j+1] != -1)
                    r = og[i][j+1];
                if(l+r != 0 && og[i][j] != -1)
                    og[i][j] = l+r;
                else
                    og[i][j] = -1;
            }                    
        }
        
        if(og[0][0] == -1)
            return 0;
        return og[0][0];
    }
}
