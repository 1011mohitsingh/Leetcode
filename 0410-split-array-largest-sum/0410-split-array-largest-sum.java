class Solution {
    private static int countSum(int[]nums, int maxSum){
        int n = nums.length;
        int sum = 1;
        int subArraySum = 0;
        for(int i=0;i<n;i++){
            if (subArraySum + nums[i] <= maxSum) {
                subArraySum += nums[i];
            } else {
                sum++;
                subArraySum = nums[i];
            }
        }
        return sum;
    }

    public int splitArray(int[] nums, int k) {
        int n = nums.length;
        int low = 0;
        int high = 0;
        for(int i=0;i<nums.length;i++){
            if(low<nums[i]){
                low = nums[i];
            }
            high += nums[i];
        }

        while(low<=high){
            int mid = (low+high)/2;
            int sum = countSum(nums, mid);
            if(sum > k){
                low = mid+1;
            } else {
                high = mid-1;
            }
        }
        return low;
    }
}