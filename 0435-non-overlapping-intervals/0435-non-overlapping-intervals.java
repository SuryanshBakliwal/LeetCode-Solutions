class Solution {
    public int eraseOverlapIntervals(int[][] clips) {
        Arrays.sort(clips, new Comparator<int[]>(){
           public int compare(int[] a, int[] b){
               return a[0]-b[0];
           } 
        });
        int ans=0, far=clips[0][1];
        for(int i=1; i<clips.length; i++){
            //overlapp
            if(far > clips[i][0]){
                ans++;
                far = Math.min(clips[i][1], far);
            }else{
                far = clips[i][1];
            }
        }
        return ans;
    }
}