class Solution {
    public int climbStairs(int n) {
        int[]dp=new int[n+1];
         Arrays.fill(dp,-1);
       return stair(n,dp);
    }
    public int stair(int n,int[]dp)
    {
        if(n==0 || n==1) return 1;
        if(dp[n]!=-1) return dp[n];
        return dp[n]=stair(n-1,dp)+stair(n-2,dp);
    }
}