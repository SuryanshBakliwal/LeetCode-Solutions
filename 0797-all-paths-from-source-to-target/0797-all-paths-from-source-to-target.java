class Solution {
    
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> psf = new ArrayList<>();
        psf.add(0);
        dfs(0, graph.length-1, graph, psf, ans);
        return ans;
    }
    void dfs(int src, int destination, int[][] graph, List<Integer> psf, List<List<Integer>> ans){
        if(src == destination){
            ans.add(new ArrayList<Integer>(psf));
            return;
        }
        
        for(int i : graph[src]){
            psf.add(i);
            dfs(i, destination, graph, psf, ans);
            psf.remove(psf.size()-1);
        }
    }
    
}