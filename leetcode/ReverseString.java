package leetcode;

public class ReverseString {
    public String reverseString(String s) {
        char[] c = s.toCharArray();
        int len = s.length();
        char temp;
        for(int i=0; i<len/2; i++){
            temp = c[i];
            c[i] = c[len-i-1];
            c[len-i-1] = temp;
        }
        return new String(c);
    }
    public static void main(String[] args){
        ReverseString s = new ReverseString();
        System.out.println(s.reverseString("ankit"));
    }
}
