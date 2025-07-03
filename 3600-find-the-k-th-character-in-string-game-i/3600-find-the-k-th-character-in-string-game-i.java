class Solution {
    public char kthCharacter(int k) {
        String word = "a";
        while(word.length()<k){
            String current= word;
            String nextPart = "";
            for(int i=0;i<current.length();i++){
                char ch = current.charAt(i);
                ch++;
                nextPart += ch;
            }
            word += nextPart;
        }
        return word.charAt(k-1);
    }
}