class Solution {
    public int maxFrequency(int[] nums, int k, int numOperations) {
        Arrays.sort(nums);

        Map<Integer, Integer> map = new HashMap<>();
        for(int n:nums){
            map.put(n, map.getOrDefault(n,0)+1);
        }
        int maxNum = nums[nums.length-1];
        int ans = 0;
        for(int target = 1; target <= maxNum; target++){
            ans = Math.max(ans , maximumFreq(target, nums, map, k , numOperations));
        }
        return ans;
    }
    private int maximumFreq(int target, int [] nums, Map<Integer, Integer> map , int k, int numOperations){
        int left = getIndex(nums, target-k);
        int right = getIndex(nums, target+k+1);
        int operations = right - left - map.getOrDefault(target, 0);
        return Math.min(operations, numOperations) + map.getOrDefault(target, 0);
    }

    private int getIndex(int[] nums, int target){
        int l = 0, r = nums.length;
        while(l < r){
            int mid = (l+r)/2;
            if(nums[mid] < target){
                l = mid+1;
            } else {
                r = mid;
            }
        }
        return l;
    }
}