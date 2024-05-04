class Solution {
    public int numOfPairs(String[] nums, String target) {
        int ans=0;
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                String curr = nums[i] + nums[j] + "";
                String rev = nums[j] + nums[i] + "";
                System.out.println(curr + " " + rev);
                if(curr.equals(target) == true) ans++;
                if(rev.equals(target) == true) ans++;
            }
        }
        return ans;
    }
}