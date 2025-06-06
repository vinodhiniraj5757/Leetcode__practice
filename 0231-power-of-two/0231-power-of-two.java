class Solution {
    public boolean isPowerOfTwo(int n) {
        long c=0;
        int i=0;
        while(c<=n &&i<=31)
        {
            c=(long)Math.pow(2,i);
            if(c==n)
            {
              return true;
            }
           

            i++;
        }
        return false;
    }
}