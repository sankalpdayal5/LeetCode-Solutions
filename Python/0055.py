class Solution:
    def canJump(self, nums: List[int]) -> bool:
        n = len(nums)
        ms = n-1
        
        for i in range(n-1, -1, -1):
            if i+nums[i]>=ms:
                ms = i
            # ms = min(ms, )
            print(i, ms)
        
        return ms == 0
