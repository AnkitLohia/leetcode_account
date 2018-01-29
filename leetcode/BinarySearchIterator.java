/*
 Implement an iterator over a binary search tree (BST). Your iterator will be 
 initialized with the root node of a BST.
 Calling next() will return the next smallest number in the BST.
 Note: next() and hasNext() should run in average O(1) time and 
 uses O(h) memory, where h is the height of the tree.
 */
package leetcode;
import java.util.Stack;

import leetcode.node;

public class BinarySearchIterator {
    Stack<node> stk = new Stack<node>();
    node node = new node();
    public void init(node root){
        node = root;
    }
    
    public boolean hasNext(){
        if(!stk.isEmpty() || node != null) return true;
        return false;
    }
    
    public node next(){
        while(node != null){
            stk.push(node);
            node = node.left;
        }
        node tmp = stk.pop();
        node = tmp.right;
        return tmp;
    }
}
