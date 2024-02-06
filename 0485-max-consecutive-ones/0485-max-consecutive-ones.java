class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int ans=0, max=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == 0){
                ans = Math.max(max, ans);
                max=0;
            }else max += 1;
        }
        ans = Math.max(ans, max);
        return ans;
    }
}