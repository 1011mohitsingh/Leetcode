class Solution {
    public int[] findEvenNumbers(int[] digits) {
        Set<Integer> set = new HashSet<>();
        boolean[] used = new boolean[digits.length];
        backtrack(digits, used, 0, 0, set);

        int[] ans = new int[set.size()];
        int idx = 0;
        for (int num : set) ans[idx++] = num;

        Arrays.sort(ans);
        return ans;
    }

    private void backtrack(int[] digits, boolean[] used, int len, int num, Set<Integer> set) {
        if (len == 3) {
            if (num % 2 == 0) set.add(num);
            return;
        }

        for (int i = 0; i < digits.length; i++) {
            if (used[i]) continue;
            if (len == 0 && digits[i] == 0) continue;

            used[i] = true;
            backtrack(digits, used, len + 1, num * 10 + digits[i], set);
            used[i] = false;
        }
    }
}
