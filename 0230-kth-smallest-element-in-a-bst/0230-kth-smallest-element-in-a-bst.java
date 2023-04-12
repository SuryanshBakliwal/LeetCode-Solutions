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
    int res = 0;
    int cnt = 0;
    public int kthSmallest(TreeNode root, int k) {
        cnt = k;
        helper(root);
        return res;
    }
    
    private void helper(TreeNode root){
        if(root.left != null)
            helper(root.left);
        cnt--;
        if(cnt == 0){
            res = root.val;
            return;
        }
        if(root.right != null)
            helper(root.right);
    }
}