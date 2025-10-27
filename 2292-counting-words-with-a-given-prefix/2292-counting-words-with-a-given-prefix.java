class Solution {
    public int prefixCount(String[] words, String pref) {
        int count = 0;
        // int n = pref.length();
        // for(int i=0;i<words.length;i++){
        //     if(words[i].contains(pref) && (words[i].substring(0,n).equals(pref))){
        //         count++;
        //     }
        // }
        for(int i=0;i<words.length;i++){
            if(words[i].startsWith(pref)){
                count++;
            }
        }
        return count;
    }
}