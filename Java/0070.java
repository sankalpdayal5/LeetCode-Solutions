class Solution {
    public int climbStairs(int n) {
        if (n==1) return 1;
        
        int first = 1;
        int second = 2;
        
        for (int i=3; i<=n; i++){
            int third = first + second;                                    
            first = second;
            second = third;
        }
        
        return second;
    }
}


/*

Time - O(n)
Space - O(1)


[_, _, _, _, _, _]
 
 n = 6
 
 n != 1, continue next lines
 
 dp[] - size 6
 dp = [0, 0, 0, 0, 0, 0]
 dp = [1, 0, 0, 0, 0, 0]
 dp = [1, 2, 0, 0, 0, 0]
 
 i = 2 to 5 (n-1)
 
 i=2 
 dp[2] = dp[1] + dp[0] = 2 + 1 = 3
 dp = [1, 2, 3, 0, 0, 0]
 
 i=3
 dp[3] = dp[2] + dp[1] = 3 + 2 = 5
 dp = [1, 2, 3, 5, 0, 0]
 
 i=4
 dp[4] = dp[3] + dp[2] = 5 + 3 = 8
 dp = [1, 2, 3, 5, 8, 0]
 
 i=5
 dp[5] = dp[4] + dp[3] = 8 + 5 = 13
 dp = [1, 2, 3, 5, 8, 13]
 
 return dp[n-1]
 // return dp[5]
 // return 13
 
 
 // Dynamic Programming Solution
 
 class Solution {
    public int climbStairs(int n) {
        if (n==1) return 1;
        
        int[] dp = new int[n];
        dp[0] = 1;
        dp[1] = 2;
        
        for (int i=2;i <n; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        
        return dp[n-1];
    }
}
 


*/