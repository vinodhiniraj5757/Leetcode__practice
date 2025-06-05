import java.util.*;
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

       ArrayList<Integer> list=new ArrayList<>();
        int rowb=0,rowe=matrix.length-1;
        int colb=0,cole=matrix[0].length-1;
        while(rowb<=rowe && colb<=cole)
        {
            for(int i=colb;i<=cole;i++)
            {
                list.add(matrix[rowb][i]);
            }
            rowb++;
            for(int j=rowb;j<=rowe;j++)
            {
                list.add(matrix[j][cole]);
            }
            cole--;
            if(rowb<=rowe)
            {
                for(int i=cole;i>=colb;i--)
                {
                    list.add(matrix[rowe][i]);
                }
                rowe--;
            }
            if(colb<=cole)
            {
                for(int i=rowe;i>=rowb;i--)
                {
                    list.add(matrix[i][colb]);
                }
                colb++;
            }
        }
        return list;
        
    }
}