class Solution {
    public int pivotIndex(int[] nums) {
        int ls=0,sum=0;
        for(int i=0;i<nums.length;i++)
        {
            sum=sum+nums[i];
        }
        for(int i=0;i<nums.length;i++)
        {
            int c=nums[i];
            sum=sum-c;
            if(ls==sum)
            {
                return i;
            }
            ls=ls+nums[i];
        }
        return -1;
        
    }
}