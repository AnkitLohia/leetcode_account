/*
 * Given an array of strings, group anagrams together.

For example, given: ["eat", "tea", "tan", "ate", "nat", "bat"], 
Return:

[
  ["ate", "eat","tea"],
  ["nat","tan"],
  ["bat"]
]
 */
package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> ana = new HashMap<>();
        
        for(int i=0; i<strs.length; i++){
            char[] comp = strs[i].toCharArray();
            Arrays.sort(comp);
            StringBuffer sb = new StringBuffer();
            for(int j=0; j<comp.length; j++){
                sb.append(comp[j]);
            }
            String key = sb.toString();
            if(ana.containsKey(key)){
                ana.get(key).add(strs[i]);
            }
            else{
                List<String> tmp = new ArrayList<>();
                tmp.add(strs[i]);
                ana.put(key, tmp);
            }
        }
        List<List<String>> sol = new ArrayList<>();
        for(List<String> tmp : ana.values()){
            sol.add(tmp);
        }
        return sol;
    }
}
