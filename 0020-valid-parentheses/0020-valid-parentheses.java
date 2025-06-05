class Solution {
    public boolean isValid(String s) {

        char [] stack=new char[s.length()];
        int top=-1;
        boolean a=true;
        if(s.length()==1)
        return false;
        for(int i=0;i<s.length();i++)
        {
            char v=s.charAt(i);
            if(v=='('||v=='{'||v=='[')
            stack[++top]=v;
            else if(v==')'||v=='}'||v==']')
            {
                if(top==-1)
                {
                    a=false;
                    break;
                }
                char n=stack[top--];
                if(v==')' && n!='('||v=='}' && n!='{' || v==']' && n!='[')
                {
                    a=false;
                    break;
                }
            }
        }
        if(top==-1 && a)
        {
            return true;
        }
        else 
        return false;
        
    }
}