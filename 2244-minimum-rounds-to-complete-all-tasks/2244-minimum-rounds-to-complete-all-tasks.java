class Solution {
    public int minimumRounds(int[] tasks) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int res = 0;
        for(int i=0; i<tasks.length; i++){
            map.put(tasks[i], map.getOrDefault(tasks[i], 0) + 1);
        }
        
        for(int freq : map.values()){
            if(freq == 1) return -1;
            int count = 0;
            while(freq >= 3){
                count++;
                freq -= 3;
            }
            if(freq == 2 || freq==1){
                count++;
            }
            
            res += count;
        }
        
        return res;
        
    }
}