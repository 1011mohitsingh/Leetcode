class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        PriorityQueue<int[]> pq1 = new PriorityQueue<>((a,b) -> (a[0]-b[0]));

        for(int i=0;i<nums.length;i++){
            pq1.add(new int[]{nums[i],i});
            if(pq1.size()>k){
                pq1.poll();
            }
        }

        PriorityQueue<int[]> pq2 = new PriorityQueue<>((a,b) -> (a[1]-b[1]));
        while(!pq1.isEmpty()){
            pq2.add(pq1.poll());
        }

        int[] ans = new int[k];
        int idx = 0;

        while(!pq2.isEmpty()){
            int[] val = pq2.poll();
            ans[idx++] = val[0];
        }

        return ans;
    }
}