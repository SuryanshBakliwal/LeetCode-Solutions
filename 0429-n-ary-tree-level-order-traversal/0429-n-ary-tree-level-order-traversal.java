/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        
        List<List<Integer>> res = new LinkedList<>();
        if(root == null) return res;
        Queue<Node> mq = new ArrayDeque<>();
        mq.add(root);
        while(mq.size()>0){
            int len = mq.size();
            List<Integer> temp = new LinkedList<>();
            for(int i=0; i<len; i++){
                Node t = mq.remove();
                for(Node child : t.children){
                    mq.add(child);
                }
                temp.add(t.val);
            }
            res.add(temp);
        }
        return res;
    }
}