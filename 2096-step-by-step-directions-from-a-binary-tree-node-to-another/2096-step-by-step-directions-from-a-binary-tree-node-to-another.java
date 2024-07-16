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
    public boolean findRoot(int val, StringBuilder s, TreeNode node){
        if(node == null) return false;
        
        if(node.val == val) return true;
       
            if(findRoot(val, s, node.left)) s.append("L");
        
            else if(findRoot(val, s, node.right)) s.append("R");
        return s.length() > 0;
    }
    
    public String getDirections(TreeNode root, int startValue, int destValue) {
        StringBuilder s = new StringBuilder(), d = new StringBuilder();
        findRoot(startValue, s, root);
        findRoot(destValue, d, root);
        int i = s.length(), j = d.length();
        int cnt = 0;
        while(i > 0 && j > 0 && s.charAt(i-1) == d.charAt(j-1)) {
            cnt++; i--; j--;
        }
        
        String sPath = "U".repeat(s.length() - cnt);
        String ePath = d.reverse().toString().substring(cnt, d.length());
        
        return sPath + ePath;
    }
}