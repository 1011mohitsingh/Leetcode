class Solution {
    public int countTriples(int n) {
        int count = 0;
        for(int i=1;i<=n;i++){
            for(int j=i+1;j<=n;j++){
                long sum = 1L * i * i + 1L * j * j;
                int c = (int)Math.sqrt(sum);
                if ((long) c * c == sum && c <= n ) {
                    count+= 2;
                }
            }
        }
        return count; 
    }
}