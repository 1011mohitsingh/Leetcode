class Solution {
    public int maxSum(int[] nums) {
        Arrays.sort(nums);
        int prev = nums[nums.length-1];
        int sum = prev;
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i] <= 0){
                return sum;
            }
            else if(nums[i] != prev){
                sum += nums[i];
            }
            prev = nums[i];
        }
        return sum;
    }
}


// class Solution {
//     public int maxSum(int[] nums) {
//         HashSet<Integer> unique = new HashSet<>();
//         int sum = 0;
//         int maxEle = Integer.MIN_VALUE;
//         for(int i=0;i<nums.length;i++){
//             if(nums[i] > maxEle){
//                 maxEle = nums[i];
//             }
//             unique.add(nums[i]);
//         }
//         if(maxEle < 0){
//             return maxEle;
//         } else {
//             for(int x : unique){
//                 if(x > 0){
//                     sum += x;
//                 }
//             }
//             return sum;
//         }
//     }
// }