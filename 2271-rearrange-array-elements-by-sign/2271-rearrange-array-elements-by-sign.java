class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        ArrayList<Integer> PList = new ArrayList<>();
        ArrayList<Integer> NList = new ArrayList<>();
        ArrayList<Integer> RList = new ArrayList<>();


        for(int i=0;i<n;i++){
            if(nums[i]>0){
                PList.add(nums[i]);
            } else {
                NList.add(nums[i]);
            }
        }

        for(int i=0;i<PList.size();i++){
            RList.add(PList.get(i));
            RList.add(NList.get(i));
        }

        int[] result = new int[n];
        for(int i=0;i<n;i++){
            result[i] = RList.get(i);
        }
    
        return result;
    }
}