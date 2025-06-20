class Solution {
    double fractionalKnapsack(int[] values, int[] weights, int W) {
        // code here
        int n=values.length;
        double[][] items=new double[n][2];
        for(int i=0;i<n;i++){
            items[i][0]=(double)values[i]/weights[i];
            items[i][1]=i;
        }
        java.util.Arrays.sort(items,(a,b)->Double.compare(b[0],a[0]));
        double total=0.0;
        for(int i=0;i<n&&W>0;i++){
            int idx=(int)items[i][1];
            if(weights[idx]<=W){
                total+=values[idx];
                W-=weights[idx];
            }else{
                total+=items[i][0]*W;
                break;
            }
        }
        return total;
    }
}
