class Solution {
    public int getLucky(String s, int k) {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            sb.append((s.charAt(i)-'a'+1));
        }
        String newStr = sb.toString();
        int sum = 0;
        while(k-->0){
            sum = 0;
            for(char ch: newStr.toCharArray()){
                sum += ch-'0';
            }
            newStr = String.valueOf(sum);
        }
        return sum;
    }
}