class Solution {
    public int[][] merge(int[][] intervals) {
         if (intervals.length==0) {
            return new int[0][];
        }
        Arrays.sort(intervals,(a, b)->Integer.compare(a[0],b[0]));
        List<int[]> a=new ArrayList<>();
         for (int i=0;i<intervals.length;i++) {
            if (a.isEmpty()||a.get(a.size()-1)[1]<intervals[i][0]) {
                a.add(intervals[i]);
            } else {
                a.get(a.size()-1)[1]=Math.max(a.get(a.size()-1)[1],intervals[i][1]);
            }
        }
        return a.toArray(new int[a.size()][]);
        
    }
}