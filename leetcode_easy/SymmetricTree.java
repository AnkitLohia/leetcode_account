package leetcode_easy;

public class SymmetricTree {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public boolean isSymmetric(TreeNode root) {
        if(root == null)
            return true;
        return isSyRe(root.left, root.right);
    }
    
    private static boolean isSyRe(TreeNode a, TreeNode b){
        if(a == null && b == null)
            return true;
        if(a == null && b != null || a != null && b == null || a.val != b.val)
            return false;
        
        return isSyRe(a.left, b.right) && isSyRe(b.left, a.right);
    }
}
