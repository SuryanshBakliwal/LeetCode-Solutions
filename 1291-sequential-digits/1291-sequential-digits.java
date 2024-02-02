class Solution {
    public int count(int x){
        int count=0;
        while(x!=0){
            x /= 10;
            count++;
        }
        return count;
    } 
    public List<Integer> sequentialDigits(int low, int high) {
        int allSequential[] ={12,23,34,45,56,67,78,89,123,234,345,456,567,678,789,1234,2345,3456,4567,5678,6789,12345,23456,34567,45678,56789,123456,234567,345678,456789,1234567,2345678,3456789,12345678,23456789,123456789};
        List<Integer> res = new ArrayList<>();
        for(int i=0; i<allSequential.length; i++){
            if(allSequential[i] >= low && allSequential[i]<=high){
                res.add(allSequential[i]);
            }
        }
        return res;
    }
}