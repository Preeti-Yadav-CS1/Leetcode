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
        return createTree(inorder,0, inorder.length-1,preorder,0,preorder.length-1);
    }
    public TreeNode createTree(int[] inorder,int ilow, int ihigh, int[] preorder, int plow, int phigh){
        if(ilow > ihigh || plow > phigh){
            return null;
        }
        TreeNode nn= new TreeNode(preorder[plow]);
        int index= search(inorder, ilow, ihigh, preorder[plow]);
        int netEle= index-ilow;
        nn.left= createTree(inorder, ilow, index-1, preorder, plow+1, plow+netEle);
        nn.right= createTree(inorder, index+1, ihigh, preorder, plow+netEle+1, phigh);
        return nn;
        
    }
    public int search(int[] inorder, int start, int end, int item){
        for(int i=start; i<=end;i++){
            if(inorder[i]==item)
                return i;
        }
        return -1;
    }
}