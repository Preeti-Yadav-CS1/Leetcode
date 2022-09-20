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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy= new ListNode(0);
        ListNode l3= dummy;
        int carry= 0;
        while(l1!=null || l2!=null){
            int l1Val= (l1!=null)?l1.val: 0;
            int l2Val= (l2!=null)?l2.val:0;
            int currsum= l1Val+l2Val+carry;
            carry= currsum/10;
            int lastDigit= currsum%10;
            ListNode newnode= new ListNode(lastDigit);
            l3.next= newnode;
            if(l1!=null) l1=l1.next;
            if(l2!=null) l2=l2.next;
            l3=l3.next;
        }
        if(carry>0){
            ListNode carryNode= new ListNode(carry);
            l3.next= carryNode;
            l3= l3.next;
        }
        return dummy.next;
    }
}