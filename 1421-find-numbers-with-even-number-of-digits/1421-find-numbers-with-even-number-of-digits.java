class Solution {
    public int findNumbers(int[] nums) {
        int count = 0, digitCount = 0;
        for(int i=0;i<nums.length;i++){
            while(nums[i] > 0){
                nums[i] /= 10;
                digitCount++;
            }
            if(digitCount % 2 == 0){
                count++;
            }
            digitCount = 0;
        }
        return count;
    }
}