class Solution {
    public boolean magicSquare(int[][] grid, int i, int j){
        if(grid[i+1][j+1] != 5) return false;
        boolean[] seen = new boolean[10];

        for(int r=i;r<i+3;r++){
            for(int c=j;c<j+3;c++){
                int val = grid[r][c];
                if( val < 1 || val > 9 || seen[val]) return false;
                seen[val] = true;
            }
        }

        int firstR = (grid[i][j]+grid[i][j+1]+grid[i][j+2]);
        int secondR = (grid[i+1][j]+grid[i+1][j+1]+grid[i+1][j+2]);
        int thirdR = (grid[i+2][j]+grid[i+2][j+1]+grid[i+2][j+2]);
        int firstC = (grid[i][j]+grid[i+1][j]+grid[i+2][j]);
        int secondC = (grid[i][j+1]+grid[i+1][j+1]+grid[i+2][j+1]);
        int thirdC = (grid[i][j+2]+grid[i+1][j+2]+grid[i+2][j+2]);
        int firstD = (grid[i][j]+grid[i+1][j+1]+grid[i+2][j+2]);
        int secondD = (grid[i+2][j]+grid[i+1][j+1]+grid[i][j+2]);
        return (firstR == secondR && secondR == thirdR && thirdR == firstC && firstC == secondC && secondC == thirdC && thirdC == firstD && firstD == secondD);
    }
    public int numMagicSquaresInside(int[][] grid) {
        int count = 0;
        for(int i=0;i<grid.length-2;i++){
            for(int j=0;j<grid[0].length-2;j++){
                if(magicSquare(grid,i,j)){
                    count++;
                }
            }
        }
        return count;
    }
}