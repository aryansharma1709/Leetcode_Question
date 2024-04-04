class Solution {
    public String smallestNumber(String p) {
        int ans[]= new int[p.length()+1];
        int count =1;
        Stack<Integer> st=new Stack<Integer>();
        for(int i=0;i<=p.length();i++)
        {
            if(i==p.length() || p.charAt(i)=='I')
            {
                ans[i]=count;
                count++;
            
            while(!st.isEmpty())
            {
                ans[st.pop()]=count;
                count++;
            }
            }
            else
            {
                st.push(i);
            }
        }
        String str="";
        for(int i=0;i<ans.length;i++)
        {
            str+=ans[i];
        }
        return str;
    }
}