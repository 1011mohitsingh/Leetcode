class Solution {
    public int sumFourDivisors(int[] nums) {
        int resultSum = 0;
        for(int idx=0;idx<nums.length;idx++){
            int count = 0, sum = 0, n=nums[idx];
            for(int i=1;i*i<=n;i++){
                if(n%i == 0){
                    count++;
                    sum += i;
                    if(i != n/i){
                        count++;
                        sum += (n/i);
                    }
                }
                if(count >4){
                    break;
                }
            }
            if(count == 4){
                resultSum += sum;
            }
        }
        return resultSum;
    }
}