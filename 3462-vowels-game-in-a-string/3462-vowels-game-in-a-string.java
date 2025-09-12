class Solution {
    public boolean doesAliceWin(String s) {
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                return true;
            }
        }
        return false;
    }
}

// class Solution {
//     private boolean checkVowel(char ch){
//         return (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u');
//     }
//     private int countVowel(String s){
//         int count = 0;
//         for(int i=0;i<s.length();i++){
//             if(checkVowel(s.charAt(i))){
//                 count++;
//             }
//         }
//         return count;
//     }
//     public boolean doesAliceWin(String s) {
//         int totalVowels = countVowel(s);
//         if(totalVowels == 0){
//             return false;
//         }
//         return true;
//     }
// }