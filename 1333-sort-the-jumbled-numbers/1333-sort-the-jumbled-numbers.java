class Solution {
    public int[] sortJumbled(int[] mapping, int[] nums) {
        Integer[]n= new Integer[nums.length];
         for(int i=0;i<nums.length;i++)
         {
            n[i]=nums[i];
         } 
        Arrays.sort(n, (i, j) -> Integer.compare(change(i, mapping), change(j, mapping)));
        for(int i=0;i<n.length;i++)
        {
            nums[i]=n[i];
        }
         return nums;
    }
    public int change(int x,int[]mapping)
    {   
        if (x==0){
            return mapping[0];
        }
        int ans=0;
        int p=1;
        while(x>0)
        {
             ans+=((mapping[x%10])*p);
             p*=10;
            x/=10;
        }
        return ans;
    }
}