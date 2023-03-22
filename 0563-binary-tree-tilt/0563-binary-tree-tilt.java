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
    int tilt=0;
    public int findTilt(TreeNode root) {
        valueSum(root);
        return tilt;
    }
    
    public int valueSum(TreeNode root){
        if(root==null)
            return 0;
        
        int left= valueSum(root.left);
        int right= valueSum(root.right);
        int tiltAbs= Math.abs(left-right);
        tilt+=tiltAbs;
        return root.val+left+right;
    }
}