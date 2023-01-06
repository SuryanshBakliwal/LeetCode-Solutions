class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        // int temp = coins;
        int ans = 0;
        for(int i : costs){
            if(coins == 0) break;
            if(coins - i <= coins && i <= coins){
                coins -= i;
                ans++;
            }
        }
        
        return ans;
    }
}