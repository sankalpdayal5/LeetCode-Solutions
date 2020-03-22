class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        
        int prev1 = 0;
        int prev2 = 0;
        
        for (int num: nums){
            int temp = prev1;
            prev1 = Math.max(prev2 + num, prev1);
            prev2 = temp;
        }        
        return prev1;            
    }
}



/*

[1,2,3,1]

p1 = 0
p2 = 0

num = 1
p1 = 1
p2 = 0

num = 2
p1 = max(2, 1) = 2
p2 = 1

num = 3
p1 = max(1+3, 2) = 4
p2 = 2

num = 1
p1 = max(2+1, 4) = 4
p2 = 4

return p1 = 4


Time - O(n)
Space - O(1)







// Dynamic Programming Approach 

[1,2,3,1]

dp[i] = Math.max(dp[i-1], dp[i-2] + nums[i])

i=0
[1]
rob = 1

i=1
[1, 2]
rob = 2

i=2
[1, 2, 3]
rob = 4

i=3
[1, 2, 3, 1]
rob = 1+3 = 4


// Code

class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if (n <= 0) return 0;
        if (n == 1) return nums[0];
        
        int[] dp = new int[n];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        
        for (int i=2; i<n; i++){
            dp[i] = Math.max(dp[i-1], dp[i-2] + nums[i]);
        }
        
        return dp[n-1];
    }
}
*/