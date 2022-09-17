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
    public ListNode sortList(ListNode head) {
        ListNode currNode=head;
        int count=0;
        ArrayList<Integer> arr= new ArrayList<>();
        while(currNode!=null){
            arr.add(currNode.val);
            count++;
            currNode= currNode.next;
        }
        currNode= head;
        Collections.sort(arr);
        int i=0;
        while(currNode!=null){
            currNode.val= arr.get(i);
            currNode= currNode.next;
            i++;
        }
        return head;
    }
}