class Solution {
    public int minSwaps(String s) {
        Stack<Character> st=new Stack<>();
    
        for(int i=0;i<s.length();i++)
        {
            char d=s.charAt(i);
            if(!st.isEmpty() && d==']')
            { 
                st.pop();
            }
            if(d=='[')
             st.push(d);
        }
        return (int)Math.ceil(st.size()/(double)2);
    }
}