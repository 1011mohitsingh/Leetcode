class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){ return false;};
        int rev = 0;
        int temp = x;
        while(temp!=0){
            int lastdigit = temp%10;
            rev = rev*10+lastdigit;
            temp = temp/10;
        }
        return (rev == x);
    }
}