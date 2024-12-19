class Solution {
    public int longestSubarray(int[] nums, int limit) {
        Deque<Integer> maxDeque = new ArrayDeque<>();
        Deque<Integer> minDeque = new ArrayDeque<>();
        int R=0, L=0, res=0;
        while(R < nums.length){
            // update maxDeque
            while(!maxDeque.isEmpty() && maxDeque.peekLast() < nums[R]) maxDeque.removeLast();
            maxDeque.addLast(nums[R]);
            while(!minDeque.isEmpty() && minDeque.peekLast() > nums[R]) minDeque.removeLast();
            minDeque.addLast(nums[R]);
            while(maxDeque.peekFirst() - minDeque.peekFirst() > limit){
                if(maxDeque.peekFirst() == nums[L]) maxDeque.pollFirst();
                if(minDeque.peekFirst() == nums[L]) minDeque.pollFirst();
                L++;
            }
            res = Math.max(R-L+1, res);
            R++;
        }
        return res;
    }
}