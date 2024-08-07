class Solution {
    public List<Integer> getRow(int row) {
        List<Integer> res = new ArrayList<>();
        res.add(1);
        long coef = 1;
        for(int i=1; i<=row; i++){
            long next = coef * (row-i+1)/i;
            res.add((int)next);
            coef=next;
        }
        return res;
    }
}