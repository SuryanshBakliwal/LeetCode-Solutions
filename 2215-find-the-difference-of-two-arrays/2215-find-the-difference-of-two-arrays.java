class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        
        List<List<Integer>> ans = new ArrayList<>();
        
        Set<Integer> s1 = new HashSet<>();
        Set<Integer> s2 = new HashSet<>();

        for(int i:nums1)    s1.add(i);
        for(int i:nums2)    s2.add(i);

        List<Integer> temp1 = new ArrayList<>();
        List<Integer> temp2 = new ArrayList<>();

        for(int i : s1){
            if(s2.contains(i)) s2.remove(i);
            else temp1.add(i);
        }

        for(int i:s2){
            temp2.add(i);
        }
        ans.add(temp1);
        ans.add(temp2);
        return ans;
    }
}