class Solution {
    public char kthCharacter(long k, int[] operations) {
        int n = operations.length;
        long len[] = new long[n + 1];
        len[0] = 1;

        int idx = 0;
        for(int i = 1; i <=n; i++) {
            len[i] = len[i - 1] * 2;
            idx = i;
            if(len[i] > k) break;
        }

        int shift = 0;

        for(int i = idx; i >= 0 ; i--) {
            if(k > len[i]) {
                k = k - len[i];
                if(operations[i] == 1) {
                    shift += 1;
                }
            }

            if(k == 1) break;
        }

        return (char) ((shift % 26) + 'a');
    }
}


// // This approach will not work for all test cases as it will give TLE but for the reference and understanding i am keeping here. 756/901 passed
// class Solution {
//     public char kthCharacter(long k, int[] operations) {
//         StringBuilder word = new StringBuilder("a");

//         for(int j=0;j<operations.length;j++){
//             if(word.length() >= k) break;

//             String current=word.toString();;
//             if(operations[j] == 1){
//                 StringBuilder nextPart = new StringBuilder();
//                 for(int i=0;i<current.length();i++){
//                     char ch = current.charAt(i);
//                     ch++;
//                     nextPart.append(ch);
//                 }
//                 word.append(nextPart);
//             }else{
//                 word.append(current);
//             }
//         }
//         return word.charAt((int)k-1);
//     }
// }