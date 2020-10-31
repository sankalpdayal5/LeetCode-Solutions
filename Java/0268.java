class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int reqSum = n* (n+1) / 2;

        int arrSum = 0;
        for(int num: nums){
            arrrSum += num;
        }

        return reqSum = arrSum;
    }
}

// Time - O(n)
// Space - O(n)