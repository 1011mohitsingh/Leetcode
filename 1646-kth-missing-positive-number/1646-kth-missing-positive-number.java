class Solution {
    public int findKthPositive(int[] arr, int k) {
        int low = 0, high = arr.length-1;

        while(low<=high){
            int mid = low+(high-low)/2;
            int missing = (arr[mid]-(mid+1));
            if(missing < k){
                low = mid+1;
            } else {
                high = mid-1;
            }
        }
        return high+k+1;
        // or return low+k;
    }
}

// class Solution {
//     public int findKthPositive(int[] arr, int k) {
//         int index = 0,expected = 1,i=0; 
//         while(index < k){
//             if(i < arr.length && arr[i] == expected){
//                 i++;
//             } else {
//                 index++;
//                 if (index == k) return expected;
//             }
//             expected++;
//         }
//         return -1;
//     }
// }