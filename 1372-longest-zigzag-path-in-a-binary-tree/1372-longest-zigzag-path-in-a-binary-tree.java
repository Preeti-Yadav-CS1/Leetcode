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
    int maxPath;
    public int longestZigZag(TreeNode root) {
        dfs(root, false,0);
        dfs(root, true, 0);
        return maxPath;
    }
    public void dfs(TreeNode root, boolean goLeft, int step){
        if(root==null)
            return;
        maxPath=Math.max(maxPath, step);
        if(goLeft){
            dfs(root.left, false, step+1);
            dfs(root.right, true, 1);
        }else{
            dfs(root.left, false, 1);
            dfs(root.right, true, step+1);
        }
        return;
    }
}