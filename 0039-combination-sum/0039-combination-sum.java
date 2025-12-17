class Solution {
    public void getAllCombination(int[] candidates, List<List<Integer>> ans, List<Integer> list,  int idx , int target){
        if(idx == candidates.length || target < 0){
            return;
        }
        if(target == 0){
            ans.add(new ArrayList<>(list));
            return;
        }
        list.add(candidates[idx]);
        getAllCombination(candidates, ans, list, idx, target - candidates[idx]);
        list.remove(list.size() - 1);
        getAllCombination(candidates, ans, list, idx+1, target);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        getAllCombination(candidates,ans,list, 0, target);
        return ans;
    }
    
}