class Solution {
    public int mySqrt(int x) {
        if(x == 0) return 0;
        int low = 2, high = 46340;
        while(low <= high){
            int mid = low+(high-low)/2;
            if(mid * mid == x){
                return mid;
            } else if(mid*mid > x){
                high = mid-1;
            } else {
                low = mid+1;
            }
        }
        return (int)(high);
    }
}