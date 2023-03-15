/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isCompleteTree(TreeNode root) {
        int n= numberNode(root);
        return completeTree(root,0, n);
    }
    public int numberNode(TreeNode root){
        if(root==null){
            return 0;
        }
        return 1+numberNode(root.left)+numberNode(root.right);
    }
    
    public boolean completeTree(TreeNode root, int index, int n){
        if(root==null){
            return true;
        }
        if(index>=n){
            return false;
        }
        
        return completeTree(root.left, 2*index+1, n)&& completeTree(root.right, 2*index+2, n);
    }
    
}