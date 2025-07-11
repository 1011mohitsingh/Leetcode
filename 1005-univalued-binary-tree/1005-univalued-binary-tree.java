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
    public boolean checkIfUnivalued(TreeNode root, int OGRootValue){
        if(root == null){
            return true;
        }

        if(root.val != OGRootValue){
            return false;
        }

        boolean isLeftUnivalued = checkIfUnivalued(root.left, OGRootValue);
        boolean isRightUnivalued = checkIfUnivalued(root.right, OGRootValue);

        return isLeftUnivalued && isRightUnivalued;
    }

    public boolean isUnivalTree(TreeNode root) {
        int rootValue = root.val;

        return checkIfUnivalued(root, rootValue);
    }
}