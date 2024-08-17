class Solution {
    public int[] resultsArray(int[] a, int b) {
        int c = a.length;
        int[] d = new int[c - b + 1];
        boolean e = true;
        int f = a[0];
        for (int g = 1; g < b; g++) 
        {
            if (a[g] != a[g - 1] + 1) 
            {
                e = false;
            }
            f = Math.max(f, a[g]);
        }
        d[0] = e ? f : -1;
        for (int g = 1; g <= c - b; g++) 
        {
            if (a[g + b - 1] == a[g + b - 2] + 1 && e) 
            {
                f = Math.max(f, a[g + b - 1]);
                d[g] = f;
            } 
            else 
            {
                e = true;
                f = a[g];
                for (int h = g + 1; h < g + b; h++) 
                {
                    if (a[h] != a[h - 1] + 1) 
                    {
                        e = false;
                        break;
                    }
                    f = Math.max(f, a[h]);
                }
                d[g] = e ? f : -1;
            }
        }
        return d;
    }
}