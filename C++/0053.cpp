class Solution {
public:
    int maxSubArray(vector<int>& nums) {
        int maxSum = INT_MIN;
        int prevMaxSum = 0;
        int n = nums.size();
        for(int i = 0; i < n; i++) {
            prevMaxSum = prevMaxSum + nums[i];
            if(maxSum < prevMaxSum) {
                maxSum = prevMaxSum;
            }
            if(prevMaxSum < 0) {
                prevMaxSum = 0;
            }
        }
        
        return maxSum;
    }
};