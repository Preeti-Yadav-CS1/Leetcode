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
    public boolean flipEquiv(TreeNode Left, TreeNode Right) {
        if(Left==null && Right==null) return true;
        if(Left==null || Right==null) return false;
        
        if(Left.val!=Right.val) return false;
        
        boolean flip = flipEquiv(Left.left, Right.right) && flipEquiv(Left.right, Right.left);
        boolean noFlip = flipEquiv(Left.left, Right.left) && flipEquiv(Left.right, Right.right);
        return flip|| noFlip;
    }
}