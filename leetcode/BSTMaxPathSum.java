/* Given a binary tree, find the maximum path sum.
 The path may start and end at any node in the tree.
 For example:
 Given the below binary tree,
   1
  / \
 2   3
 Return 6.
*/

package leetcode;

public class BSTMaxPathSum {
    public static void main(String[] args){
        binarySearchTree bst = new binarySearchTree(0);
        bst.addNode(2); bst.addNode(1); bst.addNode(-1);bst.addNode(-2);
        bst.addNode(3);bst.addNode(2); bst.addNode(2);
        BSTMaxPathSum b = new BSTMaxPathSum();
        int[] res = new int[1];
        res[0] = Integer.MIN_VALUE;
        b.maxSum(bst, res);
        System.out.println(res[0]);
    }
    public int maxSum(binarySearchTree node, int[] res){
        if (node == null)
            return 0;
        int l = (node.left == null)? 0 : Math.max(0, maxSum(node.left, res));
        int r = (node.right == null)? 0 : Math.max(0,  maxSum(node.right, res));
        res[0] = Math.max(res[0],  l+r+node.key);
        return node.key + Math.max(l,  r);
    }
    
}
