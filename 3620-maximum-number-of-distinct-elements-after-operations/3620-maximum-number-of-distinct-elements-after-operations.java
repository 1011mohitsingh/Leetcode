class Solution {
    public int maxDistinctElements(int[] nums, int k) {
        Arrays.sort(nums);
        long next = Long.MIN_VALUE / 4;
        int ans = 0;
        
        for (int num : nums) {
            long low = (long) num - (long) k;
            long high = (long) num + (long) k;
            long pick = Math.max(low, next);
            if (pick <= high) {
                ans++;
                next = pick + 1; 
            }
        }
        return ans;
    }
}