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
    public ListNode middleNode(ListNode head) {
        ListNode cur=head;
        int n=0;
        while(cur!=null){
            n++;
            cur=cur.next;
        } // find the length of linked list
        for(int i=0;i<n/2;i++){
            head=head.next; 
        }
        return head;
    }
}
