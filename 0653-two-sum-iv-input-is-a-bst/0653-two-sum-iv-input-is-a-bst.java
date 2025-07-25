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
    public void dfs(TreeNode root, List<Integer> inOrder){
        if (root == null){
            return;
        }

        dfs(root.left, inOrder);
        inOrder.add(root.val);
        dfs(root.right, inOrder);
    }
    public boolean findTarget(TreeNode root, int k) {
        List<Integer> inOrder = new ArrayList<>();
        dfs(root, inOrder);

        int left = 0, right = inOrder.size()-1;
        while(left < right){
            if(inOrder.get(left) + inOrder.get(right) == k){
                return true;
            } else if (inOrder.get(left) + inOrder.get(right) > k){
                right--;
            } else {
                left++;
            }
        }
        return false;
    }
}