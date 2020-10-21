class Solution {
public:
    int maxSubArray(vector<int>& nums) {
        int n=nums.size(),i;
        int res=INT_MIN;
        vector<int> dp(n,0);
        // dp[i] is the maximum sum subarray ending at i;
         //Smallest Subproblem
             dp[0]=nums[0];
        for(i=1;i<n;i++)
           dp[i]=max(nums[i],nums[i]+dp[i-1]);
        
    // Ans will be max in the dp array since we are asked to find largest sum subarray not largest sum subarray ending in n-1
     
        for(i=0;i<n;i++)
         res=max(res,dp[i]);
        
  return res;
    }
};
