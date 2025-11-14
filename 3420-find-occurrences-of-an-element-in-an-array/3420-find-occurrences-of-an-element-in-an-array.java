class Solution {
    public int[] occurrencesOfElement(int[] nums, int[] queries, int x) {
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i] == x){
                count++;
                map.put(count,i);
            }
        }
        int index = 0;
        for(int query:queries){
            if(map.containsKey(query)){
                queries[index++] = map.get(query);
            } else {
                queries[index++] =-1;
            }
        }
        return queries;
    }
}