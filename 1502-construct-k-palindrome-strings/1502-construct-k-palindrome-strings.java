class Solution {
    public boolean canConstruct(String s, int k) {
        Map<Character, Integer> m=new HashMap<>();
        if(k>s.length())
         return false;
        int c=0;
        for(char ch:s.toCharArray())
        {
            m.put(ch,m.getOrDefault(ch,0)+1);
        }
        for(Character ch: m.keySet())
        {
            if(m.get(ch)%2!=0)c++;;
            
        }
        return c<=k;
    }
}