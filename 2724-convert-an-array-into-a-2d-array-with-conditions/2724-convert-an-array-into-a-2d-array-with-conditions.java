class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> l=new ArrayList<>();
        Map<Integer,Integer> m = new HashMap<>();
        for(int i:nums)
        {
           m.put(i,m.getOrDefault(i,0)+1);
        }
        int max=0;
        for(int i:m.values())
        max=Math.max(max,i);
        for(int i=0;i<max;i++)
        l.add(new ArrayList<>());
        for (Map.Entry<Integer, Integer> entry :m.entrySet()){
            int num=entry.getKey();
            int count=entry.getValue();
            for (int i=0; i<count; i++) {
                l.get(i).add(num);
            }
        }

        return l;
    }
}