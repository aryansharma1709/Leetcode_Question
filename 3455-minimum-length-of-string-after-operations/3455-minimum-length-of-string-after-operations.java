class Solution {
    public int minimumLength(String s) {
        if(s.length()<=2)
        return s.length();
        char[] ch=s.toCharArray();
        Map<Character,Integer> m= new HashMap<>();
        for (char c:ch) {
                m.put(c,m.getOrDefault(c,0)+ 1);
        }
        int sum=0;
        int j=0;
        for ( Integer i:m.values()) {
              j=i%2==0? 2:1;
             sum+=j;
        }
        return sum;
    }
}