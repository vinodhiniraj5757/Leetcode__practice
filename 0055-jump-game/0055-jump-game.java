class Solution {
    public boolean canJump(int[] nums) {
        if(nums.length==1)
        return true;
        int n=nums.length-1;
        int c=0;
        for(int i=0;i<nums.length;i++)
        {
            if(i>c)
            return false;
              c = Math.max(c, i + nums[i]);
        }
        return true;
        
    }
}