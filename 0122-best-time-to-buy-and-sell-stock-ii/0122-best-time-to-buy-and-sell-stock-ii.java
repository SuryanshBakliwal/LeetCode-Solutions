class Solution {
    public int maxProfit(int[] prices) {
        int res=0, buy, sell, i=0, n=prices.length-1;
        while(i<n){
            while(i<n && prices[i+1] <= prices[i]) i++;
            buy=prices[i];
            while(i<n && prices[i+1] > prices[i]) i++;
            sell=prices[i];
            res += sell - buy;
        }
        return res;
    }
}