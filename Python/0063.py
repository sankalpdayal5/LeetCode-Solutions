class Solution:
    def uniquePathsWithObstacles(self, obstacleGrid: List[List[int]]) -> int:
        #m rows, n cols
        
        m = len(obstacleGrid)
        n = len(obstacleGrid[0])
        
        if m<0 or n<0 or obstacleGrid[0][0] == 1:
            return 0
        
        dp = [[0 for i in range(n)] for j in range(m)]
        
        dp[0][0] = 1
        
        for col in range(1, n):
            dp[0][col] = dp[0][col-1] if obstacleGrid[0][col] != 1 else 0
            
        for row in range(1, m):
            dp[row][0] = dp[row-1][0] if obstacleGrid[row][0] != 1 else  0
            
        for row in range(1, m):
            for col in range(1, n):
                dp[row][col] = dp[row-1][col] + dp[row][col-1] if obstacleGrid[row][col] != 1 else 0
                
        return dp[m-1][n-1]


tiume - O(mn)
space - O(mn)
            