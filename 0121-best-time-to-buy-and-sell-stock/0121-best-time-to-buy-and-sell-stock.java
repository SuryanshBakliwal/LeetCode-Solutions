class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length, msf=prices[n-1];
        int[] profit = new int[n];
        profit[n-1] = -1;
        for(int i=n-2; i>=0; i--){
            if(prices[i] <= msf) profit[i]=msf;
            else{
                profit[i] = -1; msf = prices[i];
            }
        }
        int res=0;
        for(int i=0; i<n; i++){
            if(profit[i] != -1) res = Math.max(profit[i]-prices[i], res);
        }
        return res;
    }
}