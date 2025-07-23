class Solution {
    public boolean canJump(int[] nums) {
        int longest=0;
        for(int i = 0; i <= longest; i++) {
            longest = Math.max(longest,i+nums[i]);
            if(longest >= nums.length-1){
                return true;
            }
        }
        return false;
    }
}