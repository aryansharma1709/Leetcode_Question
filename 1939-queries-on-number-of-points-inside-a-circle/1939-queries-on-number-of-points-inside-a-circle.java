class Solution {
    public int[] countPoints(int[][] p, int[][] q) {
        int[] ans= new int[q.length];
        int c=0;
        for(int i=0;i<q.length;i++)
        {
            for(int j=0;j<p.length;j++)
            {
                int check= (int)Math.pow(q[i][0]-p[j][0],2)+(int)Math.pow(q[i][1]-p[j][1],2);
                if(check<=q[i][2]*q[i][2])
                {
                    c+=1;
                }
            }
            ans[i]=c;
            c=0;
        }
        return ans;
    }
}