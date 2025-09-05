class Solution {
    public int[] frequencySort(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int num:nums){
            map.put(num, map.getOrDefault(num,0)+1);
        }

        List<Integer> list = new ArrayList<>();
        for(int num : nums) list.add(num);

        Collections.sort(list, (a,b) ->{
            int freqA = map.get(a), freqB = map.get(b);
            if(freqA == freqB){
                return b-a;
            }
            return freqA - freqB;
        });

        int result[] = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            result[i] = list.get(i);
        }
        return result;
    }
}