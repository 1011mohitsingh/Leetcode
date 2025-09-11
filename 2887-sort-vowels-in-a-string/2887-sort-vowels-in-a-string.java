class Solution {
    private boolean isVowel(char c){
        if(c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' || c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ){
            return true;
        }
        return false;
    }
    public String sortVowels(String s) {
        ArrayList<Character> list = new ArrayList<>();
        for(char ch:s.toCharArray()){
            if(isVowel(ch)){
                list.add(ch);
            }
        }
        Collections.sort(list);
        char result[] = s.toCharArray();
        int idx = 0;
        for(int i=0;i<result.length;i++){
            if(isVowel(result[i])){
                result[i] = list.get(idx);
                idx++;
            }
        }
        return new String(result);
    }
}

// class Solution {
//     private boolean isVowel(char c){
//         if(c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' || c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ){
//             return true;
//         }
//         return false;
//     }
//     public String sortVowels(String s) {
//         ArrayList<Character> list = new ArrayList<>();
//         StringBuilder sb = new StringBuilder();
//         for(char ch:s.toCharArray()){
//             if(isVowel(ch)){
//                 list.add(ch);
//             }
//         }

//         Collections.sort(list);
//         int idx = 0;
//         for(int i=0;i<s.length();i++){
//             char ch = s.charAt(i);
//             if(!isVowel(ch)){
//                 sb.append(ch);
//             } else {
//                 sb.append(list.get(idx));
//                 idx++;
//             }
//         }
//         return sb.toString();
//     }
// }