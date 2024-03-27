class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int ans=0, j=0, product=1;
        for(int i=0; i<nums.length; i++){
            product *= nums[i];
            while(product >= k && j <= i){
                product /= nums[j];
                j++;
            }
            ans += (i-j)+1;
            System.out.println(product + " " + i + " " + j +  " " + ans);
        }
        return ans;
    }
}