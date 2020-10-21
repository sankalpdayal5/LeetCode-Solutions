/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* mergeTwoLists(ListNode* l1, ListNode* l2) {
        if(l1 == NULL && l2 == NULL) {                                  //edge case
            return l1;
        }
        ListNode *curr1 = l1, *curr2 = l2, *newNode = NULL, *head;
        while(curr1 != NULL && curr2 != NULL) {
            if(curr1->val <= curr2->val) {
                if(!newNode) {
                    newNode = new ListNode(curr1->val);
                    head = newNode;
                }
                else {
                    newNode->next = curr1;
                    newNode = newNode->next;
                }
                curr1 = curr1->next;
            }
            else {
                if(!newNode) {                              //Checking if merged list is empty
                    newNode = new ListNode(curr2->val);
                    head = newNode;
                }
                else {
                    newNode->next = curr2;
                    newNode = newNode->next;
                }
                curr2 = curr2->next;
            }
        }
        while(curr1 != NULL) {                          //to merge the left over elements after comparision
            if(!newNode) {
                newNode = new ListNode(curr1->val);
                head = newNode;
            }
            else {
                newNode->next = curr1;
                newNode = newNode->next;
            }
            curr1 = curr1->next;
        }
        while(curr2 != NULL) {                          //to merge the left over elements after comparision
            if(!newNode) {
                newNode = new ListNode(curr2->val);
                head = newNode;
            }
            else {
                newNode->next = curr2;
                newNode = newNode->next;
            }
            curr2 = curr2->next;
        }
        return head;                                    //return the head of the merged linked list
    }
};