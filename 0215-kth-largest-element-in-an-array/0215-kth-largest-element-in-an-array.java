import java.util.Random;
class Solution {
    public int findKthLargest(int[] nums, int k) {
        int n = nums.length;
        int targetIndex = n-k;
        return quickSelect(nums, 0 , n-1 , targetIndex);
    }

    private int quickSelect(int []nums, int left , int right , int k ){
        if (left == right){
            return nums[left];
        }

        Random rand = new Random();
        int pivotIndex = left + rand.nextInt(right - left + 1);
        
        pivotIndex = partition(nums, left, right, pivotIndex);

        if (pivotIndex == k) {
            return nums[pivotIndex]; 
        } else if (pivotIndex < k) {
            return quickSelect(nums, pivotIndex + 1, right, k);
        } else {
            return quickSelect(nums, left, pivotIndex - 1, k);
        }
    }

    private int partition(int[] nums, int left, int right, int pivotIndex){
        int pivot = nums[pivotIndex];

        swap(nums, pivotIndex, right);
        int storeIndex = left;

        for (int i = left; i < right; i++) {
            if (nums[i] < pivot) {
                swap(nums, storeIndex, i);
                storeIndex++;
            }
        }

        swap(nums, storeIndex, right);
        return storeIndex;
    }

    private void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
