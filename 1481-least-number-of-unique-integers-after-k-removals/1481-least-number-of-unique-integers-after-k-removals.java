class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i : arr) map.put(i, map.getOrDefault(i, 0)+1);
        int unique = map.size();
        int freqOffreq[] = new int[100000];
        for(int key:map.keySet()){
            int j = map.get(key);
            freqOffreq[j]++;
        }
        for(int i=0; i<100000; i++){
            if(freqOffreq[i] != 0){
                int remove = k/i;
                if(remove == 0) break;
                else{
                    remove = Math.min(remove, freqOffreq[i]);
                    unique -= remove;
                    k -= remove*i;
                }
            }
        }
        return unique;
    }
}