class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();
        StringBuilder ans = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);

            if(st.isEmpty() == true){
                st.push(ch);
            } else {
                if(st.peek()==ch){
                    st.pop();
                }else {
                    st.push(ch);
                }
            }
        }

        while(st.isEmpty() == false){
            char ch=st.pop();
            ans.append(ch);
        }
        ans.reverse();
        return ans.toString();
    }
}