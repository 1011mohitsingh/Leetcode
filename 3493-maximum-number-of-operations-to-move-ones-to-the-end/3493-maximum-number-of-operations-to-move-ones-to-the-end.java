class Solution {
    public int maxOperations(String s) {
        long operations = 0;
        int ones = 0, n = s.length();

        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (c == '1') {
                ones++;
            } else { 
                if (i == n - 1 || s.charAt(i + 1) == '1') {
                    operations += ones;
                }
            }
        }
        return (int) operations;
    }
}
