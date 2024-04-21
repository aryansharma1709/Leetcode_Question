class Solution {
    public int numberOfSpecialChars(String w) {
        int c=0;
        for(int i=0;i<w.length();i++)
        {
            if(w.charAt(i)>=65 && w.charAt(i)<=90)
            continue;
            for(int j=0;j<w.length();j++)
            {
                if(w.charAt(j)>=65 && w.charAt(j)<=90 && w.charAt(i)-32 ==w.charAt(j))
               {
                 c++;
                w=  w.replace(w.charAt(i),'0');
                  break;
               }
            }
        }
        return c;
    }
}