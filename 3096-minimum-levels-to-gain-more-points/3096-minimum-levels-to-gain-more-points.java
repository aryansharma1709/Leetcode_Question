class Solution {
    public int minimumLevels(int[] p) {
        int sum=0;
      for(int i=0;i<p.length;i++)
      {
          
          if(p[i]==0)
              sum-=1;
           else
               sum+=1;
      }
        int sum_d=0;
        int c=0;
       for(int i=0;i<p.length-1;i++)
       {
           c+=1;

           if(p[i]==0)
           {   
               sum_d-=1;   
           }
           else
           {
               sum_d+=1;
           }
           
           if(sum_d>sum-sum_d)
               break;
       }
        
        if(sum-sum_d>=sum_d)
            return -1;
        return c;
    }
}