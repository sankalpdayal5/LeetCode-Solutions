class Solution {
    public int findDuplicate(int[] nums) {
        // find intersection
        int slow = nums[0];
        int fast = nums[0];

        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while(slow != fast);

        // find entrance of cycle
        int ele = nums[0];

        while (ele != slow) {
            ele = nums[ele];
            slow = nums[slow];
        }

        return ele;
    }
}