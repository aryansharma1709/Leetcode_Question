class Solution {
    public int maxScore(String s) {
        int left=0;
        int right=0;
        for(char i:s.toCharArray())
         if(i=='1')right++;
        int max=0;
        for(int i=0;i<s.length()-1;i++)
        {
            if(s.charAt(i)=='0')left++;
            else right--;
            max=Math.max(max,(left+right));
        }
        return max;
    }
}