/* Given a binary tree, return the inorder traversal of its nodes' values.
 For example:
 Given binary tree {1,#,2,3},
 1
  \
   2
  /
 3
 return [1,3,2].
 */
package leetcode;
import java.util.Stack;

import leetcode.binarySearchTree;

public class InOrderBST {
    public static void main(String[] args){
        binarySearchTree bst = new binarySearchTree(0);
        bst.addNode(2); bst.addNode(1); bst.addNode(-1);bst.addNode(-2);
        bst.addNode(3);bst.addNode(2); bst.addNode(2);
        InOrderBST b = new InOrderBST();
        //b.inorderBST(bst);
        b.iterativeInorderBST(bst);
    }
    public void inorderBST(binarySearchTree bst){
        if(bst == null) return;
        inorderBST(bst.left);
        System.out.println(bst.key);
        inorderBST(bst.right);       
    }
    public void iterativeInorderBST(binarySearchTree bst){
        Stack<binarySearchTree> stk = new Stack<binarySearchTree>();
        binarySearchTree node = bst;
        while(!stk.isEmpty() || node != null){
            while(node != null){
                stk.push(node);
                node = node.left;
            }
            binarySearchTree tmp = stk.pop();
            node = tmp.right;
            System.out.println(tmp.key);
        }
    }
}
