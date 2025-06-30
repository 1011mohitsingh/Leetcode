class Solution{
    public int findLHS(int[] nums){
        int result = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i:nums){
            map.put(i, map.getOrDefault(i,0)+1);
        }
        for(int i:map.keySet()){
            if(map.containsKey(i+1)){
                result = Math.max(result, map.get(i)+map.get(i+1));
            }
        }
        return result;
    }
}

// class Solution {
//     public int findLHS(int[] nums) {
//         int maxLen = 0;
//         for (int i = 0; i < nums.length; i++) {
//             int count = 0;
//             boolean hasPlusOne = false;
            
//             for (int j = 0; j < nums.length; j++) {
//                 if (nums[j] == nums[i]) {
//                     count++;
//                 } else if (nums[j] == nums[i] + 1) {
//                     count++;
//                     hasPlusOne = true;
//                 }
//             }
//             if (hasPlusOne) {
//                 maxLen = Math.max(maxLen, count);
//             }
//         }

//         return maxLen;
//     }
// }
