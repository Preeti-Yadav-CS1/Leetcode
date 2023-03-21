/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public int maxDepth(Node root) {
        ArrayList<List<Integer>> result= new ArrayList<>();
        if(root==null)
            return 0;
        Queue<Node> queue= new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            List<Integer> nodes= new ArrayList<>();
            int n = queue.size();
            for(int i=0;i<n;i++){
                Node current= queue.poll();
                nodes.add(current.val);
                for(Node curr: current.children){
                    queue.add(curr);
                }
            }
            
            result.add(nodes);
        }
        
        return result.size();
    }
}