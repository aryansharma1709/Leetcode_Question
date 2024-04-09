class Solution {
    public int[] twoSum(int[] n, int t) {
       int i=0;
       int j=n.length-1;
       int []a= new int[2];
       if(n[i]+n[i+1]==t)
       {
        a[0]=1;
        a[1]=2;
        return a;
       }
       while(i<j)
       {
         if(n[i]+n[j]==t)
          {
            a[0]=i+1;
            a[1]=j+1;
            return a;
          }
          else if((n[i]<t && n[j]<t)&&(t-n[i] >n[j]))
          {
            i++;
          }
          else if((n[i]<t && n[j]<t)&&(t-n[i] <n[j]))
          {
            j--;
          }
          else if((n[i]>0 && n[i]>t) ||(n[i]<0 && t>=0))
          {
            i++;
           
          }
          else 
          {
            j--;
          }
          if(t-n[i]>t && n[j]>t)
         { 
           j--;
         }
       }
       return a;
    }
}