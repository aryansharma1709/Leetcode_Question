class Solution {
    public int[] findArray(int[] pref) {
        int[] a=new int[pref.length];
        a[0]=pref[0];
        int ans=pref[0];
        for(int i=1;i<pref.length;i++)
        {
           a[i]=ans^pref[i];
           ans=pref[i];
        }
        return a;
    }
}