class Solution {
    public int minRemoval(int[] nums, int k) {
        Arrays.sort(nums);
        int maxWindowSize = 0;
        int i= 0, j = 0;
        while(i<nums.length){
            while(j<nums.length && (long)nums[j] <= (long)k*nums[i]){
                j++;
            } 
            maxWindowSize = Math.max(maxWindowSize, j-i);
            i++;
        }
        return nums.length-(maxWindowSize);
    }
}