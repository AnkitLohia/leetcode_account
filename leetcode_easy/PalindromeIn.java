package leetcode_easy;

public class PalindromeIn {
    public boolean isPalindrome(int x) {
        long rev = 0;
        int tmp = x;
        while(x > 0){
            rev = 10*rev + x%10;
            x = x/10;
        }

        return (tmp-(int)rev) == 0;
    }
}
