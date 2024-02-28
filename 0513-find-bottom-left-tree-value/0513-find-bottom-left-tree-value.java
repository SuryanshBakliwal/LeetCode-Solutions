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
    int ans=0;
    int level = 0;
    public int findBottomLeftValue(TreeNode root) {
        if(root.left == null && root.right == null) return root.val;
        dfs(root, 1);
        return ans;
    }
    void dfs(TreeNode root, int currLevel){
        if(root == null) return;
        if(root.left == null && root.right == null && level < currLevel){
            ans = root.val;
            level = currLevel;
        }
        dfs(root.left, currLevel+1);
        dfs(root.right, currLevel+1);
    }
}