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
    public ListNode deleteMiddle(ListNode head) {
        if(head.next==null || head==null){
            return null;
        } 
        ListNode count= head;
        int size=0;
        while(count.next!=null){
            size++;
            count=count.next;
            
        }
        int len= (size%2==0)?(size/2):((size+1)/2);
        ListNode currnode= head;
        ListNode ptr= head.next;
        for(int i=0; i<len-1;i++){
            currnode=ptr;
            ptr= ptr.next;
        }
        currnode.next=ptr.next;
        return head;
    }
}