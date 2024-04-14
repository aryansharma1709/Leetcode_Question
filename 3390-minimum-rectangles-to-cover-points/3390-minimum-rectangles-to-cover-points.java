class Solution {
    public int minRectanglesToCoverPoints(int[][] p, int w) {
 Arrays.sort(p, Comparator.comparingInt(a -> a[0]));
        int count = 0;
        int j = p[0][0];
        
        for (int i = 1; i < p.length; i++) {
            if (p[i][0] - j <= w);
            else
            {
                count++;
                j = p[i][0];
            }
        }
        
        count++;
        return count;
   
    }
}