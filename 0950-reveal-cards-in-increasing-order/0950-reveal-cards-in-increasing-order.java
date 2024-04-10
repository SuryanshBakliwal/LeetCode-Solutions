class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        if(deck.length == 1) return deck;
        Arrays.sort(deck);
        int ans[] = new int[deck.length];
        Queue<Integer> q = new LinkedList<>();
        for(int i=0; i<deck.length; i++) q.add(i);
        for(int i=0; i<deck.length; i++){
            ans[q.peek()] = deck[i];
            q.remove();
            if(q.size() != 0){
                int n = q.remove();
                q.add(n);
            }
        }
        return ans;
    }
}