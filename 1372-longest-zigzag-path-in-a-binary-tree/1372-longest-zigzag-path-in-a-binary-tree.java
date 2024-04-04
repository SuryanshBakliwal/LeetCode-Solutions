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
    int max=0;
    public int longestZigZag(TreeNode root) {
        if(root.left == null && root.right == null) return 0;
        
        dfs(root.right, 1, 1);
        dfs(root.left, 1, 0);
        return max;
    }
    void dfs(TreeNode root, int currlen, int dir){
        if(root == null){
            return;
        }
        max=Math.max(max,currlen);
        
        if(dir==1){  //coming from left, go right  
            dfs(root.left, currlen+1, 0);
            dfs(root.right, 1, 1);
        }else{ //coming from right, go left
            dfs(root.right, currlen+1, 1);
            dfs(root.left, 1, 0);
        }
        
    }
}