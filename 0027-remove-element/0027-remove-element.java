class Solution {
    public int removeElement(int[] nums, int val) {
        int i=0, k=0; 
        while(i < nums.length){
            if(nums[i] == val){
                i++;
            }else{
                if(i > k){
                    nums[k++] = nums[i++];
                }else{
                    i++; k++;
                }
            }
        }
        System.out.println(k);
        return k;
    }
}