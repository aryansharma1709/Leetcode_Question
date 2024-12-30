class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m=obstacleGrid.length;
        int n=obstacleGrid[0].length;
        int dp[][]=new int[m][n];
       
        return countPath(dp, obstacleGrid);
    }
    public int countPath(int [][]dp ,int[][]arr){
       
         dp[0][0]=1;
         for(int i=0;i<dp.length;i++)
         {
            for(int j=0;j<dp[0].length;j++)
            {
                if(arr[i][j]==1)
                { dp[i][j]=0;
                   continue;
                }
               if(i==0 && j==0)
               {
                dp[0][0]=1;
                continue;
               }
                int down=0;
                if(i>0)
                down= dp[i-1][j];
                int right=0;
                if(j>0)
                right=dp[i][j-1];
                dp[i][j]=down +right;
                
            }
         }
         return dp[dp.length-1][dp[0].length-1];
    }
}