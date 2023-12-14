class Solution {
    public int findSpecialInteger(int[] arr) {
        Map<Integer, Integer> freq = new HashMap<>();
        int qtr = arr.length/4;
        for(int num : arr){
            freq.put(num, freq.getOrDefault(num, 0)+1);
        }
        for(int key : freq.keySet()){
            if(freq.get(key) > qtr) return key;
        }
        return 0;
    }
}