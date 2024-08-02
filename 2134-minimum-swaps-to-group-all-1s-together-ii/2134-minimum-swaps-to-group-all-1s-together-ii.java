class Solution {
    public int minSwaps(int[] nums) {
        int cones = 0;
        for(int num : nums) 
            if(num == 1) cones++;
        int ans=0, czeros=0, n=nums.length;
        for(int i=0; i<cones; i++){
            if(nums[i] == 0) czeros++;
        }
        ans=czeros;
        for(int i=cones; i < 2*n; i++){
            if(nums[i%n]==0) czeros++;
            if(nums[(i-cones)%n] == 0) czeros--;
            ans = Math.min(czeros,ans);
        }
        return ans;
    }
}