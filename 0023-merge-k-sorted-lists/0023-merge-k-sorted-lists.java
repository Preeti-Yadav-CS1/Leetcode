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
    public ListNode mergeKLists(ListNode[] lists){
        PriorityQueue<ListNode> pq= new PriorityQueue<>(new Comparator<ListNode>(){
            public int compare(ListNode o1, ListNode o2){
                return o1.val-o2.val;
            }
        });
        for(int i=0; i<lists.length;i++){
            if(lists[i]!=null){
                pq.add(lists[i]);
            }
        }
        
        ListNode dummy= new ListNode();
        ListNode temp= dummy;
        while(!pq.isEmpty()){
            ListNode last= pq.remove();
            dummy.next= last;
            dummy= dummy.next;
            if(last.next!=null){
                pq.add(last.next);
            }
        }
        return temp.next;
    }
}