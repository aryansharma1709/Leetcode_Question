class Solution {
    public int uniquePaths(int m, int n) {
        int dp[][]=new int[m][n];
        for(int row[]:dp)
        Arrays.fill(row,-1);
        return countPath(dp,m-1,n-1);
    }
    public int countPath( int [][]dp, int i,int j)
    {
        if(i<0 || j<0) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        if(i==0 && j==0) return 1;
        return dp[i][j]=(countPath(dp,i-1,j)+countPath(dp,i,j-1));
    }
}