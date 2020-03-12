/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        
        ListNode finalNode = new ListNode(0);
        ListNode res = finalNode;
        
        while (l1 != null && l2 != null){
            if (l1.val <= l2.val){
                res.next = l1;
                l1 = l1.next;
                res = res.next;
            }
            else{
                res.next = l2;
                l2 = l2.next;
                res = res.next;
            }
        }
        
        if (l1 == null){
            res.next = l2;
        }
        else{
            res.next = l1;
        }
        
        return finalNode.next;
        
    }
}


/*
Time - O(n)
Space - O(1)


 l1 = 1->2->4
 l2 = 1->3->4
 
 fN = 0
 res = 0
 
 res.next = 1
 fN = 0->1
 l1 = 2->4
 l2 = 1->3->4
 
 res.next = 1
 fN = 0->1->1
 l1 = 2->4
 l2 = 3->4
 
 res.next = 2
 fN = 0->1->1->2
 l1 = 4
 l2 = 3->4
 
 res.next = 3
 fN = 0->1->1->2->3
 l1 = 4
 l2 = 4
 
 res.next = 4
 fN = 0->1->1->2->3->4
 l1 = null
 l2 = 4
 
 break while
 res.next = l2
 fN = 0->1->1->2->3->4 -> 4
 
 
 fN = 1->1->2->3->4->4 
 
 
 
 

*/