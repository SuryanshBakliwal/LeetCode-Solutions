class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int not = tickets[k], timeTaken=0;
        for(int i=0; i<tickets.length; i++){
            if(i <= k) timeTaken += Math.min(not, tickets[i]);
            else timeTaken += Math.min(not-1, tickets[i]);
        }
        return timeTaken;
    }
}