package leetcode;

public class hammingDistance {
        public int hammingDistance(int x, int y) {
            int distance=0;
            while((x!=0 && y!=0)) {
                if(x%2 != y%2)
                    distance++;
                x = x>>1;
                y = y>>1;
            }
                while(x !=0 && y==0){
                    if(x%2 != 0)
                        distance++;
                    x = x>>1;
                }
                while(y !=0 && x==0){
                    if(y%2 != 0)
                        distance++;
                    y = y>>1;
                }
            return distance;
        }
    public static void main(String[] args){
        hammingDistance h = new hammingDistance();
        System.out.println(h.hammingDistance(2,4));
    }
}
