class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int r=mat.length;
        int c=mat[0].length;
        int ro[][]=new int[r][c];
         for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                ro[i][j]=Integer.MAX_VALUE- 100000;;
            }
        }

        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(mat[i][j]==0)
                ro[i][j]=0;

                else
                {
                    if(i>0)
                    {
                        ro[i][j]=Math.min(ro[i][j],ro[i-1][j]+1);
                    }
                    if(j>0)
                    {
                        ro[i][j]=Math.min(ro[i][j],ro[i][j-1]+1);
                    }
                }
            }
        }

        for(int i=r-1;i>=0;i--)
        {
            for(int j=c-1;j>=0;j--)
            {
                if(i<r-1)
                {
                    ro[i][j]=Math.min(ro[i][j],ro[i+1][j]+1);
                }
                if(j<c-1)
                {
                    ro[i][j]=Math.min(ro[i][j],ro[i][j+1]+1);
                }

            }
        }
        return ro;
        
    }
}