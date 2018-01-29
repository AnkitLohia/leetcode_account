/* Complementary class for questions releated to Binary Search Tree. */

package leetcode;

public class binarySearchTree {
    int key;
    public binarySearchTree left, right;
    binarySearchTree(int k){
        key = k;
        left = null;
        right = null;
    }
    
    public void addNode(int k){
        if(k < key){
            if(left == null) insertLeftNode(k);
            else left.addNode(k);
        }
        else{
            if(right == null) insertRightNode(k);
            else right.addNode(k);
        }
        }
    public void insertLeftNode(int k){
        binarySearchTree node = new binarySearchTree(k);
        left = node;
    }
    public void insertRightNode(int k){
        binarySearchTree node = new binarySearchTree(k);
        right = node;
    }
    public binarySearchTree find(int k){
        if(k == key) return this;
        if(k < key){
            if(left == null) return null;
            else left.find(k);
        }
        else{
            if(right == null) return null;
            else return right.find(k);
        }
        return null;
    }
}
