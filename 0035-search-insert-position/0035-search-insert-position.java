class Solution {
    public int searchInsert(int[] nums, int target) {
        int c=0,d=1;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==target){
                c=1;
               return i;
            
            }

        }
            for(int i=1;i<nums.length;i++)
            {
                if(nums[i-1]<target && nums[i]>target)
                {
                    
                   return i;
                }

            }
        if(nums[0]>target)
        return 0;

        return nums.length;
        
    }
}