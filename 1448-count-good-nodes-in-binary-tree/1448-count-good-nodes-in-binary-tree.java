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
    int max = 0;
    
    void dfs(TreeNode root, int currMax){
        if(root == null) return;
        if(root.val >= currMax){
            System.out.println(max + " " + currMax);
            max++;
            currMax = root.val;
        }
        dfs(root.left, currMax);
        dfs(root.right, currMax);
    }
    
    public int goodNodes(TreeNode root) {
        int value = root.val;
        dfs(root, value);
        return max;
    }
}