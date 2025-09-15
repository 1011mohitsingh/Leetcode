class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String arr[] = text.split(" ");
        int count = 0;
        for(int i=0;i<arr.length;i++){
            boolean valid = true;
            for(int k=0;k<brokenLetters.length();k++){
                if(arr[i].contains(brokenLetters.charAt(k)+"")){
                    valid = false;
                    break;
                }
            }
            if(valid){
                count++;
            }
        }
        return count;
    }
}

// class Solution {
//     public int canBeTypedWords(String text, String brokenLetters) {
//         String arr[] = text.split(" ");
//         int count = 0;
//         HashSet<Character> set = new HashSet<>();
//         for(int i=0;i<arr.length;i++){
//             for(int j=0;j<arr[i].length();j++){
//                 set.add(arr[i].charAt(j));
//             }
//             boolean valid = true;
//             for(int k=0;k<brokenLetters.length();k++){
//                 if(set.contains(brokenLetters.charAt(k))){
//                     valid = false;
//                     break;
//                 }
//             }
//             if(valid){
//                 count++;
//             }
//             set.clear();
//         }
//         return count;
//     }
// }