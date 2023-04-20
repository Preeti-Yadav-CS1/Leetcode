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
    class Node {
        TreeNode node;
        int index;
        Node(TreeNode node, int index){
            this.node= node;
            this.index= index;
        }
    }
    public int widthOfBinaryTree(TreeNode root) {
        Queue<Node> queue= new LinkedList<>();
        queue.add(new Node(root,0));
        int max=0;
        
        while(!queue.isEmpty()){
            int size= queue.size();
            int start=0, end=0;
            for(int i=0;i<size;i++){
                Node remove= queue.remove();
                int index= remove.index;
                if(i==0)
                    start= index;
                if(i==size-1)
                    end= index;
                
                if(remove.node.left!=null)
                    queue.add(new Node(remove.node.left, 2*remove.index));
                if(remove.node.right!=null)
                    queue.add(new Node(remove.node.right, 2*remove.index+1));
            }
            max=Math.max(max,end-start+1);
        }
        return max;
    }
}