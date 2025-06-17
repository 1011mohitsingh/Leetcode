class Solution {
    public String decodeString(String s) {
        Stack<Character> st = new Stack<>();

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);

            if(ch != ']'){
                st.push(ch);
            } else {
                StringBuilder sb = new StringBuilder();
                while(st.size()>0 && st.peek() != '['){
                    sb.insert(0,st.pop());
                }

                String toRepeat = sb.toString();
                st.pop();

                sb = new StringBuilder();
                while(st.size()>0 && st.peek()>='0' && st.peek()<='9'){
                    sb.insert(0,st.pop());
                }

                int count = Integer.parseInt(sb.toString());
                while(count > 0){
                    for(char c:toRepeat.toCharArray()){
                        st.push(c);
                    }
                    count--;
                }
            }
        }

        StringBuilder ans = new StringBuilder();
        while(st.size()>0){
            ans.insert(0,st.pop());
        }
        return ans.toString();
    }
}