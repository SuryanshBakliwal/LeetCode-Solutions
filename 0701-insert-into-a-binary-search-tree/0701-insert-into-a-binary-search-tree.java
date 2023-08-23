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
    public TreeNode insertIntoBST(TreeNode root, int val) {
     
        if(root == null) {
            TreeNode newNode = new TreeNode(val);
            return newNode;
        }
        TreeNode nn = (val > root.val) ? insertIntoBST(root.right, val) : insertIntoBST(root.left, val);
        if(val > root.val) root.right = nn;
        if(val < root.val) root.left = nn;
        return root;
    }
}