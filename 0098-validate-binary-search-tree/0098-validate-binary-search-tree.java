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
    public boolean isValidBST(TreeNode root) {
        return valid(root, null, null); }
    public boolean valid(TreeNode root, Integer mini, Integer maxi){
        if(root==null) return true;
        boolean left= valid(root.left, mini, root.val);
        boolean right= valid(root.right, root.val, maxi);
        return (mini==null||root.val>mini) && (maxi==null||root.val<maxi) && left && right;}
}