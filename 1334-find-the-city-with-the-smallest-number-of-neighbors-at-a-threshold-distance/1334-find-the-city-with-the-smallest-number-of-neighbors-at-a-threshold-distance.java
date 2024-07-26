class Solution {
    public int findTheCity(int n, int[][] edges, int distanceThreshold) {
        // HashMap<Integer, List<int[]>> graph = new HashMap<>();
        // for(int i=0; i<n; i++) graph.put(i, new ArrayList<>());
        // for(int []edge : edges){
        //     graph.get(edge[0]).add(new int[]{edge[1], edge[2]});
        //     graph.get(edge[1]).add(new int[]{edge[0], edge[2]});
        // }
        int res=0, smallest=n;
        int[][] dis = new int[n][n];
        for(int row[] : dis)    Arrays.fill(row, 10001);
        for(int e[] : edges)    dis[e[0]][e[1]] = dis[e[1]][e[0]] = e[2];
        for(int i=0; i<n; i++)
            for(int j=0; j<n; j++)
                if(i == j) dis[i][j] = 0;
        for(int k=0; k<n; k++)
            for(int i=0; i<n; i++)
                for(int j=0; j<n; j++)
                    dis[i][j] = Math.min(dis[i][j], dis[i][k] + dis[k][j]);
        for(int i=0; i<n; i++){
            int count=0;
            for(int j=0; j<n; j++){
                if(dis[i][j] <= distanceThreshold)  count++;
            }
            if(smallest >= count){
                res = i;
                smallest = count;
            }
        }
        return res;
    }
}