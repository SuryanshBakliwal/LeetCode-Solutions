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
    int sum=0;
    public int helper(TreeNode root){
        if(root == null) return 0;
        
        if(root.left == null && root.right == null) return root.val;
        
        int left = helper(root.left);
        int right = helper(root.right);
        int abs_val = Math.abs(left-right);
        sum += abs_val;
        root.val += left+right;
        return root.val;
    }
    public int findTilt(TreeNode root) {
        int a = helper(root);
        return sum;
    }
}