/*You are climbing a stair case. It takes n steps to reach to the top.
 Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
*/

package leetcode;

public class ClimbingStairs {
    public int steps(int N){
        int[] steps = new int[N+1];
        steps[0] = 1;
        steps[1] = 1;
        for(int i=2; i<=N; i++){
            steps[i] = steps[i-1] + steps[i-2];
        }
        return steps[N];
    }
}
