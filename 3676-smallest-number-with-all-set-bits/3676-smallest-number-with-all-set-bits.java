class Solution {
    public int smallestNumber(int n) {
        for(int i=0;i<1000;i++){
            int a = (int)Math.pow(2,i);
            if(a > n){
                return a-1;
            }
        }
        return -1;
    }
}