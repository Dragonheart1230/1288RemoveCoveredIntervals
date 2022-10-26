//Not currently working
class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        int intervalCount = 0;
        for(int i = 0; i<intervals.length&&intervals[i] != null; i++){
            for(int k = i; k<intervals.length; k++){
                System.out.println(intervals[i]);
                if(intervals[k][0] <= intervals[i][0] && intervals[k][1] <= intervals[i][1]){
                    intervalCount += 1;
                    intervals[i] = null;
                    break;
                }
            }
        }
        return intervalCount;
    }
}