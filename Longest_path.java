class Solution {
    int [][] d={{1,0},{-1,0},{0,1},{0,-1}};
    public int longestIncreasingPath(int[][] matrix) {
        if(matrix==null ||matrix.length==0)
        return 0;
        int n=matrix.length;
        int lp=0;
        int m=matrix[0].length;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                int p=search(matrix,n,m,i,j);
                lp=Math.max(p,lp);
            }
        }
        return lp;      
    }

    public int search(int [][] matrix,int m,int n,int i,int j)
    {
       int max=0;
       for(int []v:d)
       {
        int x=i+v[0],y=j+v[1];
        if(x>=0 && y>=0 && x<m && y<n && matrix[x][y]>matrix[i][j])
        {
            max=Math.max(max,search(matrix,m,n,x,y));
        }
       }
        return max+1;
    }
   
}
