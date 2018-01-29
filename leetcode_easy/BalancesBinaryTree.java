package leetcode_easy;
public class BalancesBinaryTree {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public boolean isBalanced(TreeNode root) {
        if(root == null)
            return true;
        
        int l = balance(root.left);
        int r = balance(root.right);
        if(l == -1 || r == -1)
            return false;
        if(Math.abs(l-r) > 1)
            return false;
        
        return true;
    }
    private static int balance(TreeNode a){
        if(a == null)
            return 0;
        
        int l = balance(a.left);
        int r = balance(a.right);
        if(l == -1 || r == -1)
            return -1;
        if(Math.abs(l-r) > 1)
            return -1;
        return 1+Math.max(l,r);
    }
}
