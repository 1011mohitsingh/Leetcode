class Solution {
    public static int findMaxIndex(int[][] mat, int n , int m, int col){
        int maxValue = -1;
        int index = -1;
        for(int i=0;i<n;i++){
            if(mat[i][col] > maxValue){
                maxValue = mat[i][col];
                index = i;
            }
        }
        return index;
    }
    public int[] findPeakGrid(int[][] mat) {
        int n = mat.length;
        int m= mat[0].length;
        int low =0, high = m-1;
        while(low<=high){
            int mid = (low+high)/2;
            int maxRowIndex = findMaxIndex(mat, n , m , mid);
            int left = mid-1 >= 0 ? mat[maxRowIndex][mid-1] :-1;
            int right = mid+1 < m ? mat[maxRowIndex][mid+1] :-1;

            if(mat[maxRowIndex][mid] > left && mat[maxRowIndex][mid] > right){
                return new int[] {maxRowIndex, mid};
            } else if(mat[maxRowIndex][mid] < left){
                high = mid-1;
            } else {
                low = mid+1;
            }
        }
        return new int[]{-1,-1};
    }
}


// class Solution {
//     public int[] findPeakGrid(int[][] mat) {
//         int result[] = new int[2];
//         int m = mat.length;
//         int n= mat[0].length;
//         boolean found = false;

//         for(int i=0;i<m && !found;i++){
//             for(int j=0;j<n && !found;j++){
//                 int curr = mat[i][j];
//                 int top = i>0 ? mat[i-1][j] : -1;
//                 int bottom = i<m-1 ? mat[i+1][j]: -1;
//                 int left = j>0 ? mat[i][j-1] : -1;
//                 int right = j<n-1 ? mat[i][j+1] : -1;
//                 if (curr > top && curr > bottom && curr > left && curr > right) {
//                     result[0] = i;
//                     result[1] = j;
//                     found = true;
//                 }
//             }
//         }
//         return result;
//     }
// }
