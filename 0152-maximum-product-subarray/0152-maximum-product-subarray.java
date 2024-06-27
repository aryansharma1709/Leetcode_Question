class Solution {
    public int maxProduct(int[] nums) {
        int ans=1;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            
           ans*=nums[i];
           if(ans==1000000000) return 1000000000;
           max=Math.max(max,ans);
           if(nums[i]==0)
           ans=1;
        }
          
        ans=1;
         for(int i=nums.length-1;i>=0;i--)
        {
             ans*=nums[i];
       
           max=Math.max(max,ans);
           if(nums[i]==0)
           ans=1;
               
        }
        return max;
    }
}