class Solution {
    public List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>> list = new ArrayList<>();
        int n = s.length();
        int start = 0;

        for(int i=1;i<=n;i++){
            if(i==n || s.charAt(i) != s.charAt(i-1)){
                if(i-start >= 3){
                    list.add(Arrays.asList(start, i-1));
                }
                start = i;
            }
        }
        return list;
    }
}



// class Solution {
//     public List<List<Integer>> largeGroupPositions(String s) {
//         List<List<Integer>> list = new ArrayList<>();
//         for(int i=0;i<s.length()-1;i++){
//             int count = 1;
//             int start = i;
//             while (i < s.length()-1 && s.charAt(i) == s.charAt(i+1)){
//                 count++;
//                 i++;
//             }
//             if(count >= 3){
//                 list.add(Arrays.asList(start, i));
//             }
//         }
//         return list;
//     }
// }