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
    int ceil = Integer.MAX_VALUE;
    int floor = Integer.MIN_VALUE;
    public int kthSmallest(TreeNode root, int k) {
        int factor =  Integer.MIN_VALUE;
        for(int i=0; i<k; i++){
            ceilAndFloor(root, factor);
            factor = ceil;
            ceil =  Integer.MAX_VALUE;
        }
        return factor;
    }
    
    public void ceilAndFloor(TreeNode root, int factor){
        if(root.val > factor){
            if(root.val < ceil) ceil = root.val;
        }
        if(root.val < factor){
            if(root.val > floor) floor = root.val;
        }
        
        if(root.left != null) ceilAndFloor(root.left, factor);
        if(root.right != null) ceilAndFloor(root.right, factor);

    }
}