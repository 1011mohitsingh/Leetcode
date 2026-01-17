class Solution {
    public List<String> commonChars(String[] words) {
        ArrayList<String> list = new ArrayList<>();
        for(int i=0;i<words[0].length();i++){
            char ch = words[0].charAt(i);
            boolean flag = true;
            for(int j=1;j<words.length;j++){
                int idx = words[j].indexOf(ch);
                if(idx == -1){
                    flag = false;
                    break;
                }else {
                    words[j] = words[j].substring(0, idx) + words[j].substring(idx + 1);
                }
            }
            if(flag == true){
                list.add(String.valueOf(ch));
            }   
        }
        return list;
    }
}