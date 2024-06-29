class Solution {
    public int lastRemaining(int n) {
       int s=1;
       int step=2;
       int d=1;
       while(n>1)
       {
         s+=d*(step*(n/2)-step/2);
        d*=-1;
        step*=2;
        n/=2;
       }
       return s;
    }
}