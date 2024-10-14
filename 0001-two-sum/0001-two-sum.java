class Solution {
    public int[] twoSum(int[] a, int t) {
        int []b=new int[2];
         Map<Integer,Integer> p=new HashMap<>();
      for(int i=0;i<a.length;i++)
      {
          
          if(p.containsKey(t-a[i]))
          {
              b[0]=p.get(t-a[i]);
              b[1]=i;
              return b;
          }
          else
          {
              p.put(a[i],i);
          }
      }
      return b;
        
    }
}