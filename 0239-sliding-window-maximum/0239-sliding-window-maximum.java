class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> dq = new LinkedList<Integer>();
        int n = nums.length;
        int i;

        int[] res = new int[n-k+1];
        int index = 0;

        for(i=0;i<k;++i){
            while(!dq.isEmpty() && nums[i]>=nums[dq.peekLast()]){
                dq.removeLast();
            }
            dq.addLast(i);
        }
        
        for(;i<n;++i){
            res[index++] = nums[dq.peek()];

            while((!dq.isEmpty()) && dq.peek() < (i-k+1)){
                dq.removeFirst();
            }
            while((!dq.isEmpty()) && nums[i] > nums[dq.peekLast()]){
                dq.removeLast();
            }
            dq.addLast(i);
        }
        res[index] = nums[dq.peek()];
        return res;
    }
}