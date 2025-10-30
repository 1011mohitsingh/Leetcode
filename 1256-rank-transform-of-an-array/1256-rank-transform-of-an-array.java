class Solution {
    public int[] arrayRankTransform(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] temp = arr.clone();
        Arrays.sort(temp);
        int rank = 0;
        for(int i=0;i<temp.length;i++){
            if(!map.containsKey(temp[i])){
                map.put(temp[i],rank);
                rank++;
            }
        }
        for(int i=0;i<arr.length;i++){
            arr[i] = map.get(arr[i])+1;
        }
        return arr;
    }
}