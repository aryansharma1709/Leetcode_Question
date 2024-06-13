class Solution {
    public int minMovesToSeat(int[] s, int[] st) {
        int ans=0;
        Arrays.sort(s);
        Arrays.sort(st);
     for(int i=0;i<s.length;i++) {ans+=Math.abs(s[i]-st[i]);}
     return ans;
    }
}