class Solution {
    public int[] productExceptSelf(int[] nums) {
        int sum[]=new int[nums.length];
        // for(int i=0;i<nums.length;i++)
        // {
        //     int c=1;
        //     for(int j=0;j<nums.length;j++)
        //     {
        //         if(i!=j)
        //         {
        //            c=c*nums[j];
        //         }
        //     }
        //     sum[i]=c;

        // }
        // return sum;
        sum[0]=1;
        for(int i=1;i<nums.length;i++)
        {
            sum[i]=sum[i-1]*nums[i-1];
        }
        int c=1;
        for(int i=nums.length-1;i>=0;i--)
        {
            sum[i]=sum[i]*c;
            c=c*nums[i];
        }
        return sum;

    }
}