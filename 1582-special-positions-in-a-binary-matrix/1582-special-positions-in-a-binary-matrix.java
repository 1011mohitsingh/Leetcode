class Solution {
    public boolean checkCondition(int[][] mat, int i, int j){
        for(int k = 0;k<mat[0].length;k++){
            if(k != j && mat[i][k] == 1) return false;
        }
        for(int l= 0;l<mat.length;l++){
            if(l != i && mat[l][j] == 1) return false;
        }
        return true;
    }
    public int numSpecial(int[][] mat) {
        int count = 0;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j] == 1 && checkCondition(mat,i,j)){
                    count++;
                }
            }
        }
        return count;
    }
}