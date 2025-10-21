class Solution {
    public int minOperations(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        for(int num:nums){
            if(num<k){
                return -1;
            } else {
                set.add(num);
            }
        }
        if(!set.contains(k)){
            return set.size();
        }
        return set.size()-1;
    }
}