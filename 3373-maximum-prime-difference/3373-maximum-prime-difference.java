class Solution {
    public int maximumPrimeDifference(int[] nums) {
        if(nums.length==1)
            return 0;
        int c1=-1;
        int c2=0;
        for(int i=0;i<nums.length;i++)
        {
            if(isprime(nums[i]))
            {
                if(c1==-1)
                    c1=i;
                else if(c2<i)
                   c2=i;
            }
        }
        if(c2==0)
            c2=c1;
        return c2-c1;
    }
    public boolean isprime(int n)
    {
        if(n==1)return false;
        if(n==2 || n==3) return true;
        if(n%2==0 || n%3==0)return false;
        for(int i=5;i*i<=n;i=i+6)
        {
            if(n%i==0 ||n%(i+2)==0)
                return false;
        }
        return true;
    }
}