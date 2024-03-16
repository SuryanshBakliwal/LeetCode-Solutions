class Solution {
    public int findMaxLength(int[] nums) {
        if(nums.length == 1) return 0;
        //Map< prefixSum, index > 
        HashMap<Integer, Integer> map = new HashMap<>();
        int ans=0;
        int prefixSum = 0;
        map.put(prefixSum, -1);
        for(int i=0; i<nums.length; i++){
            if(nums[i] == 0){
                prefixSum -= 1;
            }else{
                prefixSum += 1;
            }
            if(map.containsKey(prefixSum)){
                int temp = i - map.get(prefixSum);
                ans = Math.max(temp, ans);
            }else{
                map.put(prefixSum, i);
            }
        }
        return ans;
    }
}