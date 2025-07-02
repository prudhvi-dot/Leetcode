class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int count = 0;

        Arrays.sort(intervals,(a,b)->Integer.compare(a[1],b[1]));

        int[] prev = intervals[0];

        for(int i = 1; i<intervals.length; i++) {
            if(intervals[i][0]>=prev[1]) {
                prev = intervals[i];
            }else {
                count++;
            }
        }

        return count;
    }
}