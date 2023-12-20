class Solution {
    public int buyChoco(int[] prices, int money) {
        int ans=Integer.MAX_VALUE;
        int fin=0;
        for(int i=0; i<prices.length-1; i++){
            for(int j=i+1; j<prices.length; j++){
                int sum=prices[i]+prices[j];
                if(sum < ans) ans=sum;
            }
        }
        
        fin = money - ans;
        if(fin>=0){
        return fin;
        }
        else{
            return money;
        }
    }
}