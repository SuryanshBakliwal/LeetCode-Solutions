class Solution {
    public int findTheWinner(int n, int k) {
        LinkedList<Integer> player = new LinkedList<>();
        for(int i=1; i<=n; i++) player.add(i);
        int lastPlayerRemoved = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<k-1; j++){
                player.add(player.poll());
            }
            lastPlayerRemoved = player.poll();
        }
        return lastPlayerRemoved;
    }
}