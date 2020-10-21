class Solution(object):
   def uniquePaths(self, m, n):
      row = n
      column = m
      dp = [[-1 for i in range(m)] for j in range(n)]
      dp[row-2][column-1] = 1
      for i in range(column):
         dp[n-1][i] = 1
      for i in range(row):
         dp[i][column-1]=1
      for i in range(row-2,-1,-1):
         for j in range(column-2,-1,-1):
            dp[i][j] = dp[i+1][j] + dp[i][j+1]
      return dp[0][0]
