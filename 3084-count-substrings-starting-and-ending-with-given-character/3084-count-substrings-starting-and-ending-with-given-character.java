class Solution {
    public long countSubstrings(String s, char c) {
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==c)
                count+=1;
        }
        long sum=0;
        for(int i=count;i>=1;i--)
        {
            sum+=i;
        }
        return sum;
    }
}