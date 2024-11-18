class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length, msf=prices[n-1], res=0;
        for(int i=n-2; i>=0; i--){
            if(prices[i] <= msf) res= Math.max(msf-prices[i], res);
            else{
                msf = prices[i];
            }
        }
        return res;
    }
}