
class Solution {

    public int fib(int N) {
        
        int first = 0;
        int second = 1;
        
        if(N < 2) return N;
        
        for(int i = 2; i < N ; i++){
            int temp = first;
            first = second;
            second = temp + second;
        }
        
        return (first + second);
    }

}