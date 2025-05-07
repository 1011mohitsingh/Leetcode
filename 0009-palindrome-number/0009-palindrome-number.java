class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){ return false;};
        int rev = reverse(x);
        return (rev == x) ? true:false;
    }

    private static int reverse(int x){
        int rev = 0;
        while(x!=0){
            int lastdigit = x%10;
            rev = rev*10+lastdigit;
            x = x/10;
        }
        return rev;
    }
}