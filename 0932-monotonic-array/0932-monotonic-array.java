class Solution {
    public boolean isMonotonic(int[] nums) {
        int prev1 = nums[0];
        boolean flag1 = true;

        // checking monotonic increasing 
        for(int i=0;i<nums.length;i++){
            if(nums[i]<prev1){
                flag1 = false;
                break;
            } else {
                prev1 = nums[i];
            }
        }

        int prev2 = nums[0];
        boolean flag2 = true;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>prev2){
                flag2 = false;
                break;
            } else {
                prev2 = nums[i];
            }
        }
        return flag1 || flag2;
    }
}