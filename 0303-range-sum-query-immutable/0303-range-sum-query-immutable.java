class NumArray {
    int[] prefixSum;
    public NumArray(int[] nums) {
        int n = nums.length, sum=0;
        prefixSum = new int[n];
        for(int i=0; i<n; i++){
            sum += nums[i];
            prefixSum[i] = sum;
        }
    }
    
    public int sumRange(int left, int right) {
        int b = ( left == 0 ) ? 0 : prefixSum[left-1];
        int res = prefixSum[right] - b;
        return res;
                                      
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */