class Solution {
    public int longestOnes(int[] nums, int k) {
        int j=-1; int ans=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == 0) k -= 1;
            while(k<0){
                j++;
                if(nums[j] == 0) k += 1;
            }
            int len = i-j;
            if(ans<len) ans = len;
        }
        return ans;
    }
}