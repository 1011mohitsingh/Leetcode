class Solution {
    public int halveArray(int[] nums) {
        double sum = 0;
        PriorityQueue<Double> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int i=0;i<nums.length;i++){
            sum += nums[i];
            pq.add((double)nums[i]);
        }

        double desiredSum = sum/2;
        double currentSum = sum;
        int moves = 0;

        while(currentSum > desiredSum){
            double maxEle = pq.remove();
            currentSum -= maxEle;

            pq.add(maxEle/2.0);
            currentSum += (maxEle/2.0);
            moves++;
        }
        return moves;
    }
} 