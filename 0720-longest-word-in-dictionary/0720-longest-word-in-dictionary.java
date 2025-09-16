class Solution {
    static class Node{
        Node[] children = new Node[26];
        boolean eow = false;
    }

    private Node root = new Node();
    private String result = "";

    public void insert(String word){
        Node curr = root;
        for (char c : word.toCharArray()) {
            int idx = c - 'a';
            if (curr.children[idx] == null) {
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
        }
        curr.eow = true;
    }
    
    private void dfs(Node node, StringBuilder path){
        if(node == null) return;

        if(path.length() > result.length() || 
          (path.length() == result.length() && path.toString().compareTo(result) < 0)){
            result = path.toString();
        }
        for(int i=0;i<26;i++){
            if(node.children[i] != null && node.children[i].eow){
                path.append((char)(i+'a'));
                dfs(node.children[i], path);
                path.deleteCharAt(path.length()-1);
            }
        }
    }

    public String longestWord(String[] words) {
        for(String word: words){
            insert(word);
        }
        dfs(root, new StringBuilder());
        return result;
    }
}