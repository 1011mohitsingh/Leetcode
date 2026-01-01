class Solution {
    public boolean solve(char[][]board, HashSet<Character>[] rows,HashSet<Character>[] cols,HashSet<Character>[] boxes,int r, int c){
        if(r==9) return true;
        int nextR = ((c==8) ? r+1:r);
        int nextC = ((c==8) ? 0:c+1);
        if(board[r][c] != '.'){
            return solve(board,rows,cols,boxes,nextR,nextC);
        }

        for(char d='1';d<='9';d++){
            int boxIndex = (r/3)*3+(c/3);
            if (rows[r].contains(d) || cols[c].contains(d) || boxes[boxIndex].contains(d)) {
                continue;
            }
            board[r][c] = d;
            rows[r].add(d);
            cols[c].add(d);
            boxes[boxIndex].add(d);

            if(solve(board,rows, cols, boxes,nextR,nextC)){
                return true;
            }
            board[r][c] = '.';
            rows[r].remove(d);
            cols[c].remove(d);
            boxes[boxIndex].remove(d);
        }
        return false;
    }
    public void solveSudoku(char[][] board) {
        HashSet<Character>[] rows = new HashSet[9];
        HashSet<Character>[] cols = new HashSet[9];
        HashSet<Character>[] boxes = new HashSet[9];

        for(int i=0;i<9;i++){
            rows[i] = new HashSet<>();
            cols[i] = new HashSet<>();
            boxes[i] = new HashSet<>();
        }
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j] != '.'){
                    rows[i].add(board[i][j]);
                    cols[j].add(board[i][j]);
                    boxes[(i/3*3)+j/3].add(board[i][j]);
                }
            }
        }
        solve(board, rows,cols, boxes,0,0);
    }
}