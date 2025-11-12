class Solution {
    private int gcd(int a, int b){
        while(b!= 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public int minOperations(int[] nums) {
        int n = nums.length;
        int overallGcd = nums[0];
        for(int i=1;i<n;i++){
            overallGcd = gcd(overallGcd, nums[i]);
        }
        if(overallGcd > 1){
            return -1;
        }
        int countOnes = 0;
        for(int num:nums){
            if(num == 1) countOnes++;
        }
        if(countOnes > 0){
            return n-countOnes;
        }

        int minLen = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            int g = nums[i];
            for(int j=i;j<n;j++){
                g = gcd(g, nums[j]);
                if(g == 1){
                    minLen = Math.min(minLen, j-i+1);
                    break;
                }
            }  
        }
        return (minLen - 1) + (n - 1);
    }
}