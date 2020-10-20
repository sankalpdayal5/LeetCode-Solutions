class Solution {
public:
    int rob(vector<int>& nums) {
        if(nums.size() == 0) {
            return 0;
        }
        int n = nums.size();
        int dp[101][101];
        dp[0][0] = nums[0];
        for(int i = 1; i < n; i++) {
            dp[0][i] = 0;
        }
        for(int i = 1; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(j > i) {
                    dp[i][j] = 0;
                }
                else if(j < i) {
                    dp[i][j] = dp[i-1][j];
                }
                else if(i == 1 && j == 1){
                    dp[i][j] = max(nums[i-1], nums[j]);
                }
                else{
                    dp[i][j] = max(dp[i][j-2] + nums[j], dp[i][j-1]);
                }
            }
       }
        
        int maxi = 0;
        for(int i = 0; i < n; i++) {
           maxi = max(dp[n-1][i], maxi);
        }
        return maxi;
    }
};