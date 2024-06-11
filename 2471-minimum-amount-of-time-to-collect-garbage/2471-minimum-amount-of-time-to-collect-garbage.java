class Solution {
    public int garbageCollection(String[] gar, int[] t) {
        int n = gar.length;
        int ans = 0;
        int G_home = 0;
        int P_home = 0;
        int M_home = 0;
        for (int i = 0; i < n; i++) {
            String str = gar[i];
            int str_len = str.length();
            if (gar[i].contains("G")) {
                int G_len = str_len - str.replace("G", "").length();
                // System.out.println(G_len+"G");
                ans += G_len;
                G_home = i;
            }
            if (gar[i].contains("P")) {
                int P_len = str_len - str.replace("P", "").length();
                // System.out.println(P_len+"p");
                ans += P_len;
                P_home = i;
            }
            if (gar[i].contains("M")) {
                int M_len = str_len - str.replace("M", "").length();

                // System.out.println(M_len+"M");
                ans += M_len;
                M_home = i;
            }
        }
        for (int i = 0; i < n; i++) {
            if (i < G_home)
                ans += t[i];
            if (i < P_home)
                ans += t[i];
            if (i < M_home)
                ans += t[i];
        }
        return ans;
    }
}