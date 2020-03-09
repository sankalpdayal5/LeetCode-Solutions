class Solution {
    public int minSteps(String s, String t) {
        int result = 0;
        int[] count = new int[26];
        
        for (int i=0; i<s.length(); i++){
            count[s.charAt(i) - 'a'] ++;
        }
        
        for (int j=0; j<t.length(); j++){
            if (count[t.charAt(j) - 'a'] -- <= 0)
                result ++;
        }
        
        return result;
    }
}
