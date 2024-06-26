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
    List<TreeNode> arr = new ArrayList<>();
    public TreeNode balanceBST(TreeNode root) {
        inorderTraverse(arr, root);
        return newBalanceBST(0, arr.size()-1);
    }
    
    void inorderTraverse(List<TreeNode> arr, TreeNode root){
        if(root == null) return;
        inorderTraverse(arr, root.left);
        arr.add(root);
        inorderTraverse(arr, root.right);
    }
    TreeNode newBalanceBST(int st, int end){
        if(st > end) return null;
        int mid = (st + end)/2;
        TreeNode root = arr.get(mid);
        root.left = newBalanceBST(st, mid-1);
        root.right = newBalanceBST(mid+1, end);
        return root;
    }
    
}