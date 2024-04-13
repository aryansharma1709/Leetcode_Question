class Solution {
    public int maximumCandies(int[] c, long k) {
        long sum=0;
        for(int x:c)
        sum+=x;
        if(sum<k)
        return 0;
        else if(sum==k)
            return 1;
        long s=1;
        long e=sum/k;
        long ans=0;
        while(s<=e)
        {
            long mid=s+(e-s)/2;
            System.out.println(mid);
            if(isPossible(c,k,mid))
            {
              if(ans<mid)
              ans=mid;
              s=mid+1;
            }
            else{
                e=mid-1;
            }
        }
        return (int)ans;
    }
    public boolean isPossible(int[]c,long k,long mid)
    {
        long children=0;
        for(int i=0;i<c.length;i++)
        {
            children+=(c[i]/mid);
        }
        if(children>=k)
        return true;
        return false;
    }
}
