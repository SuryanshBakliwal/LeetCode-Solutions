class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean [] unlockRoom = new boolean[rooms.size()];
        unlockRoom[0] = true;
        dfs(rooms, 0, unlockRoom);
        for(int i=0; i<unlockRoom.length; i++){
            if(unlockRoom[i] != true) return false;
        }
        return true;
    }
    
    public boolean dfs(List<List<Integer>> graph, int room, boolean[] unlockRoom){
        unlockRoom[room] = true;
        for(int key : graph.get(room)){
            if(unlockRoom[key] != true)
                dfs(graph, key, unlockRoom);
            
        }
        return false;
    }
}