class Solution {
public:
    int jump(vector<int>& nums) {
        int steps =1, i, curEnd = 0, newEnd=0, len = nums.size();
        if(len<=1) return 0;
        for(i=0; i<=curEnd; ++i)
        {
            newEnd = max(newEnd, i+nums[i]);
            if(newEnd>=(len-1)) return steps;
            if(i==curEnd)  // end of the current level, move to the next level
            {
                curEnd = newEnd;
                ++steps;
            }
        }
        return INT_MAX; // curEnd = newEnd, can not reach the end
    }
};