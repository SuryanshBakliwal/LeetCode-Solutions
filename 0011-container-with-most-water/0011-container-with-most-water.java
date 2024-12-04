class Solution {
    public int maxArea(int[] height) {
        int maxCap = -1;
        int L=0, R=height.length-1;
        while(L < R){
            int cap = Math.min(height[L], height[R]);
            maxCap = Math.max(maxCap, cap*(R-L));
            if(height[L] < height[R]){
                L++;
            }else{
                R--;
            }
        }
        return maxCap;
    }
}