package leetcode_easy;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeLevelOrder {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root == null)
            return res;
        add(root, res, 0);
        
        List<List<Integer>> sol = new ArrayList<>();
        for(int i=res.size()-1; i>=0; i--)
            sol.add(res.get(i));
        return sol;
    }
    private static void add(TreeNode a, List<List<Integer>> res, int height){
        if(a == null)
            return;
        if(height == res.size()){
            List<Integer> sol = new ArrayList<>();
            res.add(sol);
        }
        res.get(height).add(a.val);
        add(a.left, res, height+1);
        add(a.right, res, height+1);
    }
}
