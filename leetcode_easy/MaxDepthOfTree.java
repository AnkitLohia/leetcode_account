package leetcode_easy;

public class MaxDepthOfTree {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public int maxDepth(TreeNode root) {
        return maxRe(root);
    }
    private static int maxRe(TreeNode a){
        if(a == null)
            return 0;
        
        return 1+Math.max(maxRe(a.left), maxRe(a.right));
    }
    
    public int minDepth(TreeNode root) {
        if(root == null)
            return 0;
        
        if(root.left == null)
            return 1+minDepth(root.right);
        
        if(root.right == null)
            return 1+minDepth(root.left);
        
        return 1 + Math.min(minDepth(root.left), minDepth(root.right));
    }
}
