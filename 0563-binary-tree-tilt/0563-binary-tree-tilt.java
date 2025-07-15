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
    static int totalTilt = 0;

    private static int rec(TreeNode node){
        if(node == null) return 0;

        int leftSum = rec(node.left);
        int rightSum = rec(node.right);

        totalTilt += Math.abs(leftSum-rightSum);

        return leftSum + rightSum + node.val;
    }

    public int findTilt(TreeNode root) {

        totalTilt = 0; // here we are reseting the total tilt because we are using this variable as static (global), it lives across all function calls, so we must manually reset it for each test case to avoid garbage (leftover) values.
        rec(root);
        return totalTilt;
    }
}