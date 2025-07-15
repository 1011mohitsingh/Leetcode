class Solution {
    public boolean isValid(String word) {
        if(word.length() < 3){
            return false;
        }
        
        int vowel = 0;
        int consonant = 0;

        for(int i=0;i<word.length();i++){
            char ch = word.charAt(i);

            if (!Character.isLetterOrDigit(ch)) {       
                return false;    
            } else if (Character.isLetter(ch)){
                ch = Character.toLowerCase(ch);
                if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                    vowel++;
                } else {
                    consonant++;
                }
            }
        }

        if(vowel > 0 && consonant > 0){
            return true;
        }
        return false;
    }
}