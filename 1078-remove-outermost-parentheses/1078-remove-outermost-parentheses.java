class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder result = new StringBuilder();

        for(char ch:s.toCharArray()){
            if(ch == '('){
                if(!stack.isEmpty()){
                    result.append(ch);
                }
                stack.push(ch);
            } else if (ch == ')'){
                stack.pop();
                if(!stack.isEmpty()){
                    result.append(ch);
                }
            }
        }
        return result.toString();
    }
}

// class Solution {
//     public String removeOuterParentheses(String s) {
//         Stack<Character> c = new Stack<>();
//         String ans = "";
//         int depth = 0;
//         for (int i = 0; i < s.length(); i++) {
//             char ch = s.charAt(i);

//             if(ch == '('){
//                 if(depth > 0){
//                     ans+=ch;
//                 }
//                 depth++;
//             }else if (ch == ')'){
//                 depth--;
//                 if(depth > 0){
//                     ans+=ch;
//                 }
//             }
//         }
//         return ans;
//     }
// }
