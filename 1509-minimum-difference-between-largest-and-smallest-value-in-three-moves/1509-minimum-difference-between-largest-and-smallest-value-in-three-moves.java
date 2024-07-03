class Solution {
    public int minDifference(int[] nums) {
        if(nums.length < 4 ) return 0;
        Arrays.sort(nums);
        int res = Integer.MAX_VALUE;
        int n = nums.length;
        // Only 4 case possible
        // case 1 : kill 3 largest value
        // case 2 : kill 2 largest 1 smallest
        // case 3 : kill 2 smallest 1 largest
        // case 4 : kill 3 smallest
        // return min(case1, case2, case3, case4);
        res = Math.min(res, nums[n-4] - nums[0]);
        res = Math.min(res, nums[n-3] - nums[1]);
        res = Math.min(res, nums[n-2] - nums[2]);
        res = Math.min(res, nums[n-1] - nums[3]);
        return res;
    }
}