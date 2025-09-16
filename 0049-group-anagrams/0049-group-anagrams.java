class Solution {
    static class Node {
        Node[] children;
        boolean isEnd;
        List<String> anagramList;

        Node() {
            children = new Node[26];
            isEnd = false;
            anagramList = new ArrayList<>();
        }
    }

    private void insert(Node root, String word) {
        Node curr = root;
        char[] arr = word.toCharArray();
        Arrays.sort(arr); 

        for (char c : arr) {
            int idx = c - 'a';
            if (curr.children[idx] == null) {
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
        }
        curr.isEnd = true;
        curr.anagramList.add(word);
    }

    private void collect(Node root, List<List<String>> ans) {
        if (root.isEnd) {
            ans.add(root.anagramList);
        }
        for (int i = 0; i < 26; i++) {
            if (root.children[i] != null) {
                collect(root.children[i], ans);
            }
        }
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        Node root = new Node();
        for (String word : strs) {
            insert(root, word);
        }
        List<List<String>> ans = new ArrayList<>();
        collect(root, ans);
        return ans;
    }
}

// class Solution {
//     public List<List<String>> groupAnagrams(String[] strs) {
//         HashMap<String , List<String>> map = new HashMap<>();

//         for(String word: strs){
//             char[] chars = word.toCharArray();
//             Arrays.sort(chars);
//             String sorted = new String(chars);

//             if(!map.containsKey(sorted)){
//                 map.put(sorted, new ArrayList<>());
//             }
//             map.get(sorted).add(word);
//         }
//         return new ArrayList<>(map.values());
//     }
// }