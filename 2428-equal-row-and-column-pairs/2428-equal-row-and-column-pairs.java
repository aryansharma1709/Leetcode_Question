class Solution {
    public int equalPairs(int[][] grid) {
        int n=grid.length;
        String[] a=new String[n];
        String[] b=new String[n];
        String str1;
        String str2;
        for(int i=0;i<n;i++)
        {
            str1="";
            str2="";
           for(int j=0;j<n;j++)
           {
             str1+=(grid[i][j]+",");
             str2+=(grid[j][i]+",");
           }
           a[i]=str1;
           b[i]=str2;
        }
        int c=0;
      for(String i:a)
      {
            for(String j:b)
            {
                if(i.equals(j))
                c++;
            }
       }
       
       return c;
    }
}