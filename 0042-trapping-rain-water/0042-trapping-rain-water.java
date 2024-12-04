class Solution {
    public int trap(int[] height) {
        if(height.length == 0) return 0;
        int maxL=0, maxR=0;
        int L=0, R=height.length-1;
        int totalWater=0;
        while(L <= R){
            System.out.println("1");
            
            if(height[L] < height[R]){
                if(maxL <= height[L]){
                    maxL = height[L];
                }else{
                    totalWater += maxL - height[L];
                }
                L++;
            }else{
                if(maxR <= height[R]){
                    maxR = height[R];
                }else{
                    totalWater += maxR - height[R];
                }
                R--;
            }
        }
        return totalWater;
    }
}