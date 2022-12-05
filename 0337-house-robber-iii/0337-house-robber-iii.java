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
    public int rob(TreeNode root) {
        int[] options= robHelper(root);
        return Math.max(options[0], options[1]);
    }
    
    public int[] robHelper(TreeNode root){
        if(root==null)
            return new int[2];
        
        int[] leftChoice= robHelper(root.left);
        int[] rightChoice= robHelper(root.right);
        int[] options= new int[2];
        
        //store if we choose to rob the current house
        // currentRob= Current+ASkip+Bskip
        
        options[0]= root.val + leftChoice[1] + rightChoice[1];
        
        // if we choose not to rob current house
        // rob till now= max(BRob, BSkip) + max(ARob, ASkip);
        options[1]= Math.max(leftChoice[0], leftChoice[1]) + Math.max(rightChoice[0], rightChoice[1]);
        
        return options;
        
    }
}