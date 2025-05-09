class Solution{
    public List<List<Integer>> threeSum(int[] nums){
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        HashSet<List<Integer>> hashSet = new HashSet<List<Integer>>();

        for(int i=0;i<nums.length;i++){
            HashSet<Integer> innerHashSet = new HashSet<Integer>();
            for(int j=i+1;j<nums.length;j++){
                int k = -1*(nums[i]+nums[j]);
                if(innerHashSet.contains(k) == false){
                    innerHashSet.add(nums[j]);
                } else{
                    ArrayList<Integer> a = new ArrayList<Integer>();
                    a.add(nums[i]);
                    a.add(nums[j]);
                    a.add(k);
                    Collections.sort(a);
                    if(hashSet.contains(a) == false){
                        ans.add(a);

                        hashSet.add(a);
                    }
                }
            }
        }
        return ans;
    }
}