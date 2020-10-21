class Solution(object):
    def climbStairs(self, n):
        curr = prev = 1
	for _ in range(n-1):
		curr, prev = curr + prev, curr
	return curr
        
