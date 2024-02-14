class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length, pos[] = new int[n];
        for(int i=0, k=0, j=n/2; i<n; i++){
            if(nums[i] > 0){
                pos[k++]=nums[i];
            }else{
                pos[j++] = nums[i];
            }   
        }
        for(int no:pos) System.out.print(no + " ");
        int i=0, j=n/2, k=0;
        while(i<n){
            nums[i++] = pos[k++];
            nums[i++] = pos[j++];
        }
        return nums;
    }
}