class Solution {
    public String shortestPalindrome(String s) {
        int n=s.length();
         String a=s;
        String str= new StringBuilder(s).reverse().toString();
        s=s+"$"+str;
        int[] lps=check(s);
        String ans="";
        for(int i=n-1;i>=lps[lps.length-1];i--)
        {
            ans+=a.charAt(i);
        }
        ans+=a;
        return ans;
    }
    public  int [] check(String s)
	{
	    int n=s.length();
	    int [] lps =new int[n];
         int i=1;
	    int length=0;
	    while(i<n)
	    {
	        if(s.charAt(i)==s.charAt(length))
	        {
	            length++;
	            lps[i]=length;
	            i++;
	        }
	        else {
	            if(length!=0)
	            {
	                length=lps[length-1];
	            }
	            else
	            {
	                lps[i]=0;
	                i++;
	            }
	        }
	    }
	   return lps;
	}
}