class Solution {
    public int countPartitions(int[] nums) {
        int prefixSum[] = new int[nums.length];
        int idx = 0, sum = 0, count = 0;
        for(int num : nums){
            sum += num;
            prefixSum[idx++] = sum;
        }
        for(int i=0;i<prefixSum.length-1;i++){
            int rightValue = sum - prefixSum[i];
            if((rightValue - prefixSum[i]) % 2 == 0){
                count++;
            }
        }
        return count;
    }
}