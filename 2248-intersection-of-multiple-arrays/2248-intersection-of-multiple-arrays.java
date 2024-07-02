class Solution {
    public List<Integer> intersection(int[][] nums) {
        Map<Integer, Integer> freq = new HashMap<>();
        List<Integer> ans = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            for(int num : nums[i]){
                freq.put(num, freq.getOrDefault(num, 0)+1);
            }
        }
        
        for(int i : freq.keySet()){
            if(freq.get(i) == nums.length) ans.add(i);
        }
        Collections.sort(ans);
        return ans;
    }
}