class Solution {
    public int removeElement(int[] nums, int val) {
        
        int maxValid = 0;
        int n = nums.length;
        
        for (int i=0; i<n; i++){
            if (nums[i] != val){
                swap(nums, i, maxValid++);
            }
        }
        
        return maxValid;
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



[0,1,2,2,3,0,4,2]
val = 2

maxValid = 5
i = 7

0 - [0,1,2,2,3,0,4,2]
1 - [0,1,2,2,3,0,4,2]
2 - [0,1,2,2,3,0,4,2]
3 - [0,1,2,2,3,0,4,2]
4 - [0,1,3,2,2,0,4,2]
5 - [0,1,3,0,2,2,4,2]
6 - [0,1,3,0,4,2,2,2]

return maxValid



*/

