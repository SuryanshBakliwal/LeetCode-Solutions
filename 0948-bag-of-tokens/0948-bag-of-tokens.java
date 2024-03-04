class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        int ans = 0, i=0, j=tokens.length-1;
        Arrays.sort(tokens);
        int curr=0;
        while(i<=j){
            if(tokens[i] <= power){
                power -= tokens[i];
                curr++;
                i++;
            }
            else if(curr >= 1){
                power += tokens[j];
                curr--;
                j--;
            }else{
                break;
            }
            ans = Math.max(ans, curr);
        }
        return ans;
    }
}