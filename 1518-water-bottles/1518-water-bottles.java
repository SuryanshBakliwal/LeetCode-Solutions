class Solution {
    public int numWaterBottles(int nB, int nE) {
        int ans = nB;
        while(nB > 0){
            int x = nB/nE;
            int y = nB%nE;
            ans += x;
            nB=x+y;
            if(x == 0) break;
            System.out.println(x + " " + y + " " + nB);
        }
        return ans;
    }
}