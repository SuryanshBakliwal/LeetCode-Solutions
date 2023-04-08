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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new LinkedList<>();
        if(root == null) return res; 
        int level = 1;
        Stack<TreeNode> ms = new Stack<>();
        ms.push(root);
        Stack<TreeNode> cs = new Stack<>();
        while(ms.size() > 0){
            int len = ms.size();
            List<Integer> temp = new LinkedList<>();
            for(int i=0; i<len; i++){
                TreeNode t = ms.pop();
                if(level%2 == 0){
                    if(t.right != null)
                        cs.push(t.right);
                    if(t.left != null)
                        cs.push(t.left);
                }else if(level%2 != 0){
                    if(t.left != null)
                        cs.push(t.left);
                    if(t.right != null)
                        cs.push(t.right);
                }
                temp.add(t.val);
                if(ms.size() == 0){
                    ms = cs;
                    cs = new Stack<>();
                }
            }
            res.add(temp);
            level++;
        }
        return res;
    }
}