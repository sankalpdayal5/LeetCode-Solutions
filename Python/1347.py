'''
Leetcode 1347
Given two equal-size strings s and t. In one step you can choose any character of t and replace it with another character.

Return the minimum number of steps to make t an anagram of s.

An Anagram of a string is a string that contains the same characters with a different (or the same) ordering.


Example 1:
Input: s = "bab", t = "aba"
Output: 1
Explanation: Replace the first 'a' in t with b, t = "bba" which is anagram of s.

Example 2:
Input: s = "leetcode", t = "practice"
Output: 5
Explanation: Replace 'p', 'r', 'a', 'i' and 'c' from t with proper characters to make t anagram of s.

'''
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
