class Solution {
    public int numOfPairs(String[] nums, String target) {
        int ans=0;
        Map<String, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(target.startsWith(nums[i]) == true){
                String rem = target.substring(nums[i].length()); 
                if(map.containsKey(rem)){
                    ans += map.get(rem);
                }
            }
            if(target.endsWith(nums[i])){
                String rem =target.substring(0, target.length() - nums[i].length()); 
                if(map.containsKey(rem)){
                    ans += map.get(rem);
                }
            }
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }
        return ans;
    }
}