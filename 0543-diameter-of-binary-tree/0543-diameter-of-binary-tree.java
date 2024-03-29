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
class DiaPair{
    int ht=0;
    int d=0;
}
class Solution {
    
    public int diameterOfBinaryTree(TreeNode root) {
        return diameter(root).d;
    }
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