class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int a[]=new int[m+n];
        for(int i=0;i<m;i++)
        {
            nums1[i]=nums1[i];
        }
        int k=m;
        for(int i=0;i<n;i++)
        {
            nums1[k++]=nums2[i];
        }
        Arrays.sort(nums1);
        
    }
}