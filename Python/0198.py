class Solution:

    def rob(self, nums: List[int]) -> int:
        curr_max = 0
        prev_max = 0

        for i in range(len(nums)):
            curr_house = nums[i]
            new_max = max(curr_max, prev_max + curr_house)
            prev_max = curr_max
            curr_max = new_max

        return curr_max
