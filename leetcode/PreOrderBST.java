/* Given a binary tree, return the preorder traversal of its nodes' values.
 For example:
 Given binary tree {1,#,2,3},
    1
     \
      2
     /
    3
 return [1,2,3].
 Note: Recursive solution is trivial, could you do it iteratively?
*/

package leetcode;

import java.util.ArrayList;
import java.util.Stack;

public class PreOrderBST {
    public static void main(String[] args){
        binarySearchTree bst = new binarySearchTree(0);
        bst.addNode(2); bst.addNode(1); bst.addNode(-1);bst.addNode(-2);
        bst.addNode(3);bst.addNode(2); bst.addNode(2);
        PreOrderBST b = new PreOrderBST();
        ArrayList<Integer> r1 = b.preOrderBST(bst);
        ArrayList<Integer> r2 = b.iterativePreOrderBST(bst);
        for(int k:r1){
            System.out.println(k);
        }
        for(int k:r2){
            System.out.println(k);
        }
    }

    private ArrayList<Integer> preOrderBST(binarySearchTree bst) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        if(bst == null)
            return res;
        res.add(bst.key);
        res.addAll(preOrderBST(bst.left));
        res.addAll(preOrderBST(bst.right));
        return res;
    }

    private ArrayList<Integer> iterativePreOrderBST(binarySearchTree root) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        Stack<binarySearchTree> stk = new Stack<binarySearchTree>();
        binarySearchTree node = root;
        while(!stk.isEmpty() || node != null){
            while(node != null){
                stk.push(node);
                res.add(node.key);
                node = node.left;
            }
            binarySearchTree tmp = stk.pop();
            node = tmp.right;
        }
        return res;
    }
}
