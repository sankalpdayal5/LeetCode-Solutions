class Solution:
    def minSteps(self, s: str, t: str) -> int:
        map_s = {}
        for char in s:
            if char in map_s:
                count = map_s.get(char)
                count = count+1
                map_s.update({char:count})
            else:
                map_s[char] = 1
                
        answer = 0
        for char in t:
            if char not in map_s:
                answer = answer+1
            else:
                count = map_s.get(char)-1
                map_s.update({char:count})
                if count<0:
                    answer = answer+1        
        return answer
