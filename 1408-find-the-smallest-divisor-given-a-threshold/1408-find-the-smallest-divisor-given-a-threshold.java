class Solution {
    private boolean checkDivisor(int[]nums, int divisor, int threshold){
        int total = 0;
        for(int num : nums){
            total += (num+divisor-1)/divisor; // I had used here the calculation instead of Math.ceil to make it slighly faster and simple
        }
        return total<= threshold;
    }

    public int smallestDivisor(int[] nums, int threshold) {
        int low = 1;
        int high = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > high) {
                high = nums[i];
            }
        }
        int minDivisor = 0;
        while(low<=high){
            int mid = low+(high-low)/2;

            if(checkDivisor(nums, mid, threshold)){
                minDivisor = mid;
                high = mid-1;
            } else {
                low = mid+1;
            }
        }
        return minDivisor;
    }
}