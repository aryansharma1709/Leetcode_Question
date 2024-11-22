class Solution {
    public int maxEqualRowsAfterFlips(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        int ans=1;
        Map<String ,Integer> map=new HashMap<>();
        for(int i=0;i<m;i++)
        {
            if(matrix[i][0]==1){
            for(int j=0;j<n;j++)
            {
                
                matrix[i][j]=1-matrix[i][j];
            }
            }
            map.put(Arrays.toString(matrix[i]),map.getOrDefault(Arrays.toString(matrix[i]),0)+1);
        }
     for(String key:map.keySet())
     {
        Integer value=map.get(key);
         ans=Math.max(ans,value);
     }
     return ans;
    }
}