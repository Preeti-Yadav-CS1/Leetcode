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
    class DiaPair{
        int ht=0;
    }
    public boolean isBalanced(TreeNode root) {
        if(root==null) return true;
        
        boolean Left= isBalanced(root.left);
        boolean Right= isBalanced(root.right);
        
        int absolute= Math.abs(height(root.left).ht-height(root.right).ht);
        
        return Left&&Right&&(absolute<=1);
        
    }
//     public int height(TreeNode root){
//         if(root==null) return 0;
        
//         int left= height(root.left);
//         int right= height(root.right);
        
//         return Math.max(left,right)+1;
//     }
     public DiaPair height(TreeNode root){
        if(root==null) return new DiaPair();
        DiaPair ldp= height(root.left);
        DiaPair rdp= height(root.right);
        DiaPair self= new DiaPair();
        int sd= ldp.ht+ rdp.ht;
        
        self.ht= Math.max(ldp.ht, rdp.ht)+1;
        return self;
    }
}