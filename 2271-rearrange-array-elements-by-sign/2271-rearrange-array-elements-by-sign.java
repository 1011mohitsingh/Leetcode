class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        // this is solved using the array list with complexity O(n)

        // ArrayList<Integer> PList = new ArrayList<>();
        // ArrayList<Integer> NList = new ArrayList<>();
        // int[] result = new int[n];

        // for(int i=0;i<n;i++){
        //     if(nums[i]>0){
        //         PList.add(nums[i]);
        //     } else {
        //         NList.add(nums[i]);
        //     }
        // }

        // for(int i=0;i<n/2;i++){
        //     result[2*i] = PList.get(i);
        //     result[2*i+1] = NList.get(i);
        // }
        // return result;


        int P_idx = 0;
        int N_idx = 0;
        int R_idx = 0;

        int[] PArray = new int[n/2];
        int[] NArray = new int[n/2];
        int[] RArray = new int[n];

        for(int i=0;i<n;i++){
            if(nums[i] >0 ){
                PArray[P_idx++] = nums[i];
            } 
            else {
                NArray[N_idx++] = nums[i];
            }
        }

        for(int i=0;i<n/2;i++){
            if(i<PArray.length){
                RArray[R_idx++] = PArray[i];
            }
            if(i<NArray.length){
                RArray[R_idx++] = NArray[i];
            }
            
        }
        return RArray;
    }
}