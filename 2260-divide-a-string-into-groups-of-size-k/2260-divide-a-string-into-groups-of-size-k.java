class Solution {
    public String[] divideString(String s, int k, char fill) {
        int n = s.length()/k;
        if (s.length() % k != 0) {
            n++;
        }

        String arr[] = new String[n];
        int j=0;

        while(j<n){
            int start = j*k;
            String substr = s.substring(start, Math.min(start + k, s.length()));

            while(substr.length() != k){
                substr = substr.concat(Character.toString(fill));
            }
            arr[j] = substr;
            j++;
        }
        return arr;
    }
}