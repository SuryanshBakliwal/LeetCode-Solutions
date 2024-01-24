class Solution {
    public int[] twoSum(int[] nums, int tar) {
        int res[] = new int[2];
        HashMap<Integer, Integer> map= new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(map.containsKey(tar - nums[i])){
                res[0] = i;
                res[1] = map.get(tar - nums[i]);
                return res;
            }
            map.put(nums[i], i);
        }
        return res;
    }
}