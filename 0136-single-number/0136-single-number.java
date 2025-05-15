// most optimized approach 

// class Solution {
//     public int singleNumber(int[] nums) {
//         int UniqueNumber = 0;

//         for(int i=0;i<nums.length;i++){
//             UniqueNumber = UniqueNumber ^ nums[i];
//         }
//         return UniqueNumber;
//     }
// }



class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);

        if(nums[0] == nums.length ){
            return nums[0];
        }

        for(int i=0;i<nums.length-1;i+=2){
            if(nums[i+1] > nums[i]){
                return nums[i];
            }
        }
        return nums[nums.length-1];
    }
}

