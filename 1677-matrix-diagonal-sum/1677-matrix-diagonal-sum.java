class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        for(int i=0;i<mat.length;i++){
            sum += mat[i][i];
            if (i != mat.length-1-i){
                sum+= mat[i][mat.length-1-i];
            }
        }
        return sum;
    }
}

// class Solution {
//     public int diagonalSum(int[][] mat) {
//         int sum = 0;
//         for(int i=0;i<mat.length;i++){
//             for(int j=0;j<mat[0].length;j++){
//                 if(i == j || i+j == mat.length-1){
//                     sum += mat[i][j];
//                 }
//             }
//         }
//         return sum;
//     }
// }

