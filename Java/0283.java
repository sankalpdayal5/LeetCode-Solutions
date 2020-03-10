class Solution {
    public void moveZeroes(int[] nums) {
        int maxNonZero = 0;
        
        for (int cur=0; cur<nums.length; cur++){
            if (nums[cur] != 0){
                swap(nums, cur, maxNonZero++);
            }
        }
    }
    
    void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    
}

/*

Time - O(n)
Space - O(1)


cur = 0 to n-1

maxNonZero = 2
cur = 4 (n-1)


[0,1,0,3,12]
[1,0,0,3,12]
[1,3,0,0,12]
[1,3,12,0,0]



*/