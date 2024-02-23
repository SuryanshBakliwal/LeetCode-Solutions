class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        if(source == destination){
            return true;
        }
        
        Map<Integer, List<Integer>> graph = new HashMap<>();
        boolean []visited = new boolean[n];
        for(int i=0; i<n; i++) graph.put(i, new ArrayList<>());
        for(int[] edge : edges){
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
        }
        boolean found = hasPath(graph, source, destination, visited); //DFS
        return found;
    }
    
    boolean hasPath(Map<Integer, List<Integer>> graph, int source, int destination, boolean[] visited){
        if(source == destination) return true;
        if(visited[source] == false) visited[source] = true;
        for(int nei : graph.get(source)){
            if(visited[nei] == false){
                boolean hasPathExist = hasPath(graph, nei, destination, visited);
                if(hasPathExist == true ) return true;
            }
            
        }
        return false;
    }
}