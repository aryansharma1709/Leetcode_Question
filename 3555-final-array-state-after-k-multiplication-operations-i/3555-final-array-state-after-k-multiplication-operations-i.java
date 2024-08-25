class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        int n=nums.length;
        while(k-->0)
        {
          int idx=-1;
          int min=Integer.MAX_VALUE;
            for(int i=0;i<n;i++)
           {
            if (nums[i]<min)
                {
                    min=nums[i];
                    idx=i;
                }
           }
           nums[idx]=min*multiplier;
        }
        return nums;
    }
}