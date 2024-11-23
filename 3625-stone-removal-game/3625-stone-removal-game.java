class Solution {
    public boolean canAliceWin(int n) {
        if(n<10) return false;
        int remove=10;
        int i=0;
       while(n>=remove)
       {
         if(i%2==0 && n-remove<0)
          return false;
         if(i%2!=0 && n-remove<0)
           return true;
          i++;
          n-=remove;
          remove--;
       }
       if(i%2!=0)
      return true;
      return false;
    }
}