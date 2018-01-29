/*
 * The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)

P   A   H   N
A P L S I I G
Y   I   R
And then read line by line: "PAHNAPLSIIGYIR"
 */
package leetcode;

import java.util.ArrayList;
import java.util.List;

public class ZigZagConversion {
    public String convert(String s, int numRows) {
        if(s==null || s.equals(""))
            return s;
        List<StringBuffer> row = new ArrayList<>();
        for(int i=0; i<numRows; i++){
            StringBuffer sb = new StringBuffer();
            row.add(sb);
        }
        int len = s.length();
        int index = 0;
        row.get(0).append(s.charAt(index));
        index++;
        while(index<len){
            for(int i=1; i<numRows-1 && index<len; i++){
                row.get(i).append(s.charAt(index));
                index++;
            }
            if(index<len){
                row.get(numRows-1).append(s.charAt(index));
                index++;
            }
            for(int i=numRows-2; i>0 && index<len; i--){
                row.get(i).append(s.charAt(index));
                index++;
            }
            if(index<len){
                row.get(0).append(s.charAt(index));
                index++;
            }
        }
        String res = "";
        for(int i=0; i<numRows; i++){
            //System.out.println(row.get(i).toString());
            res += row.get(i).toString();
        }
        return res;
    }
}
