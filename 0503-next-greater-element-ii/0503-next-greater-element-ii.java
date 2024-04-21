class Solution {
    public int[] nextGreaterElements(int[] n) {
        int [] ans=new int[n.length];
        Stack<Integer> st=new Stack<>();
       for(int i=2*n.length-1;i>=0;i--)
       {
        while(!st.isEmpty() && n[i%n.length]>=st.peek())
        {
            st.pop();
        }
        if(!st.empty()&& n[i%n.length]<st.peek())
        {
            ans[i%n.length]=st.peek();
            st.push(n[i%n.length]);
            
        }
        else if(st.isEmpty())
        {
            st.push(n[i%n.length]);
            ans[i%n.length]=-1;
        }
       }
       return ans;
    }
}