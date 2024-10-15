class Solution {
    public boolean isValid(String s) {
        Stack <Character> st=new Stack<>();
        int i=0;
        while(i<s.length())
        {
            if(!st.isEmpty() && (s.charAt(i)==')' || s.charAt(i)=='}' || s.charAt(i)==']'))
            {
                int r=st.pop();
            
                  if(!(s.charAt(i)-r==1 ||s.charAt(i)-r==2))return false;     
            }
            else
            {
             st.push(s.charAt(i));
            }
            i++;
        }
         return st.isEmpty();
    }
}