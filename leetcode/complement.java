package leetcode;

import java.util.Stack;

public class complement {
    public int compliment(int x){
        int y = 0;
        Stack<Integer> s = new Stack<Integer>();
        if(x == 0){
            s.push(0);
        }
        while(x != 0){
            s.push(x%2);
            x = x>>1;                   
        }
        while(!s.empty()){
            if(s.pop() == 0){
                y = 2*y + 1;
            }
            else {
                y = 2*y;
            }
        }
        return y;
    }
    public static void main (String[] args){
        complement c = new complement();
        System.out.println(c.compliment(3));
    }
}
