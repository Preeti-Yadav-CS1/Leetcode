/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[] nextLargerNodes(ListNode head) {
        ArrayList<Integer> vals = new ArrayList();
        ListNode currNode= head;
        while(currNode!= null){
            vals.add(currNode.val);
            currNode= currNode.next;
        }
        Stack<Integer> st= new Stack();
        int[] outputArray= new int[vals.size()];
        for(int i=0; i<vals.size(); i++){
            while(!st.isEmpty() && vals.get(st.peek())<vals.get(i)){
                outputArray[st.pop()]=vals.get(i);
            }
            st.push(i);
        }
        return outputArray;
    }
}