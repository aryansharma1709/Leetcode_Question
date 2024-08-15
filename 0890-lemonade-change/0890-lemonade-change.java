class Solution {
    public boolean lemonadeChange(int[] bills) {
        int n=bills.length;
        if(n==1 && (bills[0]==10 || bills[0]==20)) return false;
        int c_5=0;
        int c_10=0;
        for(int i=0;i<n;i++)
        {
            if(bills[i]==5)
            {
                c_5++;
            }
            else if(bills[i]==10 && c_5>0)
            {
                c_10++;
                c_5--;
            }
            else if(bills[i]==20 && (c_5>0 && c_10>0 )){
                c_5--;
                c_10--;
            }
            else if(bills[i]==20 && c_5>=3)
            {
                c_5-=3;
            }
            else{
                
                return false;
            }

        }
        return true;
    }
}