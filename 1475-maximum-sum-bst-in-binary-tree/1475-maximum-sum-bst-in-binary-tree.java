/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int maxSum = 0;
    class Info{
        boolean isBST;
        int sum;
        int min;
        int max;

        Info(boolean isBST, int sum , int min , int max){
            this.isBST = isBST;
            this.sum = sum;
            this.min = min;
            this.max = max;
        }
    }

    Info helper(TreeNode root){
        if(root == null) {
            return new Info(true, 0, Integer.MAX_VALUE, Integer.MIN_VALUE);
        }
        Info left = helper(root.left);
        Info right = helper(root.right);

        if(left.isBST && right.isBST && root.val > left.max && root.val < right.min){
            int currSum = left.sum  + root.val + right.sum;
            maxSum = Math.max(maxSum, currSum);
            return new Info(true, currSum , Math.min(root.val, left.min), Math.max(root.val, right.max));
        }
        return new Info(false, 0, 0 , 0);
    }

    public int maxSumBST(TreeNode root) {
        helper(root);
        return maxSum;
    }
}