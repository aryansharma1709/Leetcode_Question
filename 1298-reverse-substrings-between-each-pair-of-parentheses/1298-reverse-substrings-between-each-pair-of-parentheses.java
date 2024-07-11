class Solution {
    public String reverseParentheses(String s) {
      Stack<Character> st=new Stack<>();
      int i=0;
      while(i<s.length())
      {
        if(s.charAt(i)==')')
         {
             StringBuilder str=new StringBuilder();  
             while(!st.isEmpty() && st.peek()!='(')
              {
                 str.append(st.pop());
              }
             if (!st.isEmpty() && st.peek() == '(')
                {
                    st.pop();
                }

                 for(int j=0;j<str.length();j++)
                 {
                   st.push(str.charAt(j));
                 }
         }
         else
        st.push(s.charAt(i));
        i++;
      }
      StringBuilder str1 = new StringBuilder();
      while (!st.isEmpty())
      {
            str1.append(st.pop());
      } 
        return str1.reverse().toString();
    }
}