class Solution {
    public int findJudge(int n, int[][] trust) {
        int outD[] = new int[n+1];
        int inD[] = new int[n+1];
        for(int[] i : trust){
            outD[i[0]]++;
            inD[i[1]]++;
        }
        for(int i=1; i<=n; i++){
            if(outD[i] == 0 && inD[i] == n-1){
                return i;
            }
        }
        return -1;
    }
}