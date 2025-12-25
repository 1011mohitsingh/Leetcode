class Solution {
    Set<Integer> set = new HashSet<>();
    public void subsetGeneration(int nums[], List<List<Integer>> ans, List<Integer> list , int index){
        ans.add(new ArrayList<>(list));
        for(int i = index;i<nums.length;i++){
            if(i > index && nums[i] == nums[i-1]){
                continue;
            }
            list.add(nums[i]);
            subsetGeneration(nums, ans, list, i+1);
            list.remove(list.size()-1);
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        subsetGeneration(nums, ans, list, 0);
        return ans;
    }
}
