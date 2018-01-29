/*Given a binary tree, return the level order traversal of its nodes' values. 
 (ie, from left to right, level by level).
*/

package leetcode;
import java.util.ArrayList;
import java.util.LinkedList;

import leetcode.binarySearchTree;

public class levelOrderTraversalBST {
    public static void main(String[] args){
        binarySearchTree bst = new binarySearchTree(0);
        bst.addNode(2); bst.addNode(1); bst.addNode(-1);bst.addNode(-2);
        bst.addNode(3);bst.addNode(2); bst.addNode(2);
        levelOrderTraversalBST b = new levelOrderTraversalBST();
        ArrayList<ArrayList<Integer>> nodes = b.levelOrderBST(bst);
        //ArrayList<ArrayList<Integer>> nodes = b.levelOrderBST_DFS(bst);
        for(ArrayList<Integer> node:nodes){
            for(Integer key:node){
                System.out.println(key);
            }
        }
    }
    public ArrayList<ArrayList<Integer>> levelOrderBST(binarySearchTree root){
        ArrayList<ArrayList<Integer>> nodes = new ArrayList<ArrayList<Integer>>();
        LinkedList<binarySearchTree> q = new LinkedList<binarySearchTree>();
        q.add(root);
        q.add(null);
        nodes.add(new ArrayList<Integer>());
        int lvl = 0;
        while(!q.isEmpty()){
            binarySearchTree node = q.remove(0);
            if(node == null && q.isEmpty())break;
            if (node == null){
                nodes.add(new ArrayList<Integer>());
                lvl++;
                q.add(null);
                continue;
            }
            nodes.get(lvl).add(node.key);
            if(node.left != null) q.add(node.left);
            if(node.right != null) q.add(node.right);
        }
        return nodes;        
    }
    
    public ArrayList<ArrayList<Integer>> levelOrderBST_DFS(binarySearchTree root){
        ArrayList<ArrayList<Integer>> nodes = new ArrayList<ArrayList<Integer>>();
        addNodes(root, 0, nodes);
        return nodes;
    }
    
    public void addNodes(binarySearchTree node, int lvl, ArrayList<ArrayList<Integer>> nodes){
        if(nodes.size() == lvl){
            nodes.add(new ArrayList<Integer>());
        }
        nodes.get(lvl).add(node.key);
        if(node.left != null){
            addNodes(node.left, lvl+1, nodes);
        }
        if(node.right != null){
            addNodes(node.right, lvl+1, nodes);
        }
    }
}
