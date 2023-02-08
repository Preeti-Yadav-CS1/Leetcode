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
    List<Integer> result;
    public List<Integer> rightSideView(TreeNode root) {
        result= new ArrayList<Integer>();
        addTo(root,0);
        return result;
    }
    public void addTo(TreeNode root, int n){
        if(root==null) return;
        if(result.size()== n) result.add(root.val);
        
        addTo(root.right, n+1);
        addTo(root.left, n+1);
    }
}