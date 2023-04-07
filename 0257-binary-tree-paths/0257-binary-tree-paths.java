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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new ArrayList<>();
        if(root != null) searchPath(root, res, "");
        return res;
    }
    public void searchPath(TreeNode root, List<String> res, String path){
        if(root.left == null && root.right == null){  
            res.add(path + root.val);
            return;
        }
        if(root.left != null) searchPath(root.left, res, path+root.val+"->");
        if(root.right != null)  searchPath(root.right, res, path+root.val+"->");
    } 
}