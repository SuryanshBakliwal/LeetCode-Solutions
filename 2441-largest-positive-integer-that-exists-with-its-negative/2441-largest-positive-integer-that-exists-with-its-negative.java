class Solution {
    public int findMaxK(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int max = -1;
        for(int i=0; i<nums.length; i++){
            if(nums[i] < 0) set.add(nums[i]);
        }
        for(int i=0; i<nums.length; i++){
            if(nums[i] > 0){
                if(set.contains(0 - nums[i]) == true){
                    max = Math.max(nums[i], max);
                }
            }
        }
        return max;
    }
}