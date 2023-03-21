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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        ArrayList<List<Integer>> result= new ArrayList<>();
        if(root==null){
            return result;
        }
        
        Queue<TreeNode> queue= new LinkedList<>();
        
        queue.add(root);
        
        while(!queue.isEmpty()){
            List<Integer> nodes= new ArrayList<>();
            int n= queue.size();
            for(int i=0;i<n;i++){
                TreeNode current= queue.poll();
                nodes.add(current.val);
                if(current.left!=null) queue.add(current.left);
                if(current.right!=null) queue.add(current.right);
                
            }
            result.add(0, nodes);
        }
        return result;
    }
}