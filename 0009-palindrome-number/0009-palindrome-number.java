class Solution {
    public boolean isPalindrome(int x) {
        int ans=x;
        if(x<0)
        return false;
        int sum=0;
        int c=(int)Math.log10(x);
        long power=(long)Math.pow(10,c);
        while(x>0)
        {
            sum+=((x%10)*power);
            x/=10;
            power/=10;
        }
      if(sum==ans)return true ;
       return false;
    }
}