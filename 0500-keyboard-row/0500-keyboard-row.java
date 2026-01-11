class Solution {
    public String[] findWords(String[] words) {
        ArrayList<String> list = new ArrayList<>();
        String keyWord[] = {"qwertyuiopQWERTYUIOP", "asdfghjklASDFGHJKL","zxcvbnmZXCVBNM"};
        for(int i=0;i<words.length;i++){
            int row = 0;
            if(keyWord[1].contains(String.valueOf(words[i].charAt(0)))){
                row =1;
            }else if(keyWord[2].contains(String.valueOf(words[i].charAt(0)))){
                row =2;
            }
            boolean flag = true;
            for(int j=0;j<words[i].length();j++){
                if(!keyWord[row].contains(String.valueOf(words[i].charAt(j)))){
                    flag = false;
                    break;
                }
            }
            if(flag){
                list.add(words[i]);
            }
        }
        return list.toArray(new String[0]);
    }
}