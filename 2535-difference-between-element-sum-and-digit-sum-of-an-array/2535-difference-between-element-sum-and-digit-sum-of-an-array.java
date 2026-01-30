class Solution {
    public int sumDigit(int num){
        int sum = 0;
        while(num > 0){
            sum += num%10;
            num = num/10;
        }
        return sum;
    }
    public int differenceOfSum(int[] nums) {
        int elementSum = 0,digitSum = 0;
        for(int i=0;i<nums.length;i++){
            elementSum += nums[i];
            if(nums[i] > 9){
                digitSum += sumDigit(nums[i]);
            } else {
                digitSum += nums[i];
            }
        }
        return Math.abs(elementSum-digitSum);
    }
}