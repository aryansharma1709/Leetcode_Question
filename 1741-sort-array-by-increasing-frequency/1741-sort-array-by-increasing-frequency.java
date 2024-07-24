class Solution {
    public int[] frequencySort(int[] nums) {
       Map<Integer,Integer> m=new HashMap<>();
       Integer []n=new Integer[nums.length];
       for(int i=0;i<nums.length;i++)
       {
          m.put(nums[i],m.getOrDefault(nums[i],0)+1);
          n[i]=nums[i];
       }
           Arrays.sort(n,(i,j)->{
               if (m.get(i).equals(m.get(j)))
               {
                return j-i; 
               } 
               else 
               {
                return m.get(i)-m.get(j); 
                }
           });
           for(int i=0;i<nums.length;i++)
           {
             nums[i]=n[i];
           }
           return nums;
    }
}