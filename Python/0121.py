class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        min_val = 9999999999999999999
        res = 0
        for i, current_val in enumerate(prices):
            if current_val < min_val:
                min_val = current_val
            elif current_val > min_val:
                res = max(res, current_val-min_val)
        return res
        

        
