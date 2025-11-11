class Solution {
    public long totalCost(int[] costs, int k, int candidates) {
        PriorityQueue<Integer> leftHeap = new PriorityQueue<>();
        PriorityQueue<Integer> rightHeap = new PriorityQueue<>();
        long cost = 0;
        int leftIndex = 0, rightIndex = costs.length-1;
        for(int i=0; i<candidates && leftIndex <= rightIndex;i++){
            leftHeap.add(costs[leftIndex++]);
        }
        for (int i = 0; i < candidates && leftIndex <= rightIndex; i++) {
            rightHeap.add(costs[rightIndex--]);
        }
        for (int i = 0; i < k; i++) {
            int leftMin = leftHeap.isEmpty() ? Integer.MAX_VALUE : leftHeap.peek();
            int rightMin = rightHeap.isEmpty() ? Integer.MAX_VALUE : rightHeap.peek();

            if (leftMin <= rightMin) {
                cost += leftHeap.poll();
                if (leftIndex <= rightIndex) {
                    leftHeap.add(costs[leftIndex++]);
                }
            } else {
                cost += rightHeap.poll();
                if (leftIndex <= rightIndex) {
                    rightHeap.add(costs[rightIndex--]);
                }
            }
        }
        return cost;
    }
}