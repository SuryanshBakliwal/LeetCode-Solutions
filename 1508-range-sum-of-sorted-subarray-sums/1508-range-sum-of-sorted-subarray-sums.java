class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        List<Integer> l = new ArrayList<>();
        for(int i=0; i<n; i++){
            int currSum=nums[i];
            for(int j=i; j<n; j++){
                if(i==j){
                    l.add(nums[i]);
                }
                else{
                    currSum += nums[j];
                    l.add(currSum);
                }
            }
        }
        int sum=0;
        int M = 1000000007;
        Collections.sort(l);
        for(int i=left-1; i<right; i++){
            sum = (sum + l.get(i)) % M;           
        }
        return sum;
    }
}