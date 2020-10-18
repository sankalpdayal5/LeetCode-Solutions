class Solution:
    def longestPrefix(self, s: str) -> str:
        for i in range(len(s)-1 , 0, -1):
            ls = s[:i]
            rs = s[-i:]
            
            if ls == rs:
                return ls
        
        return ""