class Solution {
    public int totalNumbers(int[] digits) {
        boolean[] used = new boolean[digits.length];
        Set<Integer> set = new HashSet<>();
        backtrack(digits, used, 0, 0, set);
        return set.size();
    }
    public void backtrack(int[] digits,boolean[] used, int num, int length, Set<Integer> set){
        if(length == 3){
            if(num % 2 == 0){
                set.add(num);
            }
            return;
        }
        for(int i=0;i<digits.length;i++){
            if (used[i]) continue;
            if(length == 0 && digits[i] == 0 ) continue;
            used[i] = true;
            backtrack(digits, used, num*10+digits[i], length+1,set);
            used[i] = false;
        }
    }
}