class KthLargest {
    PriorityQueue<Integer> pq = new PriorityQueue<>();
    int k;
    public KthLargest(int k, int[] nums) {
        for(int i=0;i<nums.length;i++){
            int e = nums[i];
            pq.add(e);

            if(pq.size()>k){
                pq.remove();
            }
        }
        this.k = k;
    }
    
    public int add(int val) {
        pq.add(val);

        if(pq.size()>k){
            pq.remove();
        }
        return pq.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */