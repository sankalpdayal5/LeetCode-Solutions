class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> numbers= new HashMap<>();
        int complement;
        for (int i=0;i< nums.length;i++) {
            complement=target-nums[i];
            if(numbers.containsKey(complement)) {
                return new int[] {i,numbers.get(complement)};
            }
            else
                numbers.put(nums[i], i);
        }
    return new int[] {-1,-1};
    }
}
