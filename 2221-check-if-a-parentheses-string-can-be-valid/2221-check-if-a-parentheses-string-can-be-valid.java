class Solution {
    public boolean canBeValid(String s, String locked) {
        int n=s.length();
        if(n==1 || n%2!=0) return false;
        if(s.charAt(n-1)=='(' && locked.charAt(n-1)=='1') return false;
        else if(s.charAt(0)==')' && locked.charAt(0)=='1') return false;
        int lock=0;
        int unlock=0;
        // forward checking
        for(int i=0;i<n;i++)
        {
            if(locked.charAt(i)=='1')
            {
                if(s.charAt(i)=='(')lock++;
                else lock--;
            }
            else
            {
                unlock++;
            }
         if(lock<-unlock) return false;
        }
        // backward checking
        lock=0;
        unlock=0;
        for(int i=n-1;i>=0;i--)
        {
           if(locked.charAt(i)=='1')
            {
                if(s.charAt(i)==')')lock++;
                else lock--;
            }
            else
            {
                unlock++;
            }  
        if(lock<-unlock) return false;
        }
        return true;
    }
}