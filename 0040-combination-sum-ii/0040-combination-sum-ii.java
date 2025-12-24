class Solution {
    public void getCombinationsSum(int[] candidates, List<List<Integer>> ans, List<Integer> list, int target , int idx){
        if (target < 0) {
            return;
        }
        if(target == 0){
            ans.add(new ArrayList<>(list));
            return;
        }
        for(int i=idx;i<candidates.length;i++){
            if(i > idx && candidates[i] == candidates[i-1]){
                continue;
            }
            list.add(candidates[i]);
            getCombinationsSum(candidates, ans ,list, target-candidates[i] ,i+1);
            list.remove(list.size()-1);
        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        getCombinationsSum(candidates, ans, list,target, 0);
        return ans;
    }
}