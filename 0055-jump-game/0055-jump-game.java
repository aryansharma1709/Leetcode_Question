class Solution {
    public boolean canJump(int[] nums) {
         int n=nums.length;
        int i=0;
        int k=0;
        while(i<n-1)
        {
            int max=0;
            for(int j=k;j<=i;j++)
            {
                
                    max=Math.max(j+nums[j],max);
                    
            }
            k=i+1;
            i=max;
            if(k>i)
            return false;
        }
        return true;
    }
}