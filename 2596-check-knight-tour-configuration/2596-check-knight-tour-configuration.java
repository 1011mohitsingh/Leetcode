class Solution {
    int[][] dirs = {{-2,-1},{-2,+1},{-1,-2},{-1,+2},{+1,-2},{+1,+2},{+2,-1},{+2,+1}};
    public boolean movement(int[][] grid, int count, int row, int col){
        int n = grid.length;
        if(count == n*n-1) return true;
        for(int d[]:dirs){
            int nr = row+d[0];
            int nc = col+d[1];

            if(nr>=0 && nc>=0 && nr<n && nc < n){
                if(grid[nr][nc] == count+1){
                    return movement(grid,count+1,nr,nc);
                }
            }
        }
        return false;
    }
    public boolean checkValidGrid(int[][] grid) {
        if(grid[0][0] != 0) return false;
        return movement(grid,0,0,0);
    }
}