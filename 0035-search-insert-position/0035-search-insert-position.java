class Solution {
    public int searchInsert(int[] nums, int target) {
    
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==target){
               
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
        else
        return nums.length;
        
    }
}