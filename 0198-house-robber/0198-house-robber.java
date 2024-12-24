class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
      int dp[]=new int[n];
      Arrays.fill(dp,-1);
      return maxLoot(dp,nums,n-1);
    }
    public int maxLoot(int []dp,int[]arr,int idx)
    {
        if(idx==0) return arr[idx];
        if(idx<0) return 0;
        if(dp[idx]!=-1) return dp[idx];
        return dp[idx]=Math.max(arr[idx]+maxLoot(dp,arr,idx-2),0+maxLoot(dp,arr,idx-1));
    }
}