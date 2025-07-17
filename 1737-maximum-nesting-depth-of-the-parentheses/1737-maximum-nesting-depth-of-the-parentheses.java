class Solution {
    public int maxDepth(String s) {
        int count = 0;
        int maxCount = 0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == '('){
                count++;
                if(count > maxCount){
                    maxCount = count;
                }
            } else if (ch == ')'){
                count--;
            }
        }
        return maxCount;
    }
}

// class Solution {
//     public int maxDepth(String s) {
//         Stack<Character> st = new Stack<>();
//         int count = 0;
//         int maxCount = 0;
//         for(int i=0;i<s.length();i++){
//             char ch = s.charAt(i);

//             if(ch == '('){
//                 st.push(ch);
//                 count++;
//                 maxCount = Math.max(maxCount, count);
//             } else if (ch == ')' && !st.isEmpty() && st.peek() == '('){
//                 st.pop();
//                 count--;
//             }
//         }
//         return maxCount;
//     }
// }