class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int low = 1,high = arr.length-2;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(arr[mid]>arr[mid-1] && arr[mid]> arr[mid+1]){
                return mid;
            } else if(arr[mid] > arr[mid+1]) {
                high = mid-1;
            } else {
                low = mid+1;
            }
        }
        return -1;
    }
}