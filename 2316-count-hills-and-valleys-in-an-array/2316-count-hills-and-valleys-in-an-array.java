class Solution {
    public int countHillValley(int[] nums) {
        int count = 0;
        for(int i=1;i<nums.length-1;i++){
            if(nums[i] == nums[i-1]) continue;

            int prev = i-1;
            while(prev >= 0 && nums[prev] == nums[i]){
                prev--;
            }

            int next = i+1;
            while(next < nums.length && nums[next] == nums[i]){
                next++;
            }

            if(prev >=0 && next < nums.length){
                if(nums[i] > nums[prev] && nums[i] > nums[next]) count++;
                if(nums[i] < nums[prev] && nums[i] < nums[next]) count++;
            }
        }
        return count;
    }
}

// class Solution {
//     public int countHillValley(int[] nums) {
//         ArrayList<Integer> list = new ArrayList<>();
//         list.add(nums[0]);
//         for(int i=1;i<nums.length;i++){
//             if(nums[i] != nums[i-1]){
//                 list.add(nums[i]);
//             }
//         }

//         int count = 0;
//         for(int i=1;i<list.size()-1;i++){
//             if(list.get(i) > list.get(i-1) && list.get(i) > list.get(i+1)){
//                 count++;
//             }
//             if(list.get(i) < list.get(i-1) && list.get(i) < list.get(i+1)){
//                 count++;
//             }
//         }
//         return count;
//     }
// }