class Solution {
    public int longestMonotonicSubarray(int[] nums) {
    
        int c_dec=1;
        int c_inc=1;
        int max=1;
        for(int i=1;i<nums.length;i++)
        {
             if(nums[i-1]<nums[i])
                 c_inc+=1;
            else
                c_inc=1;
            if(nums[i-1]>nums[i])
                c_dec+=1;
            else
                c_dec=1;
            max=Math.max(max,c_inc);
            max=Math.max(c_dec,max);
        }
        return max;
    }
}