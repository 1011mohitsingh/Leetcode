class Solution{
    public int firstUniqChar(String s){
        int[] charfreq = new int[26];

        for(int i=0;i<s.length();i++){
            int index = s.charAt(i)-'a';
            charfreq[index]++;
        }

        for(int i=0;i<s.length();i++){
            int index = s.charAt(i)-'a';
            if(charfreq[index] == 1){
                return i;
            }
        }
        return -1;
    }
}

// class Solution {
//     public int firstUniqChar(String s) {
//         Map<Character, Integer> freqMap = new HashMap<>();

//         for(char c : s.toCharArray()){
//             freqMap.put(c, freqMap.getOrDefault(c,0)+1);
//         }

//         for(int i=0;i<s.length();i++){
//             if(freqMap.get(s.charAt(i)) == 1){
//                 return i;
//             }
//         }
//         return -1;
//     }
// }