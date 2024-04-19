class Solution {
    public int countStudents(int[] s, int[] sd) {
        Deque<Integer> d=new ArrayDeque<>();
        Stack<Integer> st=new Stack<>();
        for(int i= sd.length-1;i>=0;i--)
       { st.push(sd[i]);
        d.addFirst(s[i]);
        }
       int i=0;
       while(!st.isEmpty() && !d.isEmpty())
       {
          if(!st.isEmpty() && !d.isEmpty() && st.peek()==d.peekFirst())
          {
             st.pop();
             d.removeFirst();
             i=0;
          }
          else 
          {
            d.addLast(d.pollFirst());
            i++;
          }
          if(!d.isEmpty() && i>d.size())
           return d.size();
       }
        return 0;
    }
}