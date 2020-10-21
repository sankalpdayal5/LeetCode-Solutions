class Solution:
    def maxSubArray(self, a: List[int]) -> int:    
        max_sum =a[0] 
        curr_max_sum = a[0] 

        for i in range(1,len(a)): 
            curr_max_sum = max(a[i], curr_max_sum + a[i]) 
            max_sum = max(max_sum,curr_max_sum) 

        return max_sum
