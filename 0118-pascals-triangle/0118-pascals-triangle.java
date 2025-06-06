class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>>a=new ArrayList<>();
       
        for(int i=0;i<numRows;i++)
        {
             int num=1;
            List<Integer>b=new ArrayList<>();
            for(int j=0;j<=i;j++)
            {
                b.add(num);
                num=num*(i-j)/(j+1);
            }
            a.add(b);
        }
        return a;
        
    }
}