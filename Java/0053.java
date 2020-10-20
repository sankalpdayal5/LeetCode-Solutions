class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int currSum = nums[0];
        int maxSum = nums[0];

        for (int i = 1; i < n; i++) {

            // find max between previous sum and previous sum plus current element.
            // If the sum is greated than before, consider the new element otherwise reset the currSum to the element's value.
            currSum = Math.max(nums[i], currSum + nums[i]);

            // compare at every iteration local current sum vs maxSum and update if local sum is greater.
            maxSum = Math.max(maxSum, currSum);
        }
        return maxSum;
    }
}
