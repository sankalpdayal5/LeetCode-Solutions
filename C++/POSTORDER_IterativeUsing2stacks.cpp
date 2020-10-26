/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
  
    vector<int> postorderTraversal(TreeNode* root) {
        vector<int>ans;
        stack<TreeNode*>st1;
        stack<TreeNode*>st2;
        if(root==NULL)
            return ans;
        st1.push(root);
        
            while(!st1.empty())
            {
                st2.push(st1.top());
                st1.pop();
                if(st2.top()->left)
                    st1.push(st2.top()->left);
                 if(st2.top()->right)
                    st1.push(st2.top()->right);
            }
        while(!st2.empty())
        {
            ans.push_back(st2.top()->val);
            st2.pop();
        }
        return ans;
    }
};
