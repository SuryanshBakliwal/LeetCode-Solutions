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
        List<Integer> res = new ArrayList<>();
        int nodl = count(low);
        int nodh = count(high);
        String s = "123456789";
        for(int i=nodl; i<= nodh; i++){
            for(int j=0; j+i<=s.length(); j++){
                int num = Integer.parseInt(s.substring(j, j+i));
                System.out.println(num);
                if(num>high)break;
                else if(num>=low) res.add(num); 
            }
        }
        return res;
    }
}