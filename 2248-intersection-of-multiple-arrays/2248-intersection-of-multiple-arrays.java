class Solution {
    public List<Integer> intersection(int[][] nums) {
        int count[] = new int[1001];
        List<Integer> ans = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            for(int num : nums[i]){
                count[num]++;
            }
        }
        
        for(int i=0; i<count.length; i++){
            if(count[i] == nums.length) ans.add(i);
        }
        
        return ans;
    }
}