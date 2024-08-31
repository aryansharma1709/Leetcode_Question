class Solution {
    public int generateKey(int num1, int num2, int num3) {
        int ans=0;
        int c=1;
     for(int i=0;i<4;i++)
     {
        int  rem1=num1%10;
         int rem2=num2%10;
        int  rem3=num3%10;
       int min=Math.min(rem1,rem2);
        min=Math.min(rem3,min);
        ans+=min*c;
         num1/=10;
         num2/=10;
         num3/=10;
         c*=10;
     }
     return ans;
    }
}