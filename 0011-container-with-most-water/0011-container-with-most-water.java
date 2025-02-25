class Solution {
    public int maxArea(int[] height){
        int n=height.length;

        int l=0;
        int r=n-1;
        int maxArea = 0;

        while(l<r){
            int h= Math.min(height[l], height[r]);
            int w=r-l;

            int currArea = h*w;
            if (currArea >maxArea){
                maxArea = currArea;
            }

            if(height[l] <height[r]){
                l++;
            } else {
                r--;
            }
        }
        return maxArea;

    }
}