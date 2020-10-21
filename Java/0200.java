public class Solution {
    
    public int numIslands(char[][] grid) {
        int islandCount = 0;
        for ( int x = 0; x < grid.length; ++x ){
            for( int y = 0; y < grid[0].length; ++y ){
                if ( grid[x][y] == '1'){
                    traverseIsland(x,y,grid); //visit the whole island
                    islandCount++;
                }
            }
        }
        return islandCount;
    }
    
    private void traverseIsland( int x, int y, char[][] grid ){
        if ( x < 0 || x > grid.length-1 || y < 0 || y > grid[0].length-1 || grid[x][y] != '1'){
            return;
        }else{
            grid[x][y] = '2'; //mark as visited
        }
        traverseIsland(x+1,y,grid);
        traverseIsland(x,y+1,grid);
        traverseIsland(x-1,y,grid);
        traverseIsland(x,y-1,grid);
    }
}
