class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character>[] rows = new HashSet[9];
        HashSet<Character>[] cols = new HashSet[9];
        HashSet<Character>[] boxes = new HashSet[9];

        for(int i=0;i<9;i++){
            rows[i] = new HashSet<Character>();
            cols[i] = new HashSet<Character>();
            boxes[i] = new HashSet<Character>();
        }

        for(int r = 0;r<board.length;r++){
            for(int c = 0;c<board[0].length;c++){
                char ceil = board[r][c];
                if(ceil == '.'){
                    continue;
                }
                
                if(rows[r].contains(ceil)){
                    return false;
                }
                rows[r].add(ceil);

                if(cols[c].contains(ceil)){
                    return false;
                }
                cols[c].add(ceil);

                int boxIndex = 3*(r/3)+(c/3);
                if(boxes[boxIndex].contains(ceil)){
                    return false;
                }
                boxes[boxIndex].add(ceil);
            }
        }
        return true;
    }
}