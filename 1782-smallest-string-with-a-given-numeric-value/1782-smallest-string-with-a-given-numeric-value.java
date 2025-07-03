class Solution {
    public String getSmallestString(int n, int k) {
        char[] str = new char[n];

        for(int i=0;i<n;i++){
            str[i] = 'a';
        }
        k = k-n;

        for(int i=n-1;i>=0;i--){
            if(k>25){
                str[i] = 'z';
                k -= 25;
            } else {
                str[i] = (char)(str[i]+k);
                k = 0;
            }
        }
        return String.valueOf(str);
    }
}