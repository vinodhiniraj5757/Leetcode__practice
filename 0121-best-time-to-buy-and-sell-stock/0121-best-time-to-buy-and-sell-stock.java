class Solution {
    public int maxProfit(int[] prices) {
        int max=prices[0];
        int min=0;
        for(int i=1;i<prices.length;i++)
        {
            if(prices[i]<max)
            {
                max=prices[i];
            }
            int p=prices[i]-max;
            if(p>min)
            {
                min=p;
            }
            
        }
        return min;
        
    }
}