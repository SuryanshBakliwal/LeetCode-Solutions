class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int cnt=0,i=0,j=nums.length-1;
        while(i<j){
            if(nums[i]+nums[j] == k){
                i++;j--;cnt++;
            }else if(nums[i]+nums[j] > k){
                j--;
            }else if(nums[i]+nums[j] < k){
                i++;
            }
        }
        return cnt;
    }
}