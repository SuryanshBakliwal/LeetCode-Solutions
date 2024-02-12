class Solution {
    public int majorityElement(int[] nums) {
        int ans=0;int max=0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int n:nums){
            map.put(n, map.getOrDefault(n, 0)+1);
        }
        for(int key : map.keySet()){
            int temp = map.get(key);
            if(temp > nums.length/2 && temp > max){
                max=temp; ans=key;
            }
        }
        return ans;
    }
}