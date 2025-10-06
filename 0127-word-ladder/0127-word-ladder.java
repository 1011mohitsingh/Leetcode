class Pair{
    String word;
    int step;
    public Pair(String word, int step){
        this.word = word;
        this.step = step;
    }
}
class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Queue<Pair> q = new LinkedList<>();
        Pair p = new Pair(beginWord,1);
        q.add(p);
        HashSet<String> set = new HashSet<>(wordList);
        set.remove(beginWord);

        while(!q.isEmpty()){
            Pair pp = q.remove();
            String curr = pp.word;
            int step = pp.step;

            if(curr.equals(endWord)){
                return step;
            }
            for(int i=0;i<curr.length();i++){
                char arr[] = curr.toCharArray();
                for(char ch = 'a' ; ch <= 'z' ;ch++){
                    arr[i] = ch;
                    String temp = new String(arr);
                    if(set.contains(temp)){
                        Pair x = new Pair(temp,step+1);
                        q.add(x);
                        set.remove(temp);
                    }
                }
            }
        }
        return 0;
    }
}