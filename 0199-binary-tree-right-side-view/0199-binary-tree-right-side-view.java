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
    int maxHeight = 0;
    void dfs(TreeNode root, List<Integer> ans, int curh){
        if(root == null) return;
        curh++;
        if(maxHeight < curh){
            maxHeight=curh;
            ans.add(root.val);
        }
        
        dfs(root.right, ans, curh);
        dfs(root.left, ans, curh);
    }
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        dfs(root, ans, 0);
        return ans;
    }
}