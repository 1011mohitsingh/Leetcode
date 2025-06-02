class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> spiralOrder = new ArrayList<>();

        int sr = 0;
        int sc = 0;
        int er = matrix.length-1;
        int ec = matrix[0].length-1;

        while(sr<=er && sc<=ec){
            // top 
            for(int i=sc;i<=ec;i++){
                spiralOrder.add(matrix[sr][i]);
            }

            // right 
            for(int j=sr+1;j<=er;j++){
                spiralOrder.add(matrix[j][ec]);
            }

            // bottom 
            for(int i=ec-1;i>=sc;i--){
                if (sr == er){
                    break;
                }
                spiralOrder.add(matrix[er][i]);
            }

            // left 
            for(int i=er-1;i>=sr+1;i--){
                if (sc == ec){
                    break;
                }
                spiralOrder.add(matrix[i][sc]);
            }
        sr++;
        sc++;
        er--;
        ec--;
        }
        return spiralOrder;
    }
}