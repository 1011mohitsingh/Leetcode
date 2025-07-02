class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int a = n + m;
        double mid = 0;
        int i = 0, j = 0, k = 0;

        int prev = 0, curr = 0;
        while (k <= a / 2) {
            prev = curr;

            if (i < n && (j >= m || nums1[i] <= nums2[j])) {
                curr = nums1[i++];
            } else {
                curr = nums2[j++];
            }
            k++;
        }
        if (a % 2 != 0) {
            mid = curr;
        } else {
            mid = (prev + curr) / 2.0;
        }

        return mid;
    }
}


// class Solution {
//     public double findMedianSortedArrays(int[] nums1, int[] nums2) {
//         int n = nums1.length;
//         int m = nums2.length;
//         int a = n+m;
//         int[] result = new int[a];
//         double mid = 0;
//         int i = 0, j = 0, k = 0;


//         while (i < n && j < m) {
//             if (nums1[i] <= nums2[j]) {
//                 result[k++] = nums1[i++];
//             } else {
//                 result[k++] = nums2[j++];
//             }
//         }
        
//         while (i < n) {
//             result[k++] = nums1[i++];
//         }
        
//         while (j < m) {
//             result[k++] = nums2[j++];
//         }

//         if(a%2 != 0){
//             mid =result[a/2];
//         } else {
//             mid =(result[a/2-1]+result[a/2])/2.0;
//         }

//         return mid;
//     }
// }