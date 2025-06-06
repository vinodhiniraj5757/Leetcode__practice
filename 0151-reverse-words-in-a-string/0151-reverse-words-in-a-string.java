class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        String a[]=s.split("\\s+");
        String ss="";
      for(int i=a.length-1;i>=0;i--)
      {
        if(i!=0)
          ss=ss+a[i]+" ";
        else
           ss=ss+a[i];

        
      }
      return ss;

        
    }
}