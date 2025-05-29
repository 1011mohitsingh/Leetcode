// complexity : O(nlogn) using HashMap
class Solution {
    public List<Integer> findLonely(int[] nums) {
        List<Integer> arrayList = new ArrayList<Integer>();
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();

        for(int n: nums){
            if (hashMap.get(n) == null){
                hashMap.put(n,1);
            } else {
                hashMap.put(n, (int)hashMap.get(n)+1);
            }
        }

        for(Map.Entry entry : hashMap.entrySet()) {
            if((int)entry.getValue() ==1){
                int t = (int)entry.getKey() - 1;
                int q = (int)entry.getKey() + 1;

                if(hashMap.get(t) == null && hashMap.get(q) == null){
                    arrayList.add((int)entry.getKey());
                }
            }
        }

        return arrayList;
    }
}


// complexity O(nlogn)
// class Solution {
//     public List<Integer> findLonely(int[] nums) {
//         Arrays.sort(nums);
//         ArrayList<Integer> list = new ArrayList<>();
        
//         for (int i = 1; i < nums.length - 1; i++) {
//             if (nums[i - 1] + 1 < nums[i] && nums[i] + 1 < nums[i + 1]) {
//                 list.add(nums[i]);
//             }
//         }

//         if (nums.length == 1) {
//             list.add(nums[0]);
//         }

//         if (nums.length > 1) {
//             if (nums[0] + 1 < nums[1]) {
//                 list.add(nums[0]);
//             }
//             if (nums[nums.length - 2] + 1 < nums[nums.length - 1]) {
//                 list.add(nums[nums.length - 1]);
//             }
//         }

//         return list;
//     }
// }
