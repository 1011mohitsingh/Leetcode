class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(arr);

        int minAbsoluteDiff = Integer.MAX_VALUE;
        for (int i = 1; i < arr.length; i++) {
            minAbsoluteDiff = Math.min(minAbsoluteDiff, arr[i] - arr[i - 1]);
        }

        for(int i=1;i<arr.length;i++){
            
            if(arr[i] - arr[i - 1] == minAbsoluteDiff){
                List<Integer> nestedList = new ArrayList<>();
                nestedList.add(arr[i-1]);
                nestedList.add(arr[i]);
                list.add(nestedList);
            }
        }
        return list;
    }
}