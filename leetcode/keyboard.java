package leetcode;

import java.util.HashMap;
import java.util.LinkedList;

public class keyboard {
    HashMap<Character, Integer> keyboard = new HashMap<Character, Integer>();
    public String[] findWords(String[] words) {
        keyboard.put('q', 1); keyboard.put('w', 1); keyboard.put('e', 1); keyboard.put('r', 1); keyboard.put('t', 1); keyboard.put('y', 1); keyboard.put('u', 1); keyboard.put('i', 1); keyboard.put('o', 1); keyboard.put('p', 1);
        keyboard.put('a', 2); keyboard.put('s', 2); keyboard.put('d', 2); keyboard.put('f', 2); keyboard.put('g', 2); keyboard.put('h', 2); keyboard.put('j', 2); keyboard.put('k', 2); keyboard.put('l', 2);
        keyboard.put('z', 3); keyboard.put('x', 3); keyboard.put('c', 3); keyboard.put('v', 3); keyboard.put('b', 3); keyboard.put('n', 3); keyboard.put('m', 3);
        
        LinkedList<String> ll = new LinkedList<String>();
        for(String str:words){
            if(inrow(str.toLowerCase())){
                ll.add(str);
            }
        }
        return ll.toArray(new String[ll.size()]);
    }
    public boolean inrow(String str){
        for(int i=0; i<str.length(); i++){
            if(keyboard.get(str.charAt(i)) != keyboard.get(str.charAt(0))){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        keyboard k = new keyboard();
        String[] a = {"Hello","Alaska","Dad","Peace"};
        
        for (String s:k.findWords(a))
            System.out.println(s);
    }
}
