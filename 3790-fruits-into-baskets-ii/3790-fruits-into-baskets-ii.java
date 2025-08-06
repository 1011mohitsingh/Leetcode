class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int count = 0;
        boolean[] used = new boolean[baskets.length];
        for(int i=0;i<fruits.length;i++){
            for(int j=0;j<baskets.length;j++){
                if(!used[j] && baskets[j] >= fruits[i]){
                    used[j] = true;
                    count++;
                    break;
                }
            }
        }
        return (fruits.length-count);
    }
}