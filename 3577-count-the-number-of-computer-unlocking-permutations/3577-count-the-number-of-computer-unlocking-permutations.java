class Solution {
    static long MOD = 1_000_000_007L;
    static long factorial(int n){
        long f = 1;
        for(int i=2;i<=n;i++){
            f = (f*i) % MOD;
        }
        return f;
    }
    public int countPermutations(int[] complexity) {   
        for(int i=1;i<complexity.length;i++){
            if(complexity[0] >= complexity[i]){
                return 0;
            }
        }     
        return (int)factorial(complexity.length-1);
    }
} 