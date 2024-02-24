class Solution {
    public int makeConnected(int n, int[][] connections) {
        if(connections.length < n-1) return -1;
        HashMap<Integer, List<Integer>> graph = new HashMap<>();
        for(int i=0; i<n; i++) graph.put(i, new ArrayList<>());
        for(int i[] : connections){
            graph.get(i[0]).add(i[1]);
            graph.get(i[1]).add(i[0]);
        }
        boolean visited[] = new boolean[n];
        int connectPath = 0;
        for(int i=0; i<n; i++){
            connectPath += dfs(graph, visited, i);
        }
        // System.out.println(connectPath + " " + i);
        // if(connectPath < n) return -1;
        return connectPath - 1;
    }
    
    int dfs(HashMap<Integer, List<Integer>> graph, boolean[] visited, int src){
        if(visited[src] == true){
            return 0;
        }
        visited[src] = true;
        for(int nei : graph.get(src)){
            dfs(graph, visited, nei);
        }
        return 1;
    }
}