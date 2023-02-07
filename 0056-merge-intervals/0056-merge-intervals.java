class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length <= 1) return intervals;
        // Sorting
        Arrays.sort(intervals, (i1, i2) -> Integer.compare(i1[0], i2[0]));
        List<int[]> list = new ArrayList<>();
        int[] newInterval = intervals[0];
        list.add(newInterval);
        for(int[] interval : intervals){
            if(newInterval[1] >= interval[0]){
                // it means there is an overlapping
                newInterval[1] = Math.max(newInterval[1], interval[1]);
            }else{
                newInterval = interval;
                list.add(newInterval);
            }
        }
        
        return list.toArray(new int[list.size()][]);
    }
}