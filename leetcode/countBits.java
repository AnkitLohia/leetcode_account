package leetcode;

public class countBits {
    public int[] countBits(int num) {
        int[] count = new int[num+1];
        int bits = 0;
        for (int i=0; i<=num; i++){
            bits = 0;
            int temp = i;
            while(temp != 0){
                if(temp%2 == 1)bits++;
                temp = temp>>1;
            }
            count[i] = bits;
        }
        return count;
    }
    
    public static void main(String[] args){
        countBits x = new countBits();
        for(int i:x.countBits(5)){
            System.out.println(i);
        }
    }
}
