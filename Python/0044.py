class Solution:
    def isMatch(self, s: str, p: str) -> bool:
        if len(s)==0 and len(p)==0:
            return True
        if len(s)>0 and len(p)==0:
            return False
        
        pat=p[0]
        for i in range(1,len(p)):
            if p[i]=="*" and p[i-1]=="*":
                continue
            else:
                pat+=p[i]
        
        sl=len(s)
        pl=len(pat)
        dp=[[False]*(pl+1) for i in range(sl+1)]
        dp[0][0]=True
        if pat[0]=='*':
            dp[0][1]=True
        for i in range(1,sl+1):
            for j in range(1,pl+1):
                if pat[j-1]=="?" or pat[j-1]==s[i-1]:
                    dp[i][j]=dp[i-1][j-1]
                elif pat[j-1]=="*":
                    dp[i][j]=dp[i][j-1] or dp[i-1][j]
                else:
                    dp[i][j]=False
        return dp[-1][-1]
