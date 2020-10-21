class Solution {
    public int mincostTickets(int[] days, int[] costs) {
        int[] minCost = new int[days[days.length-1]+1];
        int currDay = 0;
        minCost[1] = costs[0];
        for(int i=1;i<minCost.length; i++){
            int day = i-1 < 0 ? 0:i-1;
            int week = i-7 < 0 ? 0:i-7;
            int month = i-30 < 0 ? 0:i-30;
            if(days[currDay] == i){
                minCost[i] = Math.min(minCost[day]+costs[0], Math.min(minCost[week]+costs[1], minCost[month]+costs[2]));
             
                currDay++;
            }
            else{
                minCost[i] = minCost[i-1];
            }
        }
        return minCost[minCost.length-1];
        
    }
}
