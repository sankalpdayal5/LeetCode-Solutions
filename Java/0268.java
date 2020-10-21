class Solution {
    public int missingNumber(int[] nums) {
        Set<Integer> a = new HashSet<Integer>();
        for (int num : nums) a.add(num);

        int actual = nums.length + 1;
        for (int number = 0; number < actual; number++) {
            if (!a.contains(number)) {
                return number;
            }
        }
        return -1;
    }
}
