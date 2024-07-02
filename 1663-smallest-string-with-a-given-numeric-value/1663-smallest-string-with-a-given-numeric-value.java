class Solution {
    public String getSmallestString(int n, int k) {
        char[] res = new char[n];
        Arrays.fill(res, 'a');
        k -= n;
        while(k > 0){
            res[--n] += Math.min(k, 25);
            k -= Math.min(k, 25);
        }
        return String.valueOf(res);
    }
    
}