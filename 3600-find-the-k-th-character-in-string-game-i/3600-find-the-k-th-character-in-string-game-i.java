class Solution {
    public char kthCharacter(int k) {
       String w="a";
        return findWord(k,w);
    }
    public static char findWord(int k,String w)
    {
        if(w.length()>=k)
        {
            return w.charAt(k-1);
        }
        String nw="";
        for(char ch:w.toCharArray())
        {
            nw+=(char)(ch+1);
        }
        return  findWord(k,w+nw);
    }
}