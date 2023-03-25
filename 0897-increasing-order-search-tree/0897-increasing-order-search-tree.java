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
    public TreeNode increasingBST(TreeNode root) {
        ArrayList<Integer> res= new ArrayList<>();
        inorder(root,res);
        TreeNode current= new TreeNode(0);
        TreeNode result= current;
        for(int value:res){
            current.right= new TreeNode(value);
            current= current.right;
        }
        return result.right;
    }
    
    public void inorder(TreeNode root, ArrayList<Integer> res){
        if(root==null)
            return;
        inorder(root.left, res);
        res.add(root.val);
        inorder(root.right, res);
    }
}