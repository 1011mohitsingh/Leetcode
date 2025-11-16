class Solution {
    public long countSubstrings(String s, char c) {
        int cFreq = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == c){
                cFreq++;
            }
        }
        return (long) cFreq*(cFreq+1)/2;
    }
}