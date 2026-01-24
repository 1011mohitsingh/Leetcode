class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int low = 0, high = nums.length-1;
        int maxPairSum = Integer.MIN_VALUE;
        while(low < high){
            maxPairSum = Math.max(maxPairSum , (nums[low++]+nums[high--]));
        }
        return maxPairSum;
    }
}