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
    class Pair{
        int val;
        int height;
        public Pair(int val){
            this.val= val;
            this.height=1;
        }
    }
    int ans=0;
    public Pair dfs(TreeNode root){
        if(root==null)
            return new Pair(Integer.MAX_VALUE);
        Pair left= dfs(root.left);
        Pair right= dfs(root.right);
        Pair me= new Pair(root.val);
        
        if(root.val== left.val && root.val==right.val){
            ans= Math.max(ans, left.height+right.height+1);
            me.height= Math.max(Math.max(left.height, right.height)+1, 1);
        }else if(root.val!= left.val && root.val!=right.val){
            ans=Math.max(ans,1);
        }else if(root.val==left.val){
            me.height+=left.height;
            ans= Math.max(ans,Math.max(me.height,right.height));
        }else{
            me.height+=right.height;
            ans=Math.max(ans, Math.max(me.height, left.height));
        }
        
        return me;
    }
    public int longestUnivaluePath(TreeNode root) {
        Pair me= dfs(root);
        return ans==0?ans:ans-1;
    }
}