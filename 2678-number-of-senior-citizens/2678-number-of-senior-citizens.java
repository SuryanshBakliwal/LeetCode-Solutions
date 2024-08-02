class Solution {
    public int countSeniors(String[] details) {
        int count=0;
        for(String detail : details){
            char tens = detail.charAt(11);
            char ones = detail.charAt(12);

            if(tens > '6' || (tens >= '6' && ones > '0')) count++;
        }
        return count;
    }
}