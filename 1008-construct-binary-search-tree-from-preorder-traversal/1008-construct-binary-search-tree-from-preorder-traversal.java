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
    public TreeNode bstFromPreorder(int[] preorder) {
        return check(preorder, Integer.MAX_VALUE);
    }
    int i=0;
    public TreeNode check(int[] A, int max){
        if(i>=A.length || A[i]>max){
            return null;
        }
        
        TreeNode root= new TreeNode(A[i++]);
        root.left= check(A, root.val);
        root.right= check(A, max);
        return root;
    }
}