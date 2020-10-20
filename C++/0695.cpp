class Solution {
public:
    int maxAreaOfIsland(vector<vector<int>>& grid) {
        int res = 0;
        for(int i=0; i<grid.size(); i++){
            for(int j=0; j<grid[0].size(); j++){
                if(grid[i][j] == 0) continue;
                res = max(res, find(grid, i, j));
            }
        }
        return res;
    }
    int find(vector<vector<int>>& grid, int i, int j){
        if(i<0 || i>=grid.size() || j<0 || j>=grid[0].size() || grid[i][j] == 0) return 0;
        grid[i][j] = 0;
        return find(grid, i-1, j)+find(grid, i+1, j)+find(grid, i, j-1)+find(grid, i, j+1)+1;
    }
};