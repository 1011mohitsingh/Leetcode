class Solution {
    public boolean rotateString(String s, String goal) {
        int n = s.length();
        if(n != goal.length()) return false;

        String ans = s+s;
        return ans.contains(goal);
    }
}

// class Solution {
//     public boolean rotateString(String s, String goal) {
//         int n = s.length();
//         if(n != goal.length()) return false;

//         for(int i=0;i<n;i++){
//             if(s.equals(goal)) return true;
//             s = s.substring(1)+s.charAt(0);
//         }
//         return false;
//     }
// }