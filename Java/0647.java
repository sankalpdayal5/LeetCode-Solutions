class Solution {
    public int countSubstrings(String s) {
        int n = s.length();
        int result = 0;
        
        for (int i=0; i<n; i++){
            result += findP(s, i, i, n);
            result += findP(s, i, i+1, n);
        }
        
        return result;
    }
    
    int findP(String s, int l, int r, int n){
        int temp= 0;
        
        while (l>=0  && r<=n-1){
            if (s.charAt(l) == s.charAt(r)){
                l--;
                r++;
                temp ++;
            }
            else{
                break;
            }
        }
        
        return temp;
    }
}





