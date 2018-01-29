 /*  Given an array of strings, return all groups of strings that are anagrams.
     Note: All inputs will be in lower-case.
 */
 
package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class Anagrams {
    public ArrayList<ArrayList<String>> anagrams(String[] str){
        ArrayList<ArrayList<String>> ana = new ArrayList<ArrayList<String>>();
        HashMap<String,ArrayList<String>> map = new HashMap<String,ArrayList<String>>();
        for (String s:str){
            char[] tmp = s.toCharArray();
            Arrays.sort(tmp);
            String key = tmp.toString();
            if(map.containsKey(key)){
                map.get(key).add(s);
            }
            else{
                map.put(key, new ArrayList<String>());
                map.get(key).add(s);
            }
        }
        Iterator<Entry<String,ArrayList<String>>> iter = map.entrySet().iterator();
        while(iter.hasNext()){
            ArrayList<String> tmp = (ArrayList<String>) iter.next();
            if(tmp.size() > 1){
                ana.add(tmp);
            }
        }
        return ana;
    }
    
    public static void main (String[] args){
        Anagrams ana = new Anagrams();
        String[] input = {"ankit", "lohia", "tinka"};
        ana.anagrams(input);
    }
}
