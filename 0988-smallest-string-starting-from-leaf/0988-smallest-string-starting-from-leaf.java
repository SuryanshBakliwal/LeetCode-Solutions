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
    String ans = "~";
    
    String dfs(TreeNode root, String sb){
        if(root == null){
            return sb;
        }
        sb = (char)(root.val + 'a') + sb + "";
        if(root.left == null && root.right == null && ans.compareTo(sb) > 0) ans = sb;
        dfs(root.left, sb);
        dfs(root.right, sb);
        return ans;
    }
    
    
    public String smallestFromLeaf(TreeNode root) {
        if(root == null) return "";
        return dfs(root, "");    
    }
}