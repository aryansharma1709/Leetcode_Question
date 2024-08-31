class Solution {
    public String stringHash(String s, int k) {
        int n=s.length();
        int c=1;
        int ans=0;
        String b="";
        for(int i=0;i<n;i++)
        {
            if(c<=k)
            {
                ans+= (int)s.charAt(i)-97;
            }
            else
            {
              ans=ans%26;
               b=b+(char)(97+ans);
               c=1;
               ans=(int)s.charAt(i)-97;
            }
            c++;
        }
        ans=ans%26;
        b=b+(char)(97+ans);
       return b;
    }
}