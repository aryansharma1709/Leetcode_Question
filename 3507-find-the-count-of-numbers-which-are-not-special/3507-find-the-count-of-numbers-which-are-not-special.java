class Solution {
    public int nonSpecialCount(int l, int r) {
        int c=specialCount((int)Math.sqrt(r),l);
    
        return((r+1-l)-c);
    }
    public int specialCount(int n ,int s)
    {
      int [] a=new int [n+1];
 
           for(int j=2;j*j<=n;j++)
           {
              if(a[j]==0)
              {
                for(int k=j*j ;k<=n;k+=j)
                {
                    a[k]=1;
                }
              }
           }
       int c=0;
       for(int i=2;i<=n;i++)
       {
        if(a[i]==0 && i*i>=s)
        {
           
            c+=1;
        }
       }
       return c;
    }
}