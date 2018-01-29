 /* ********* V V GOOD ***********
  * 
  * Given two binary strings, return their sum (also a binary string).
 For example,
 a = "11"
 b = "1"
 Return "100".*/
 
 package leetcode;

public class sumBinary {
    public static void main(String[] args){
        sumBinary s = new sumBinary();
        System.out.println(s.add("111", "001"));
    }
    
    public String add(String a, String b){
        
        StringBuffer str = new StringBuffer();
        int la = a.length();
        int lb = b.length();
        
        int i = la-1;
        int j = lb-1;
        int sum = 0;
        int carry = 0;
        while(i>=0 || j>=0){
            sum = carry;
            if(i>=0) sum += a.charAt(i--) - '0';
            if(j>=0) sum += b.charAt(j--) - '0';
            carry = sum/2;
            sum = sum %2;
            str.insert(0,  String.valueOf(sum));
        }
        if(carry == 1) str.insert(0,  '1');
        return str.toString();
    }
}
