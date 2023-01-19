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
    public boolean isBalanced(TreeNode root) {
        if(root==null) return true;
        boolean Left= isBalanced(root.left);
        boolean Right= isBalanced(root.right);
        int absolute= Math.abs(height(root.left)-height(root.right));
        return Left&&Right&&(absolute<=1);
        
    }
    public int height(TreeNode root){
        if(root==null) return 0;
        
        int left= height(root.left);
        int right= height(root.right);
        return Math.max(left,right)+1;
    }
}