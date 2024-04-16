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
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if(depth == 1){
            TreeNode newRoot = new TreeNode(val);
            newRoot.left = root;
            return newRoot;
        }
        dfs(root, val, depth, 1);
        return root;
    }
    void dfs(TreeNode root, int val, int depth, int curDep){
        if(root == null) return;
        if(curDep == depth-1){
            TreeNode leftRoot = new TreeNode(val);
            TreeNode rightRoot = new TreeNode(val);
            leftRoot.left = root.left;
            rightRoot.right = root.right;
            root.left = leftRoot;
            root.right = rightRoot;

        }
        dfs(root.left, val, depth, curDep+1);
        dfs(root.right, val, depth, curDep+1);
    }
}