class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        generateSubsets(nums,0,list,temp);
        return list;
    }
    public void generateSubsets(int[] nums,int start, List<List<Integer>> list, List<Integer> temp){
        list.add(new ArrayList<>(temp));
        for(int i=start;i<nums.length;i++){
            temp.add(nums[i]);
            generateSubsets(nums, i+1, list, temp);
            temp.remove(temp.size()-1);
        }
    }
}