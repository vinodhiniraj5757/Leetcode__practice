class Solution {
    public int reverse(int x) {
        int a=0;
        int rev=0,b=0;
        if(x>0)
        {
           a=x;
        }
        else
        {
            a=(-1)*x;
        }
        while(a>0)
        {
            b=a%10;
             if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && b> 7))
                return 0;
            
            rev=(rev*10)+b;
            a=a/10;
        }
        if(x>0)
        return rev;
        else
        return -rev;
        
    }
}