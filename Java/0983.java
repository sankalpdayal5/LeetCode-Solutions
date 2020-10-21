class Solution {
    public int mincostTickets(int[] days, int[] costs) {
        int lastDay = days[days.length - 1];
        int n = lastDay + 1;
        
        int[] dp = new int[n];
        boolean[] bool = new boolean[n];
        for (int d:days) bool[d] = true;
        
        for (int i=1; i<n; i++){
            if (bool[i]){
                dp[i] = dp[i-1] + costs[0];
                dp[i] = Math.min(dp[i], dp[Math.max(0, i-7)] + costs[1]);
                dp[i] = Math.min(dp[i], dp[Math.max(0, i-30)] + costs[2]);
            }
            else{
                dp[i] = dp[i-1];
            }
        }
        
        return dp[lastDay];
        
    }
}


/*
Time - O(n)
Space - O(n)


dp[i] storing cost of travel upto i days

dp[i] = dp[i-1] + costs[0]
dp[i] = Math.min(dp[i], dp[Math.max(0, i-7)] + costs[1])
dp[i] = Math.min(dp[i], dp[Math.max(0, i-30)] + costs[2])


*/