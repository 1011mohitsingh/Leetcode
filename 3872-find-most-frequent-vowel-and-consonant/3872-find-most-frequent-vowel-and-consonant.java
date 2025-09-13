class Solution {
    private boolean isVowel(char ch){
        return(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u');
    }
    public int maxFreqSum(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        int maxVowelFreq = 0;
        int maxConsFreq = 0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch,0)+1);
        }

        for(Character key:map.keySet()){
            if(isVowel(key)){
                maxVowelFreq = Math.max(map.get(key), maxVowelFreq);
            } else if(!isVowel(key)) {
                maxConsFreq = Math.max(map.get(key), maxConsFreq);
            }
        }
        return maxVowelFreq + maxConsFreq;
    }
}