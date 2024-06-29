class Solution {
    public char findTheDifference(String s, String t) {
        // int a[]=new int[26];
        long a=0;
        long b=0;
        for(int i=0;i<t.length();i++)
        {
            a+=t.charAt(i)-'a';
        }
        for(int i=0;i<s.length();i++)
        {
              b+=s.charAt(i)-'a';
        }
        //  for(int i=0;i<a.length;i++)
        //  {
        //     if(a[i]!=0)
        //     return (char)(97+i);
        //  }
         return (char)(97+(a-b));
    }
}