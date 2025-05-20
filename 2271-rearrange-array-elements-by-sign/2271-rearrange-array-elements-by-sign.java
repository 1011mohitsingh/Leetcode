class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        ArrayList<Integer> PList = new ArrayList<>();
        ArrayList<Integer> NList = new ArrayList<>();
        int[] result = new int[n];

        for(int i=0;i<n;i++){
            if(nums[i]>0){
                PList.add(nums[i]);
            } else {
                NList.add(nums[i]);
            }
        }

        for(int i=0;i<n/2;i++){
            result[2*i] = PList.get(i);
            result[2*i+1] = NList.get(i);
        }
        return result;
    }
}