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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int pstart=0, instart=0;
        int pend= preorder.length-1;
        int inend= inorder.length-1;
        return function(preorder, pstart, pend, inorder, instart, inend);
    }
    private TreeNode function(int[] preorder, int pstart, int pend, int[] inorder, int instart, int inend){
        if(pstart>pend || instart>inend) return null;
        int value= preorder[pstart];
        TreeNode node= new TreeNode(value);
        
        int k=0; 
        for(int i=0; i<inorder.length; i++){
            if(inorder[i]==value){
                k=i;
                break;
            }
        }
        node.left=function(preorder, pstart+1, pstart+(k-instart), inorder, instart,k-1);
        node.right=function(preorder, pstart+(k-instart)+1,pend, inorder,k+1,inend);
        return node;
    }
}