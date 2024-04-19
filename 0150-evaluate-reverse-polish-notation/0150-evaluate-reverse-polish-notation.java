class Solution {
    public int evalRPN(String[] t) {
        Stack<Long> st=new Stack<>();
        for(int i=0;i<t.length;i++)
        {
            if(!t[i].equals("+") && !t[i].equals("-")  && !t[i].equals("*")  && !t[i].equals("/") )
            {
                long c=Integer.parseInt(t[i]);
               st.push(c);
            }
            else if(!st.isEmpty() && st.size()>=2){
                Long a=st.pop();
                long b=st.pop();
                if(t[i].equals("+"))
                {
                    st.push(a+b);
                }
                else if(t[i].equals("-"))
                {
                    st.push(b-a);
                }
                else if(t[i].equals("*"))
                {
                    st.push(a*b);
                }
                else if(a!=0)
                {
                    st.push(b/a);
                }
            }
          
        }
       
        return st.pop().intValue();
    }
}