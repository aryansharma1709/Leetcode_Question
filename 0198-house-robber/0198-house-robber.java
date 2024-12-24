class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
      int dp[]=new int[n];
      Arrays.fill(dp,-1);
      return maxLoot(dp,nums);
    }
    public int maxLoot(int []dp,int[]arr)
    {
        dp[0]=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            dp[i]=Math.max((arr[i]+((i-2<0)?0:dp[i-2])),dp[i-1]);
        }
        
        return dp[dp.length-1];
    }
}