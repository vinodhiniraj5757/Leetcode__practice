class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer>aa=new Stack<>();
        for(String s:tokens)
        {
            if(s.equals("+")||s.equals("-")||s.equals("*")||s.equals("/"))
            {
                int a=aa.pop();
                int b=aa.pop();
                int res=0;
                switch(s)
                {
                    case "+":res=a+b;break;
                    case "-":res=b-a;break;
                    case "*":res=a*b;break;
                    case "/":res=b/a;break;
                }
                 aa.push(res);
            }
            else
            {
                aa.push(Integer.valueOf(s));
            }
           
        }
        return aa.peek();
        
    }
}