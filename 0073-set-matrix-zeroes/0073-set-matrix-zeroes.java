class Solution {
    public void setZeroes(int[][] matrix) {
    int m = matrix.length;
    int n = matrix[0].length;
    int MARKER = -999999;

    for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++) {
            if (matrix[i][j] == 0) {
                matrix[i][j] = MARKER;
            }
        }
    }

    for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++) {
            if (matrix[i][j] == MARKER) {
                for (int k = 0; k < n; k++) {
                    if (matrix[i][k] != MARKER)
                        matrix[i][k] = 0;
                }
                for (int k = 0; k < m; k++) {
                    if (matrix[k][j] != MARKER)
                        matrix[k][j] = 0;
                }
                matrix[i][j] = 0;
            }
        }
    }
}

}