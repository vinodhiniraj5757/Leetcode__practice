class Solution {
    public List<Integer> getRow(int rowIndex) {

        List<Integer>a=new ArrayList<>();
        for(int i=0;i<=rowIndex;i++)
        {
            long num=1;
            for(int j=0;j<=i;j++)
            {
                if(i==rowIndex)
                {
                     a.add((int)num);
                    num=num*(i-j)/(j+1);
                   
                }
            }
        }
        return a;
        
    }
}