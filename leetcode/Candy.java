/* There are N children standing in a line. Each child is assigned a rating value.
 You are giving candies to these children subjected to the following requirements:
 - Each child must have at least one candy.
 - Children with a higher rating get more candies than their neighbors.
 What is the minimum candies you must give?
*/

package leetcode;

public class Candy {
    public int candy(int[] ratings){
        int n = ratings.length;
        int[] height = new int[n];
        for(int i=0; i<n; i++){
            height[i] = 1;
            if(height[i] > height[i-1] && i>0){
                height[i] = height[i-1] + 1;
            }
        }
        for(int i=n-2; i>=0; i--){
            if(height[i] > height[i+1]){
                height[i] = Math.max(height[i], height[i+1] + 1);
            }
        }
        int total = 0;
        for(int i=0; i<n; i++){
            total += height[i];
        }
        return total;
    }
}
