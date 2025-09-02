class Solution {
    public boolean check(String n){
        int left = 2;
        int right = n.length()-1;
        while(left < right){
            if(n.charAt(left)!= n.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public boolean isStrictlyPalindromic(int n) {
        boolean flag = true;
        for(int i=2;i<n-1;i++){
            if(!check(Integer.toString(n,i)));
            flag = false;
            break;
        }
        return flag;
    }
}