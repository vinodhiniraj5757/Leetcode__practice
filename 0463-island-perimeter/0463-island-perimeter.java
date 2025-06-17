class Solution {
    public int islandPerimeter(int[][] grid) {
        int co=0;
        // boolean b[]=new boolean[grid.length];
        // boolean c[]=new boolean[grid[0].length];
        for(int i=0;i<grid.length;i++)
        {
            
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]==1)
                {
                    co=co+4;
                     if (i >0 && grid[i - 1][j] == 1) 
                        co -= 2;
                    if (j > 0 && grid[i][j - 1] == 1) 
                        co -= 2;
                    
                }
            }
            
           
        }
       
        return co;
 
       
        
    }
}