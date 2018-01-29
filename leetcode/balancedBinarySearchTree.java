/*
 Problem:    Balanced Binary Tree
 Difficulty: Easy
 Source:     https://oj.leetcode.com/problems/balanced-binary-tree/
 Notes:
 Given a binary tree, determine if it is height-balanced.
 For this problem, a height-balanced binary tree is defined as a binary tree in which 
 the depth of the two subtrees of every node never differ by more than 1.

 */

package leetcode;
import leetcode.binarySearchTree;

public class balancedBinarySearchTree {
    boolean isBalanced = true;
    public static void main(String[] args){
        binarySearchTree root = new binarySearchTree(0);
        root.addNode(-1);
        root.addNode(1);
        root.addNode(-2);
        root.addNode(2);
        balancedBinarySearchTree t = new balancedBinarySearchTree();
        System.out.println(t.height(root));
        System.out.println(t.isBalanced);
    }
    public int height(binarySearchTree node){
        if(node == null) return 0;
        int l = height(node.left);
        int r = height(node.right);
        int diff = Math.abs(l-r);
        if(diff > 1) isBalanced = false;
        return 1+ Math.max(l, r);
    }
}
