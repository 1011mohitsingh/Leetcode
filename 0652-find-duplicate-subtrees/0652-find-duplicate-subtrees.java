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
    HashMap<String, Integer> map = new HashMap<>();
    List<TreeNode> result = new ArrayList<>();

    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        serialize(root);
        return result;
    }

    private String serialize(TreeNode node){
        if(node == null){
            return "#";
        }
        
        StringBuilder sb = new StringBuilder();
        sb.append("(");
        sb.append(serialize(node.left));
        sb.append(node.val);
        sb.append(serialize(node.right));
        sb.append(")");
        
        String str = sb.toString();
        
        map.put(str, map.getOrDefault(str,0)+1);
        if(map.get(str) == 2){
            result.add(node);
        }
        return str;
    }
}