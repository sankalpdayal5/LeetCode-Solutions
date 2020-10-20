class Solution {
public:
    int climbStairs(int n) {
        int StepOne = 1;
        int StepTwo = 0;
        int ret = 0;
        for(int i=0;i<n;i++)
        {
            ret = StepOne + StepTwo;
            StepTwo = StepOne;
            StepOne = ret;
        }
        return ret;
    }
};