class Solution {
    public int maxProfit(int[] prices) {
        
        if (prices.length < 1) return 0;
        
        int minCP = prices[0];
        int maxP = 0;
        
        for (int i=0; i<prices.length; i++){
            minCP = Math.min(prices[i], minCP);
            maxP = Math.max(maxP, prices[i] - minCP);
        }
        
        return maxP;
        
    }
}

/*

Time - O(n)
Space - O(1)



[7,1,5,3,6,4]

i=0
minCP = 7
maxP = 0

i=1
minCP = 1
maxP = 0

i=2
minCP = 1
maxP = 4

i=3
minCP = 1
maxP = 4

i=4
minCP = 1
maxP = 5

i=5
minCP = 1
maxP = 5


minCP = cost price
maxP = profit

Minimize the cost price
Maximize the profit









Basic Algo

i = 0 to n-1
    j = i+1 to n-1
        if prices[j]-prices[i] > maxP
            maxP = prices[j] - prices[i]
        
 
 
*/