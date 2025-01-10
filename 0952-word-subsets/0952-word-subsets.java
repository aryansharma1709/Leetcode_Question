
class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2){
        List<String> l=new ArrayList<>();
        Map<Character,Integer> m2 = new HashMap<>();
        for (String word:words2)
         {
            Map<Character,Integer> tempm2 = new HashMap<>();
            for (char ch : word.toCharArray())
            {
                    tempm2.put(ch,tempm2.getOrDefault(ch, 0)+1);
            }
            for (Map.Entry<Character, Integer> pair:tempm2.entrySet())
             {
                char ch=pair.getKey();
                int freq=pair.getValue();
                m2.put(ch, Math.max(m2.getOrDefault(ch,0),freq));
            }
        }
        for (String word:words1) 
        {
            Map<Character, Integer> m1=new HashMap<>();
            for (char ch : word.toCharArray())
             {
                m1.put(ch, m1.getOrDefault(ch, 0)+1);
            }

            boolean flag=true;
            for (Map.Entry<Character, Integer> pair:m2.entrySet()) 
            {
                char ch=pair.getKey();
                int freq=pair.getValue();
                if (m1.getOrDefault(ch, 0)<freq) 
                {
                    flag=false;
                    break;
                }
            }

            if (flag) {
                l.add(word);
            }
        }

        return l;
    }
}
