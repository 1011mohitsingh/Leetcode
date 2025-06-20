class Solution {
    public int findPeakElement(int[] nums) {
        int n = nums.length-1;
        int low= 1,high = n-1;
        if(n>0){
            if(nums[0]>nums[1]){
                return 0;
        }
            if(nums[n]>nums[n-1]){
                return n;
            }
        } else {
            return 0;
        }
        
        while(low<high){
            int mid = low+(high-low)/2;

            if(nums[mid]>nums[mid+1]){
                high = mid;
            } else {
                low = mid+1;
            }
        }
        return low;
    }
}