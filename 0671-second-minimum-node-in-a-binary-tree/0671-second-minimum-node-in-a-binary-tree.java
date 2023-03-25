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
    public void dfs(TreeNode root, HashSet<Integer> set){
        if(root!=null){
            set.add(root.val);
            dfs(root.left, set);
            dfs(root.right, set);
        }
    }
    public int findSecondMinimumValue(TreeNode root) {
        HashSet<Integer> set= new HashSet<>();
        dfs(root, set);
        
        int min= root.val;
        long ans= Long.MAX_VALUE;
        for(int value:set){
            if(min<value && value< ans)
                ans= value;
        }
        
        return ans<Long.MAX_VALUE?(int)ans:-1;
    }
}