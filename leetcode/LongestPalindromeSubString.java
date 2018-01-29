package leetcode;

public class LongestPalindromeSubString {

    public static void main(String args[]){
        System.out.println(longestPalindrome("babad"));
    }
        public static String longestPalindrome(String s) {
            int n = s.length();
            boolean[][] same = new boolean[n][n];
            int i;
            int size = 0;
            int l = 0;
            for(i = 0; i<n; i++)
                for(int j=0; j<n; j++)
                    same[i][j] =false;
            for(i=0; i<n; i++){
                same[i][i] = true;
                size = 1;
                l = i;
            }
            for(i = 0; i<n-1; i++){
                if(s.charAt(i) == s.charAt(i+1)){
                    same[i][i+1] = true;
                    size = 2;
                    l = i;
                }
            }
            
            for(int k=2; k<=n; k++){
                for(i=0; i<=n-k; i++){
                    int j = i+k-1;
                    if(same[i+1][j-1] && s.charAt(i) == s.charAt(j)){
                        same[i][j] = true;
                        size = k;
                        l = i;
                    }
                }
            }
            StringBuffer str = new StringBuffer();
            System.out.println(size);
            while(size != 0){
                str.append(s.charAt(l++));
                size--;
            }
            return str.toString();
        }
}
