class Solution {
    public int pivotIndex(int[] nums) {
        int ls=0,sum=0;
        for(int i=0;i<nums.length;i++)
        {
            sum=sum+nums[i];
        }
        int rs=sum;
        for(int i=0;i<nums.length;i++)
        {
            int c=nums[i];
            rs=rs-c;
            if(ls==rs)
            {
                return i;
            }
            ls=ls+nums[i];
        }
        return -1;
        
    }
}