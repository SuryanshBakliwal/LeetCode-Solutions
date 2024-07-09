class Solution {
    public double averageWaitingTime(int[][] cust) {
        double waitingTime = 0, currTime = 0;
        for(int i=0; i<cust.length; i++){
            if(i==0){
                currTime = cust[i][0] + cust[i][1];
                waitingTime = currTime - cust[i][0];
            }
            else{
                if(cust[i][0] > currTime) currTime = cust[i][0] + cust[i][1];
                else currTime += cust[i][1];
                waitingTime += currTime - cust[i][0];
            }
        }
        return waitingTime/cust.length;
    }
}