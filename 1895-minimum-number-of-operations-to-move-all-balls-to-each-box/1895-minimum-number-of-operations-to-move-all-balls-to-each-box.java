class Solution {
    public int[] minOperations(String s) {
        int n = s.length();
        char[] a = s.toCharArray();
        int[] ans = new int[n];
        int c = 0;
        int x = 0;
        // pref
        for(int i = 0; i < n; i++){
            // first initialise
            ans[i] += x;
            // System.out.print(" prefix "+ans[i]);
            if(a[i] == '1')
                c++;
            x += c;
        }
        // suff
        c = 0;
        x = 0;
        System.out.println();
        for(int i = n-1; i >= 0; i--){
            // first initialise
            ans[i] += x;
            // System.out.print(" suffix "+ans[i]);
            if(a[i] == '1')
                c++;
            x += c;
        }
        return ans;
    }
}