class Solution {
    public int shipWithinDays(int[] w, int d) {
        int sum=0;
        int min=Integer.MIN_VALUE;
        for(int i=0;i<w.length;i++)
        {
            sum+=w[i];
            min=Math.max(min,w[i]);
        }
        int s=min;
        int e=sum;
        
        while(s<=e)
        {
            int mid=(s+e)/2;
            int n=isLoaded(mid,w);
            if(n<=d)
            {
                
                e=mid-1;
            }
            else
            {
                s=mid+1;
            }
        }
        return s;
   }
   public int isLoaded(int mid,int[]w){
       int sum=0;
       int c=1;
       int i=0;
     while(i<w.length)
      {
         
         if(sum+w[i]>mid)
         {
           c++;
           sum=w[i];  
         }
         else{
             sum+=w[i];
         }
         i++;
      }
      return c;
   }
}