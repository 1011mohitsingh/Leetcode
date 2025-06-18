class Solution {
    public String simplifyPath(String path) {
        Stack<String> st = new Stack<>();
        String arr[] = path.split("/");

        for(int i=0;i<arr.length;i++){
            String curr=arr[i];

            if(curr.equals("..") && st.isEmpty()==false)
            {
                st.pop();
            }
            else if(curr !=" " && curr.equals(".") == false && curr.equals("..")==false && curr != ""){
                st.push(curr);
            }
        }
        if(st.size()== 0){
            return "/";
        }
        Stack<String> rev = new Stack<>();
        while(st.size()>0){
            rev.push(st.pop());
        }

        StringBuilder ans = new StringBuilder();
        while(rev.isEmpty()==false){
            ans.append("/");
            ans.append(rev.pop());
        }
        return ans.toString();
    }
}