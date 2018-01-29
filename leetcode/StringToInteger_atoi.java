package leetcode;

public class StringToInteger_atoi {

    public int myAtoi(String str) {
        if(str == null || str.length() == 0)
            return 0;
        int index = 0;
        int len = str.length();
        while(index < len && str.charAt(index) == ' ')
            index++;
        if(index == len)
            return 0;
        int sign = 1;
        if(str.charAt(index) == '+' || str.charAt(index) == '-'){
            if(str.charAt(index) == '-')
                sign = -1;
            index++;
        }

        long res = 0;
        for(int i=index; i<len; i++){
            if(str.charAt(i) > '9' || str.charAt(i) < '0'){
                break;
            }
            res = 10*res + (str.charAt(i) - '0');
            
            if(sign == 1 && res >= 2147483647){
                return 2147483647;
            }
            if(sign == -1 && res - 2147483647 >0){
                return -2147483648;
                
            }
        }
        return sign*(int)res;
    }
    
}
