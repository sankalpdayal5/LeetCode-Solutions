class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        z = 9999999999999999999
        res = 0
        for i, y in enumerate(prices):
            if y < z:
                z = y
            elif y > z:
                res = max(res, y-z)
        return res
        

        
