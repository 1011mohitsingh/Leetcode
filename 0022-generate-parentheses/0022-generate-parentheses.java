class Solution {
    public void generate(int max, int open, int close, List<String> result, String temp){
        if(temp.length() == max*2){
            result.add(temp);
            return;
        }
        if(open < max){
            generate(max, open+1, close, result, temp+"(");
        }
        if(close < open){
            generate(max, open , close+1, result , temp+")");
        }
    }
    public List<String> generateParenthesis(int n) {
        ArrayList<String> list = new ArrayList();
        generate(n,0,0,list,"");
        return list;
    }
}