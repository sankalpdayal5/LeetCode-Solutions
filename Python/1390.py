class Solution:
    def sumFourDivisors(self, nums: List[int]) -> int:
        res = 0
        for num in nums:
            res += self.rSum(num)
            
        return res
        
        
        
    def rSum(self, n):
        s = 0
        no = 0
        
        if int(n**(0.5)) ** 2 == n:
            return 0
        
        for i in range(1, int(n**(0.5) + 1)):
            if n%i == 0:
                if no == 4:
                    return 0
                
                no += 2                
                s += i
                s += n//i
                
        if no == 4:
            return s
        else:
            return 0
        