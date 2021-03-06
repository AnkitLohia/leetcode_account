package leetcode_easy;

import leetcode_easy.MaxDepthOfTree.TreeNode;

public class PathSum {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root == null)
            return false;
        if(root.val == sum){
            if(root.left == null && root.right == null)
                return true;
        }
        return hasPathSum(root.left, sum-root.val) || hasPathSum(root.right, sum-root.val);
    }
}
