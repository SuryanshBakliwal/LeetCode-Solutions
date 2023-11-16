class Solution {
    public int maxOperations(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int cnt=0;
        for(int num : nums){
            int res = k - num;
            if(map.containsKey(res)){
                cnt++;
                if(map.get(res)==1) map.remove(res);
                else map.put(res, map.get(res)-1);
            }else{
                map.put(num, map.getOrDefault(num,0)+1);
            }
        }
        return cnt;
    }
}