class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int a=mat.length;
        int b=mat[0].length;
        int v[]=new int[a*b];
        int r=0,c=0,d=1;
        for(int i=0;i<v.length;i++)
        {
            v[i]=mat[r][c];
            if(d==1)
            {
                if(c==b-1)
                {
                    r++;
                    d=-1;
                }
                else if(r==0)
                {
                    c++;
                    d=-1;
                }
                else
                {
                    r--;
                    c++;
                }
            }
                else
                {
                    if(r==a-1)
                    {
                        c++;
                        d=1;
                    }
                    else if(c==0)
                    {
                        r++;
                        d=1;
                    }
                    else
                    {
                        r++;
                        c--;
                    }
                }
            

        }
        return v;
        
    }
}