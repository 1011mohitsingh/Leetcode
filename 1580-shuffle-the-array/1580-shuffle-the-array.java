class Solution {
    public int[] shuffle(int[] nums, int n) {
        int result[] = new int[nums.length];
        int index = 0,i=0, j=n;
        while(j<nums.length){
            result[index++] = nums[i];
            result[index++] = nums[j];
            i++;
            j++;
        }
        return result;
    }
}