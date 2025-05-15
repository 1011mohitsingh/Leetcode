class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int i=0;
        
        if(nums[0] != 0){
            return 0;
        }

        while(i<nums.length-1){
            if (nums[i+1]-nums[i] != 1){
                return nums[i]+1;
            }
            i++;
        }
        return nums[i]+1;
    }
}