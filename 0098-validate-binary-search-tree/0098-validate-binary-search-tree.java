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
    class BSTPair{
        boolean isbst= true;
        long min= Long.MAX_VALUE;
        long max= Long.MIN_VALUE;
    }
    public boolean isValidBST(TreeNode root) {
        return validBST(root).isbst;
    }
    public BSTPair validBST(TreeNode root){
        if(root==null){
            return new BSTPair();
        }
        BSTPair left= validBST(root.left);
        BSTPair right= validBST(root.right);
        BSTPair self= new BSTPair();
        
        self.max= Math.max(left.max, Math.max(right.max, root.val));
        self.min= Math.min(left.min, Math.min(right.min, root.val));
        
        if(left.isbst && right.isbst && left.max<root.val && right.min>root.val){
            self.isbst= true;
        }else{
            self.isbst= false;
        }
        return self;
    }
    
}