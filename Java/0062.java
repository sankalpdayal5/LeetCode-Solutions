class Solution {
    public int uniquePaths(int m, int n) {
        int[] arr = new int[m];
        arr[0] = 1;
        for(int i = 0; i < n; i++){
            for(int j = 1; j < m; j++){
                 arr[j] = arr[j-1] + arr[j];
            }
        }
    return arr[m-1];
    }
}
