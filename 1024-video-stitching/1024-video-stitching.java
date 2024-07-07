class Solution {
    public int videoStitching(int[][] clips, int time) {
        Arrays.sort(clips, new Comparator<int[]>(){
           public int compare(int a[], int b[]){
               return a[0] - b[0];
           } 
        });
        int ans=0, far=0, st=0;
        for(int i=0; st < time; ans++){
            while(i < clips.length && clips[i][0] <= st){
                far = Math.max(far, clips[i][1]);
                i++;
            }
            if(st == far) return -1;
            st = far;
        }
        return ans;
    }
}