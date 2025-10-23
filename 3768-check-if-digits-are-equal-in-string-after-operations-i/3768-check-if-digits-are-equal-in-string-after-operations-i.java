class Solution {
    public String afterOperations(String s){
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length()-1;i++){
            int sum =(s.charAt(i)-'0'+s.charAt(i+1)-'0')%10;
            sb.append((char)(sum+'0'));
        }
        return sb.toString();
    }
    public boolean hasSameDigits(String s) {
        while(s.length() > 2){
            s = afterOperations(s);
        }
        return s.charAt(0) == s.charAt(1);
    }
}