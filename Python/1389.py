class Solution:
    def createTargetArray(self, nums: List[int], index: List[int]) -> List[int]:
        # Stores the result
        res = []
        
        # Iterate through the array where 
        # "num" is the number to be inserted at index "ind"
        
        for i in range(len(nums)):            
            num = nums[i]
            ind = index[i]
            
            # Insert "num" at index "ind"
            res.insert(ind, num)
            
        return res