/*
 * Divide two integers without using multiplication, division and mod operator.

If it is overflow, return MAX_INT.
 */
package leetcode;

public class DivideTwoIntegers {
    /* using bit operations (exponentially fast) */
    
    
    /* without mathematics takes time to find max_int divided by 1 */
    public int divide(int dividend, int divisor) {
        int quotient = 0;
        int sign = 1;
        if((dividend<0&&divisor>0)||(dividend>0&&divisor<0))
            sign = -1;
        
        if(dividend == -2147483648)
            return 2147483647;
        
        if(dividend < 0){
            int tmp = dividend;
            dividend = dividend - tmp - tmp;
        }
        if(divisor < 0){
            int tmp = divisor;
            divisor = divisor - tmp - tmp;
        }
        while(dividend >= divisor){
            dividend -= divisor;
            quotient++;
        }
        if(sign < 0){
            int tmp = quotient;
            quotient = quotient - tmp - tmp;
        }
        return quotient;
    }
}
