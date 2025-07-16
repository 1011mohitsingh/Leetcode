class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != s.length()){
            return false;
        }

        Map<Character, Character> table = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char original = s.charAt(i);
            char replacement = t.charAt(i);

            if(!table.containsKey(original)){
                if(!table.containsValue(replacement)){
                    table.put(original, replacement);
                }else {
                    return false;
                }
            } else {
                char mappedCharacter = table.get(original);
                if(mappedCharacter != replacement){
                    return false;
                }
            }
        }
        return true;
    }
}