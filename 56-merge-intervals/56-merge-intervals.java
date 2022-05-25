class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        LinkedList<int[]> merged = new LinkedList<>();
        for (int[] interval : intervals) {
            if (merged.isEmpty() || merged.getLast()[1] < interval[0]) {
                merged.add(interval);
            }
            else {
                merged.getLast()[1] = Math.max(merged.getLast()[1], interval[1]);
            }
        }
        return merged.toArray(new int[merged.size()][]);
    }
}


// class Solution {
//     public int[][] merge(int[][] intervals) {
//          if(intervals.length==1)
//             return intervals;
//         int[][] ar=new int[intervals.length][2];
//         int k=0;
//         if(intervals[0][1]>intervals[1][0]){
//                ar[k]=new int[]{intervals[0][0],Math.max(intervals[0][1],intervals[1][1])};
//                k++;
//         }
//         else if(intervals[0][1]==intervals[1][0]){
//                ar[k]=new int[]{intervals[0][0],intervals[1][1]};
//                k++;
//         }
//         else
//         {
//             ar[k]=intervals[0];
//             k++;
//         }
//         for(int i=2;i<intervals.length;i++)
//         {
//            if(intervals[i-1][1]>intervals[i][0]){
//                ar[k]=new int[]{intervals[i-1][0],Math.max(intervals[i-1][1],intervals[i][1])};
//                k++;
//             }
//             else if(intervals[i-1][1]==intervals[i][0]){
//                ar[k]=new int[]{intervals[i-1][0],intervals[i][1]};
//                k++;
//             }
//             else
//             {
//                 ar[k]=intervals[i];
//                 k++;
//             }
//         }
//         return Arrays.copyOfRange(ar, 0,k);
//     }
// }