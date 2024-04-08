class Solution {
    public int findNthDigit(int n) {
        long dig=1;
        long num=9;
        long b=10;
        while(n>num)
        {
            dig++;
            n-=num;
            num=(dig*9)*(b);
            b*=10;
        }
        long  q= (long)Math.ceil(n/(double)dig);
        b/=10;
        long r= b+(q-1);
        long c=n%dig;
        String s=""+r;
        if(c==0)
        {
            c=s.length();
        }
        c=c-1;
        return s.charAt((int)c)-'0';

    }
}