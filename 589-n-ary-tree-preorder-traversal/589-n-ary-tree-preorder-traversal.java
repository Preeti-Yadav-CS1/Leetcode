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
    public List<Integer> preorder(Node root) {
        LinkedList<Node> stack= new LinkedList<>();
        LinkedList<Integer> outputArray= new LinkedList<>();
        if(root==null) return outputArray;
        
        stack.add(root);
        
        while(!stack.isEmpty()){
            Node element= stack.pollLast();
            outputArray.add(element.val);
            Collections.reverse(element.children);
            for(Node child: element.children){
                stack.add(child);
            }
        }
        return outputArray;
    }
}