class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m=obstacleGrid.length;
        int n=obstacleGrid[0].length;
        int dp[][]=new int[m][n];
        for(int row[]:dp)
        Arrays.fill(row,-1);
        return countPath(dp, obstacleGrid,m-1,n-1);
    }
    public int countPath(int [][]dp ,int[][]arr,int i,int j){
          if(i<0|| j<0)return 0;
         if(arr[i][j]==1)return 0;
         if(dp[i][j]!=-1) return dp[i][j];
         if(i==0 && j==0) return 1;
         return dp[i][j]=(countPath(dp,arr,i-1,j)+countPath(dp,arr,i,j-1));
    }
}