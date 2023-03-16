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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        int pstart=0, instart=0;
        int pend= postorder.length -1;
        int inend= inorder.length -1;
        return function(inorder, instart, inend, postorder, pstart, pend);
    }
    private TreeNode function(int[] inorder, int instart, int inend, int[] postorder, int pstart, int pend){
        if(pstart>pend|| instart>inend) return null;
        int val= postorder[pend];
        TreeNode node= new TreeNode(val);
        
        int k=0; 
        for(int i=0; i<inorder.length; i++){
            if(inorder[i]== val){
                k=i;
                break;
            }
        }
        node.left= function(inorder, instart, k-1, postorder, pstart, pstart+k-(instart+1));
        node.right= function(inorder, k+1,inend, postorder, pstart+k-instart, pend-1);
        return node;
    }
}