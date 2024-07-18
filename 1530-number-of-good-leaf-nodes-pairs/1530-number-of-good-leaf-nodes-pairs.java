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
    int res=0;
    int[] dfs(TreeNode root, int dis){
        if(root == null) return new int[dis+1];
        if(root.left == null && root.right == null){
            int arr[] = new int[dis+1];
            arr[1]++;
            return arr;
        }
        int[] left = dfs(root.left, dis);
        int[] right = dfs(root.right, dis);
        
        for(int l=1; l<left.length; l++){
            for(int r=dis-1; r>=0; r--){
                if(l+r <= dis) res += left[l]*right[r];
            }
        }
        int res[] = new int[dis+1];
        //shift by 1
        for(int i=res.length-2;i>=1;i--){
            res[i+1] = left[i]+right[i];
        }
        
        return res;
        

        
    }
    public int countPairs(TreeNode root, int distance) {
        dfs(root, distance);
        return res;
    }
}