class Solution {
    public boolean doesAliceWin(String s) {
        String s1="";
        for(int i=0;i<s.length();i++)
        {
           if(s.charAt(i)=='a'||s.charAt(i)=='e'|| s.charAt(i)=='i'||s.charAt(i)=='o' || s.charAt(i)=='u')
           s1+=s.charAt(i);
        }
        if(s1.length()==0)
        return false;
        return true;

    }
}