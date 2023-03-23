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
    HashSet<Integer> visited= new HashSet<>();
    public boolean findTarget(TreeNode root, int k) {
        return helper(root,k);
    }
    public boolean helper(TreeNode root, int k){
        if(root==null) return false;
        
        if(visited.contains(k-root.val))
            return true;
        visited.add(root.val);
        
        return helper(root.left,k) || helper(root.right,k);
    }
}