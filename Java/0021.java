class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode finalNode = new ListNode(0);
        ListNode res = finalNode;

        while (l1 != null  && l2 != null){
            if (l1.val <=  l2.val) {
                res.next = l 1; 
                l1 = l1.next;
                res = res.next;
            }
            else{
                res.next =  l2;
                l2 =  l2.next;
                res =  res.next; 
            }
        }
        if (l1 ==  null){
            res.next =  l2;
        }
        else {
            res.next = l1;
        }
        return finalNode.next;
    }
  
}


// Time  = O(n)
// Space = O(1)