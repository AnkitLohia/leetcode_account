package leetcode_easy;

public class SortedArrayToBST {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums == null || nums.length == 0)
            return null;
        int mid = nums.length/2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = formTree(nums, 0, mid-1);
        root.right = formTree(nums, mid+1, nums.length-1);
        return root;
    }
    private static TreeNode formTree(int[] nums, int l, int r){
        if(l == r)
            return new TreeNode(nums[l]);
        if(l > r)
            return null;
        int mid = (l+r+1)/2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = formTree(nums, l, mid-1);
        node.right = formTree(nums, mid+1, r);
        return node;
    }
}
