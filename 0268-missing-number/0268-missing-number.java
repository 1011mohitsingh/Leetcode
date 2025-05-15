// brute force approach 
// class Solution {
//     public int missingNumber(int[] nums) {
//         Arrays.sort(nums);
//         int i=0;
//         if(nums[0] != 0){
//             return 0;
//         }
//         while(i<nums.length-1){
//             if (nums[i+1]-nums[i] != 1){
//                 return nums[i]+1;
//             }
//             i++;
//         }
//         return nums[i]+1;
//     }
// }

class Solution {
    public int missingNumber(int[] nums){
        int n = nums.length;
        int expectedSum = 0;
        int actualSum = 0;
        for(int i=0;i<=n;i++){
            expectedSum += i;
        }

        for(int i=0;i<n;i++){
            actualSum += nums[i];
        }   
        return expectedSum - actualSum;     
    }
}