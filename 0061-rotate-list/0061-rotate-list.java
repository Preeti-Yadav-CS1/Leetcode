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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null) return head;
        int len=0;
        ListNode temp= head;
        while(temp!=null){
            temp= temp.next;
            len++;
        }
        k=k%len;
        if(k==0) return head;
        ListNode currNode= head;
        while(k-->0) currNode= currNode.next;
        ListNode tempHead= head;
        while(currNode.next!= null){
            currNode= currNode.next;
            tempHead= tempHead.next;
        }
        ListNode newHead= tempHead.next;
        currNode.next=head;
        tempHead.next= null;
        return newHead;
}
}