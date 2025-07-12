class Solution {
    public String reverseWords(String s) {
        String[] result = s.split("\\s+");
        StringBuilder sb = new StringBuilder();

        for(int i=result.length-1;i>=0;i--){
            sb.append(result[i]);
            sb.append(" ");
        }
        return sb.toString().trim();   
    }
}