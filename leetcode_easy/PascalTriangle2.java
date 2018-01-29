package leetcode_easy;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle2 {

    public static void main(String[] args){
        System.out.println(getRow(2));
        System.out.println(getRow(3));
        System.out.println(getRow(4));
        System.out.println("done");
    }
    public static List<Integer> getRow(int rowIndex) {
        List<Integer> sol = new ArrayList<>();
        sol.add(1);
        List<Integer> last;
        for(int i=0; i<rowIndex; i++){
            last = new ArrayList<>(sol);
            for(int j=0; j<sol.size()-1; j++){
                sol.set(j+1, sol.get(j)+sol.get(j+1));
                if(j != 0)
                    sol.set(j+1, sol.get(j+1)-last.get(j-1));
            }
            sol.add(1);
        }
        return sol;
    }
}
