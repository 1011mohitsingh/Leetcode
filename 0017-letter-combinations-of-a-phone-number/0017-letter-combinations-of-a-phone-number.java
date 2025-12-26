class Solution {
    public void createCombinations(List<String> list, HashMap<Integer, String> map, String digits, int idx, StringBuilder sb){
        if(idx == digits.length()){
            list.add(sb.toString());
            return;
        }
        String str = map.get(digits.charAt(idx)-'0');
        for(int i=0;i<str.length();i++){
            sb.append(str.charAt(i));
            createCombinations(list,map,digits,idx+1, sb);
            sb.deleteCharAt(sb.length()-1);
        }
    }
    public List<String> letterCombinations(String digits) {
        HashMap<Integer,String> map = new HashMap<>();
        char ch = 'a';
        for(int i=2;i<=9;i++){
            String str = "";
            int lettersCount = 3;
            if(i == 7 || i == 9){
                lettersCount = 4;
            }
            int count = 0;
            while(count < lettersCount){
                str = str+ch;
                ch++;
                count++;
            }
            map.put(i,str);
        }
        List<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        createCombinations(list,map,digits,0,sb);
        return list;
    }
}