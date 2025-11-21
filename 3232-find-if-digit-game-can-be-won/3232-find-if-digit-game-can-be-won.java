class Solution {
    public boolean canAliceWin(int[] nums) {
        int sumOne = 0, sumTwo = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] >= 10){
                sumTwo += nums[i];
            }else {
                sumOne += nums[i];
            }
        }
        if(sumOne == sumTwo){
            return false;
        } 
        return true;
    }
}