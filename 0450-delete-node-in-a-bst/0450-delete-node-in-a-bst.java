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
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null){
            return root;
        }
        
        if(root.val< key){
            root.right= deleteNode(root.right, key);
        }else if(root.val> key){
            root.left= deleteNode(root.left, key);
        }else{
            // 1 child or 0 child
            if(root.left==null){
                return root.right;
            }else if(root.right==null){
                return root.left;
            }else{
                //both child null
                int min= minimum(root.right);
                root.right= deleteNode(root.right, min);
                root.val=min;
            }
            
        }
        return root;
    }
    public int minimum(TreeNode root){
        if(root==null){
            return Integer.MAX_VALUE;
        }
        int left= minimum(root.left);
        return Math.min(left, root.val);
    } 
}

