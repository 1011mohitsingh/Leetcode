class Solution {
    public int findArea(int[][]grid, int i, int j, int n , int m){
        if(i<0 || j<0 || j>=m || i>=n || grid[i][j] == 0){
            return 0;
        }
        grid[i][j] = 0;

        int lArea = findArea(grid, i, j-1, n ,m);
        int uArea = findArea(grid, i-1, j, n ,m);
        int rArea = findArea(grid, i, j+1, n ,m);
        int dArea = findArea(grid, i+1, j, n ,m);

        int myArea = lArea + rArea + uArea + dArea + 1;
        return myArea;
    }
    public int maxAreaOfIsland(int[][] grid) {
        int maxArea = 0;
        int n = grid.length;
        int m = grid[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j] == 1){
                    int currArea = findArea(grid, i, j, n, m);
                    maxArea = Math.max(maxArea, currArea);
                }
            }
        }
        return maxArea;
    }
}