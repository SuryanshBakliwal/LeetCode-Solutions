class Solution {
    public boolean canJump(int[] nums) {
        boolean[] dp = new boolean[nums.length]; 
        for(int i=nums.length-1; i>=0; i--){
            if(i==nums.length-1) dp[i] = true;
            else{
                int jump = nums[i];
                for(int j=1;j<dp.length && j<=jump; j++){
                    if(dp[i+j] == true){
                        dp[i] = true;
                        break;
                    }
                }
            }
            
        }
        return dp[0] == true?true:false;
    }
}