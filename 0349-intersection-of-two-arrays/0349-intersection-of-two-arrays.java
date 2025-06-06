class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
        HashSet<Integer>a=new HashSet<>();
        HashSet<Integer>b=new HashSet<>();
    
        for(int i:nums1)
        {
            a.add(i);
        }
        for(int j:nums2)
        {
            if(a.contains(j))
             b.add(j);
        }
        int res[]=new int[b.size()];
        int i=0;
        for(int k:b)
        {
            res[i++]=k;
        }
        return res;
        
    }
}