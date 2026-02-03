class Solution {
    public boolean isTrionic(int[] nums) {
        if(nums.length < 4) return false;
        if(nums[0] >= nums[1]) return false;
        boolean flag = true;
        int count = 0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i] == nums[i+1]) return false;
            if(nums[i] > nums[i+1] && flag == true){
                flag = false;
                count++;
            } else if(nums[i]<nums[i+1] && flag == false){
                flag = true;
                count++;
            }
            if(count > 2) return false;
        }
        return count == 2 && flag == true;
    }
}