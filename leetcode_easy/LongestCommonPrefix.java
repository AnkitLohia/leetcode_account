package leetcode_easy;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        StringBuffer sb = new StringBuffer();
        if(strs == null || strs.length == 0)
            return "";
        int size = strs[0].length();
        boolean run = true;
        for(int i=0; i<strs[0].length() && run; i++){
            char c = strs[0].charAt(i);
            for(int j=1; j<strs.length; j++){
                if(i==strs[j].length() || strs[j].charAt(i) != c){
                    run = false;
                    break;
                }
            }
            if(run)
                sb.append(c);
        }
        return sb.toString();
    }
}
