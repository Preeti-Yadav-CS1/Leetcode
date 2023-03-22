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
    int min=Integer.MAX_VALUE; Integer last;
    public int getMinimumDifference(TreeNode root) {
        if(root==null) return min;
        getMinimumDifference(root.left);
        
        if(last!=null){
            min= Math.min(min, root.val-last);
        }
        last= root.val;
        getMinimumDifference(root.right);
        
        return min;
    }
}