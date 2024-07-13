class Solution {
    public List<Integer> survivedRobotsHealths(int[] positions, int[] h, String dir) {
        int n=positions.length;
        List<Integer> ind = new ArrayList<>();
        for(int i=0; i<n; i++) ind.add(i);
        ind.sort((a, b)-> Integer.compare(positions[a], positions[b]));
        Stack<Integer> st = new Stack<>();
        for(int i : ind){   
            if(dir.charAt(i) == 'R'){
                st.push(i);
                continue;
            }
            while(h[i] > 0 && st.size() != 0){
                if(h[i] > h[st.peek()]){
                    h[i] -= 1;
                    h[st.pop()] = 0;
                }else if(h[i] < h[st.peek()]){
                    h[i] = 0;
                    h[st.peek()] -= 1;
                }else{
                    h[i] = 0;
                    h[st.pop()] = 0;
                }
            }
        }
        
        List<Integer> res = new ArrayList<>();
        for(int v : h) {
            if (v > 0) {
                res.add(v);
            }
        }
        
        return res;
    }
}