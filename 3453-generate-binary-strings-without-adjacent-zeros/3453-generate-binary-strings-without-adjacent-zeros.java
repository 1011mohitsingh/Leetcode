class Solution {
    public List<String> validStrings(int n) {
        ArrayList<String> result = new ArrayList<>();
        generate(n,"",result);
        return result;
    }

    public void generate(int n, String current, List<String> result){
        if(n == 0){
            result.add(current);
            return;
        }
        if(current.isEmpty() || current.charAt(current.length()-1) != '0'){
            generate(n-1, current+"0",result);
        }
        generate(n-1,current+"1",result);
    }
}