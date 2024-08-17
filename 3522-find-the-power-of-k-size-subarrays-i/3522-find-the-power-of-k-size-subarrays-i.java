class Solution {
    public int[] resultsArray(int[] nums, int k) {
          int n=nums.length;
        int[]ans=new int[n-k+1];
        
        for (int i=0; i<=n-k; i++)
        {
            boolean sort=true;
            int max=nums[i];
            
            for (int j=i+1; j<i+k; j++)
            {
                if (nums[j]!=nums[j-1]+1)
                {
                    sort=false;
                    break;
                }
                max=Math.max(max,nums[j]);
            }
            
            if (sort)
              {
                ans[i] = max;
              } 
            else 
              {
                ans[i] = -1;
              }
        }
        
        return ans;
    }
}