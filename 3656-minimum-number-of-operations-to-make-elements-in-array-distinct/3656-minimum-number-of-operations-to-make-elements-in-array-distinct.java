class Solution {
    public boolean checkDistinct(ArrayList<Integer> nums){
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<nums.size();i++){
            if(set.contains(nums.get(i))){
                return false;
            } else {
                set.add(nums.get(i));
            }
        }
        return true;
    }
    public int minimumOperations(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int num:nums){
            list.add(num);
        }
        if(checkDistinct(list) == true){
            return 0;
        }
        int count = 0;
        while(list.size() > 2){
            for(int i=0;i<3 && !list.isEmpty();i++){
                list.remove(0);
            }
            count++;
            if(checkDistinct(list)){
                break;
            }
        }
        if(!checkDistinct(list) && !list.isEmpty()){
            count++;
        }
        return count;
    }
}