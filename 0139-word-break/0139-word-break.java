class Solution {
    public boolean solve(String s, Set<String> set, int start ,int end, int[][] dp){
        if(dp[start][end] != -1) return dp[start][end] == 1 ? true : false;
        if(end == s.length()-1){
            if(set.contains(s.substring(start,end+1))) return true;
            return false;
        }

        if(set.contains(s.substring(start,end+1))){
            if(solve(s,set,end+1,end+1,dp)){
                dp[start][end] = 1;
                return true;
            }
        }
        boolean ans = solve(s,set,start, end+1,dp);
        dp[start][end] = ans ? 1: 0;
        return ans;
    }
    public boolean wordBreak(String s, List<String> wordDict) {
        int dp[][] = new int[s.length()][s.length()];
        for(int i[]:dp){
            Arrays.fill(i,-1);
        }
        return solve(s,new HashSet<>(wordDict),0,0,dp);
    }
}