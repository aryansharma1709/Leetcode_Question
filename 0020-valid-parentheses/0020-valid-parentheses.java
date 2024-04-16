class Solution {
    public boolean isValid(String s) {
        if(s.length()==1)
        return false;
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            char e =s.charAt(i);
            if(e=='(' ||e=='{' || e=='[')
            st.push(e);
            else if(!st.isEmpty() && (e-st.peek()==1 || e-st.peek()==2)){
               
                st.pop();
            }
           else 
           return false;
        }
        return st.isEmpty();
    }
}