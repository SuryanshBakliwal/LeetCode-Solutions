class Solution {
    public int minOperations(String[] logs) {
        int currPos = 0;
        for(int i=0; i<logs.length; i++){
            String s[] = logs[i].split("/");
            if(s[0].equals("..")){
                if(currPos != 0) currPos--; 
            }else if(s[0].equals(".")){
                continue;
            }else{
                currPos++;
            }
            System.out.println(s[0] + " " + currPos);
        }
        return currPos;
    }
}