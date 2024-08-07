class Solution {
    public List<List<Integer>> generate(int rows) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> l = new ArrayList<>();
        l.add(1); res.add(l);
        if(rows == 1) return res;
        for(int j=1; j<rows; j++){
            List<Integer> curr = new ArrayList<>();
            for(int i=0; i<=l.size(); i++){
                if(i == 0 || i == l.size()) curr.add(1);
                else curr.add(l.get(i) + l.get(i-1));
            }
            res.add(curr);
            l = curr;
        }
        return res;
    }
}