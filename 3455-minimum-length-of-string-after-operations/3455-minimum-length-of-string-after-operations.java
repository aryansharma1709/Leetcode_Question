class Solution {
    public int minimumLength(String s) {
        if(s.length()<=2)
        return s.length();
      int [] ch=new int[26];
      int sum=0;
      for(char str:s.toCharArray())
      {
         ch[str-'a']++;
      }
      for(int i=0;i<26;i++)
      {
        if(ch[i]!=0)
       { 
        sum=sum+(ch[i]%2==0?2:1);
       }
      }
      return sum;
    }
}