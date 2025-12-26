class Solution {
    public void getCombinationSum(int k, int n , List<List<Integer>> ans, List<Integer> list, int idx){
        if (n < 0 || list.size() > k) {
            return;
        }
        if(n == 0 && list.size() == k){
            ans.add(new ArrayList<>(list));
            return;
        }
        for(int i=idx;i<=9;i++){
            list.add(i);
            getCombinationSum(k,n-i,ans,list,i+1);
            list.remove(list.size()-1);
        }
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        getCombinationSum(k,n,ans, list,1);
        return ans;
    }
}