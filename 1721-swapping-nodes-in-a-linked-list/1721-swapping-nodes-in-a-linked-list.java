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
    public ListNode swapNodes(ListNode head, int k) {
        if(head==null){
            return head;
        }
        ListNode slow= head;
        ListNode fast= head;
        ListNode temp= head;
        while(k-->1){
            slow= slow.next;
            fast= fast.next;
        }
        while(fast.next!=null){
            temp= temp.next;
            fast= fast.next;
        }
        
        int value= temp.val;
        temp.val= slow.val;
        slow.val= value;
        
        return head;
    }
}