class Solution {
    public boolean isPalindrome(String s) {
        // String a[]=s.split(",");
        String t="";
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(Character.isLetterOrDigit(c))
            t=t+Character.toLowerCase(c);
        }
        StringBuilder v=new StringBuilder(t);
        v=v.reverse();
         return t.equals(v.toString());
        
    }
}