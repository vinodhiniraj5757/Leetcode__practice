class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
       boolean v[]=new boolean[nums2.length];
        int a=0;
      
        ArrayList<Integer>b=new ArrayList<>();
        for(int i=0;i<nums1.length;i++)
        {
            for(int j=0;j<nums2.length;j++)
            {
                if(nums1[i]==nums2[j] && v[j]!=true)
                {
                   b.add(nums1[i]);
                   
                    v[j]=true;
                    break;
                    
                }
            }
        }

           int bo[]=new int[b.size()];
        for(int i:b)
        {
            bo[a++]=i;
        }
        return bo;
        
    }
}