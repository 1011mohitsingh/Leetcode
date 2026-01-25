class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int low =0, high = k-1;
        int diff = nums[nums.length-1]-nums[0];
        while(high < nums.length){
            diff = Math.min((nums[high]-nums[low]), diff);
            low++;
            high++;
        }
        return diff;
    }
}