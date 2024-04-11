class Solution {
    public int minEatingSpeed(int[] p, int h) {
        int max=0;
        int sum=0;
        for(int i=0;i<p.length;i++)
        {
            if(p[i]>max)
            {
                max=p[i];
            }
        }
        int s=1;
        int e=max;
        int ans=Integer.MAX_VALUE;
        while(s<=e)
        {
            int mid=(s+e)/2;
            int total_hr= finda(p,mid);
    
             if(total_hr<=h)
            {
                if(ans>mid)
                {
                    ans=mid;
                }
                e=mid-1;
            }
            else
            {
                s=mid+1;
            }
        }
        return ans;
    
    }
    public int finda(int[]p,int mid)
    {
       int t=0;
       double c=0;
        for(int i=0;i<p.length;i++)
        {
           c=Math.ceil(p[i]/(double)mid);
           t+=c;
        }
        return t;
    }
}