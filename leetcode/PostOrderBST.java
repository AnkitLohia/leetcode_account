/*
 Given a binary tree, return the postorder traversal of its nodes' values.

 For example:
 Given binary tree {1,#,2,3},
    1
     \
      2
     /
    3
 return [3,2,1].

 Note: Recursive solution is trivial, could you do it iteratively?
*/

package leetcode;


import java.util.Stack;

public class PostOrderBST {
    public static void main(String[] args){
        binarySearchTree bst = new binarySearchTree(0);
        bst.addNode(2); bst.addNode(1); bst.addNode(-1);bst.addNode(-2);
        bst.addNode(3);bst.addNode(2); bst.addNode(2);
        PostOrderBST b = new PostOrderBST();
        b.postOrderBST(bst);
        b.iterativePostorderBST(bst);
    }
    
    private void postOrderBST(binarySearchTree node){
        if (node == null)
            return;
        postOrderBST(node.left);
        postOrderBST(node.right);
        System.out.println(node.key);
    }
    
    private void iterativePostorderBST(binarySearchTree root) {
        Stack<binarySearchTree> stk = new Stack<binarySearchTree>();
        binarySearchTree node = root;
        while(!stk.isEmpty() || node != null){
            while(node != null){
                stk.push(node);
                node = node.left;
            }
            binarySearchTree tmp = stk.pop();
            if(tmp.right != null){
                node = tmp.right;
                stk.push(tmp);
            }
            else{
                System.out.println(tmp.key);
            }
        }
    }
    
}
