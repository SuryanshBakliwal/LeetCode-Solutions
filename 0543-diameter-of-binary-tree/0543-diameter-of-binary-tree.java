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
    public int helper(TreeNode root){
        if(root == null) return 0;
        return Math.max(helper(root.left), helper(root.right))+1;
    }
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null) return 0;
        int dia = helper(root.left) + helper(root.right);
        int ldia = diameterOfBinaryTree(root.left);
        int rdia = diameterOfBinaryTree(root.right);
        return Math.max(dia,Math.max(ldia, rdia));
    }
}