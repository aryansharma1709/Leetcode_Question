class Solution {
    public List<List<Integer>> groupThePeople(int[] g) {
        List<List<Integer>> l=new ArrayList<>();
        Map<Integer,ArrayList<Integer>> m=new HashMap<>();
        for(int i=0;i<g.length;i++)
        {
            if(!m.containsKey(g[i]))
            m.put(g[i],new ArrayList<>());
            m.get(g[i]).add(i);
        }
        for(Integer i:m.keySet())      
        { 
            int j=0;
            while(j!=m.get(i).size())
            {
                 List<Integer>temp=new ArrayList<>();
                 while(temp.size()!=i)
                         {
                            temp.add(m.get(i).get(j));
                                j++;
                         }
                  l.add(new ArrayList<>(temp));
           }
        }
     return l;
    }
}