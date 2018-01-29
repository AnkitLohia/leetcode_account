/*
 * Return 0 when overflow
 */
package leetcode_easy;

public class ReverseInt {
    public int reverse(int x) {
        long res = 0;
        while(x != 0){
            res = 10*res + x%10;
            x = x/10;
            if(res > Integer.MAX_VALUE || res < Integer.MIN_VALUE)
                return 0;
        }
        return (int)res;
    }
}
