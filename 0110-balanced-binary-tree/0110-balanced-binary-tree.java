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
        int d=0;
    }
    public boolean isBalanced(TreeNode root) {
        if(root==null) return true;
        
        boolean Left= isBalanced(root.left);
        boolean Right= isBalanced(root.right);
        
        int absolute= Math.abs(diameter(root.left).ht-diameter(root.right).ht);
        
        return Left&&Right&&(absolute<=1);
        
    }
//     public int height(TreeNode root){
//         if(root==null) return 0;
        
//         int left= height(root.left);
//         int right= height(root.right);
        
//         return Math.max(left,right)+1;
//     }
     public DiaPair diameter(TreeNode root){
        if(root==null) return new DiaPair();
        DiaPair ldp= diameter(root.left);
        DiaPair rdp= diameter(root.right);
        DiaPair self= new DiaPair();
        int sd= ldp.ht+ rdp.ht;
        
        self.d= Math.max(Math.max(ldp.d, rdp.d), sd);
        self.ht= Math.max(ldp.ht, rdp.ht)+1;
        return self;
    }
}