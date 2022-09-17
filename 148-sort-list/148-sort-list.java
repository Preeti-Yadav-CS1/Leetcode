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
        if(head==null || head.next==null)
            return head;
        //find mid
        ListNode mid= getMid(head);
        
        //left right ms
        ListNode rightHead= mid.next;
        mid.next=null;
        //mrege sort
        ListNode newLeft= sortList(head);
        ListNode newRight= sortList(rightHead);
        
        //merge
        return merge(newLeft, newRight);
    }
    
    //2 pointer approach
    private ListNode getMid(ListNode head){
        ListNode slow=head;
        ListNode fast=head.next;
        
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    
    private ListNode merge(ListNode left, ListNode right){
        ListNode dummy= new ListNode(-1);
        ListNode currNode= dummy;
        
        while(left!=null && right!=null){
            if(left.val<=right.val){
                currNode.next=left;
                left=left.next;
                currNode=currNode.next;
            }else{
                currNode.next=right;
                right=right.next;
                currNode=currNode.next;
            }
        }
        
        while(left!=null){
            currNode.next=left;
            left=left.next;
            currNode=currNode.next;
        }
        while(right!=null){
            currNode.next=right;
            right=right.next;
            currNode=currNode.next;
        }
        
        return dummy.next;
    }
}