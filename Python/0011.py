class Solution:
    def maxArea(self, height: List[int]) -> int:
        if len(height)<2:
            return 0
        lp=0
        rp=len(height)-1
        maxi=0
        while(1>0):
            if lp>=rp:
                return maxi
            curr=(rp-lp)*(min(height[lp],height[rp]))
            if curr>maxi:
                maxi=curr
            if height[lp]<height[rp]:
                lp+=1
            elif height[rp]<height[lp]:
                rp-=1
            else:
                lp+=1
                rp-=1
        
