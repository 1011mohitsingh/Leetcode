class Solution {
    public int[] piTable(String pat){
        int n = pat.length();
        int[] pi = new int[n];

        int i=1, len = 0;
        while(i<n){
            if(pat.charAt(i) == pat.charAt(len)){
                len++;
                pi[i] = len;
                i++;
            } else {
                if(len != 0){
                    len = pi[len-1];
                } else {
                    pi[i] = 0;
                    i++;
                }
            }
        }
        return pi;
    }
    public String longestPrefix(String s) {
        int[] pi = piTable(s);
        int maxLen = pi[s.length()-1];
        return s.substring(0, maxLen);
    }
}