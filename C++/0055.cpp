class Solution {
public:
    bool canJump(vector<int>& nums) {
        int n=nums.size();
        if(n==0) return true;
        if(n==1) return true;
        if(nums[0]==0) return false;

        int maxreach=nums[0],step=nums[0],jump=1;
        for(int i=1;i<n-1;i++)
        {
            maxreach=max(maxreach,i+nums[i]);
            step--;
            if(step<0) return false;
            if(step==0)
            {
                jump++;
                step=maxreach-i;
            }
        }
        if(maxreach>=n-1)
            return true;
        return false;

    }
};
