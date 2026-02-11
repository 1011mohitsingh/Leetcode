class Solution {
    public int longestBalanced(int[] nums) {
        int lengthLongest = 0;
        for(int i=0;i<nums.length;i++){
            HashMap<Integer, Integer> map = new HashMap<>();
            int distinctEven = 0 ,distinctOdd = 0;
            for(int j=i;j<nums.length;j++){
                int freq = map.getOrDefault(nums[j], 0);
                if(freq == 0){
                    if(nums[j] %2 == 0){
                        distinctEven++;
                    } else {
                        distinctOdd++;
                    }
                }
                map.put(nums[j], freq + 1);
                if(distinctEven == distinctOdd){
                    lengthLongest = Math.max(lengthLongest, (j-i+1));
                }
            }
        }
        return lengthLongest;
    }
}